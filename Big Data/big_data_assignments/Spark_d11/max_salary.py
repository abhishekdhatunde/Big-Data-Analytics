from pyspark import SparkConf
from pyspark import SparkContext

conf = SparkConf().setMaster('spark://localhost:7077')

sc = SparkContext(conf=conf)


def csv_parser(line):
    parts = line.split(',')
    return int(parts[7]), float(parts[5])


filepath = 'hdfs://localhost:9000/data/emp.csv'

results = sc.textFile(filepath)\
    .map(csv_parser)\
    .reduceByKey(max)\
    .collect()

for row in results:
    print(row)

sc.stop()
