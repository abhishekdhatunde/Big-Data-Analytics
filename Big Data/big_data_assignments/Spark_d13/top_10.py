from pyspark.sql import SparkSession

spark = SparkSession.builder \
    .config('spark.sql.shuffle.partitions', '4') \
    .getOrCreate()

movie_file_path = 'file:////home/niranjan/Desktop/dbda/Big Data/data/movies/movies.csv'
movies = spark.read \
    .option('delimiter', ',') \
    .option('header', 'true') \
    .option('inferSchema', 'true') \
    .csv(movie_file_path)
movies.printSchema()

rating_file_path = 'file:////home/niranjan/Desktop/dbda/Big Data/data/movies/ratings.csv'
ratings = spark.read \
    .option('delimiter', ',') \
    .option('header', 'true') \
    .option('inferSchema', 'true') \
    .csv(rating_file_path)
ratings.printSchema()

# result = ratings.join(movies, 'movieId')
result = ratings \
    .join(movies, [ratings.movieId == movies.movieId]) \
    .select('title', 'rating') \
    .groupby('title').count() \
    .orderBy('count', ascending=False) \
    .limit(10)

result.printSchema()

result.show(truncate=False)

spark.stop()
