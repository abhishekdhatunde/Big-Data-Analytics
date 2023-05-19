from pyspark.sql import SparkSession

spark = SparkSession.builder \
    .appName('demo01') \
    .config('spark.sql.shuffle.partitions', '4') \
    .getOrCreate()

file_path = 'file:////home/niranjan/Desktop/dbda/Big Data/data/books_hdr.csv'
books = spark.read \
    .option('delimiter', ',') \
    .option('header', 'true') \
    .option('inferSchema', 'true') \
    .csv(file_path)

result = books \
    .select('subject', 'price') \
    .where("subject IN ('C Programming', 'Java Programming')") \
    .groupBy('subject').sum('price') \
    .orderBy('subject')

result.show()
result.explain(extended=True)

spark.stop()
