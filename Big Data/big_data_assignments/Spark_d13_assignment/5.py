from pyspark.sql import SparkSession

spark = SparkSession.builder.getOrCreate()

movies_filepath = 'file:///home/niranjan/Desktop/dbda/Big_Data/data/movies/movies.csv'
ratings_filepath = 'file:///home/niranjan/Desktop/dbda/Big_Data/data/movies/ratings.csv'

movies = spark.read.options(header=True, inferSchema=True).csv(movies_filepath)
# movies.printSchema()
# movies.show(truncate=False)

ratings1_schema = 'userId1 integer, movieId1 integer, rating1 double, timestamp1 integer'
ratings1 = spark.read.schema(ratings1_schema).options(header=True).csv(ratings_filepath)
ratings2_schema = 'userId2 integer, movieId2 integer, rating2 double, timestamp2 integer'
ratings2 = spark.read.schema(ratings2_schema).options(header=True).csv(ratings_filepath)
# ratings1.printSchema()
# ratings.show(truncate=False)

# ratings.join(ratings, [ratings.movieId == ratings.movieId]).where('userId < userId').show(truncate=False)
join_results = ratings1\
 .join(ratings2, [ratings1.movieId1 == ratings2.movieId2])\
 .where('userId1 < userId2')\
 .select('movieId1', 'movieId2', 'rating1', 'rating2')\

join_results.createOrReplaceTempView('v_joined')

join_results.selectExpr("movieId1", " movieId2", "corr('rating1', 'rating2')").show(truncate=False)
spark.stop()
