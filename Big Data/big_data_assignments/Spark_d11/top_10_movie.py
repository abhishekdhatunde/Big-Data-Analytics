from pyspark import SparkConf
from pyspark import SparkContext

conf = SparkConf().setMaster('spark://localhost:7077')

sc = SparkContext(conf=conf)


def csv_parser(line):
    try:
        parts = line.split(',')
        return int(parts[0]), float(parts[2])
    except:
        pass


filepath = 'hdfs://localhost:9000/user/hive/warehouse/dbda.db/ratings_staging'

results = sc.textFile(filepath) \
    .map(csv_parser) \
    .filter(lambda tup: tup is not None) \
    .map(lambda movie_rating: (movie_rating[0], 1)) \
    .reduceByKey(lambda a, x: a + x) \
    .sortBy(lambda movie_count: movie_count[1], ascending=False) \
    .take(10)

for row in results:
    print(row)

sc.stop()
