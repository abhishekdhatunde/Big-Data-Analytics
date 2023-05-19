from pyspark.sql import SparkSession

spark = SparkSession.builder.getOrCreate()

ncdc = spark.read.text('file:///home/niranjan/Desktop/dbda/Big_Data/data/ncdc')

ncdc.selectExpr('split(value)').show(truncate=False)

spark.stop()
