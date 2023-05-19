#!/usr/bin/python3

from pyspark import SparkContext, SparkConf

conf = SparkConf().setMaster('local')

sc = SparkContext(conf=conf)

ratings_filepath = 'hdfs://localhost:9000/data/movies/ratings.csv'
movies_filepath = 'hdfs://localhost:9000/data/movies/movies_caret.csv'


def rating_parser(line):
    try:
        parts = line.split(',')
        return int(parts[1]), 1
    except:
        pass


ratings = sc.textFile(ratings_filepath) \
    .map(rating_parser) \
    .filter(lambda tup: tup is not None)\
    .reduceByKey(lambda a, x: a + x)\
    .sortBy(lambda tup: tup[1], ascending=False)\
    .take(5)

print(ratings)


def movie_parser(line):
    try:
        parts = line.split('^')
        return int(parts[0]), parts[1]
    except:
        pass


movies = sc.textFile(movies_filepath)\
    .map(movie_parser)\
    .filter(lambda tup: tup is not None)\

for rating in ratings:
    print(movies.lookup(rating[0]))

sc.stop()
