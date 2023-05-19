#!/usr/bin/python3

from pyspark import SparkConf, SparkContext

conf = SparkConf().setMaster('local')

sc = SparkContext(conf=conf)

movies_filepath = 'hdfs://localhost:9000/data/movies/movies_caret.csv'


def csv_parser(line):
    try:
        parts = line.split('^')
        return parts[2]
    except:
        pass


def splitter(genre):
    try:
        genres = genre.split('|')
        return genres
    except:
        return genre


movies = sc.textFile(movies_filepath)\
    .map(csv_parser)\
    .flatMap(splitter)\
    .map(lambda genre: (genre, 1))\
    .reduceByKey(lambda a, x: a+x)\
    .sortBy(lambda tup: tup[1], ascending=False)\

movies.foreach(print)

sc.stop()
