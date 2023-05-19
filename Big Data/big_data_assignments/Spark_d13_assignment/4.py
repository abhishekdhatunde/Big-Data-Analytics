#!/usr/bin/python3

from pyspark.sql import SparkSession
from pyspark.sql.functions import from_unixtime, year

spark = SparkSession.builder.getOrCreate()

filepath = 'file:///home/niranjan/Desktop/dbda/Big_Data/data/movies/ratings.csv'

ratings = spark.read.option('header', 'true').option('inferSchema', 'true').csv(filepath)
# ratings.printSchema()
# ratings.show(truncate=False)

ratings\
    .select(year(from_unixtime('timestamp')).alias('yr'))\
    .groupBy('yr').count()\
    .orderBy('count', ascending=False)\
    .show(truncate=False)

spark.stop()
