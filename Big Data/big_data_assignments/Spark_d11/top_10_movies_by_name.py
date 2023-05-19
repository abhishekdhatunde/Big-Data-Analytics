#!/usr/bin/python3

from pyspark import SparkConf, SparkContext

conf = SparkConf()

sc = SparkContext(conf=conf)

movies = sc.textFile('file:///home/niranjan/Desktop/dbda/Big Data/data/movies/movies_caret.csv').collect()

print(movies)

sc.stop()
