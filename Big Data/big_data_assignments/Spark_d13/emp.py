from pyspark.sql import SparkSession
from pyspark.sql.functions import *

spark = SparkSession.builder \
    .appName('demo01') \
    .config('spark.sql.shuffle.partitions', '4') \
    .getOrCreate()

file_path = 'file:////home/niranjan/Desktop/dbda/Big Data/data/emp.csv'
emps_schema = 'empno INT, ename STRING, job STRING, mgr INT, hire DATE, sal DOUBLE, comm DOUBLE, deptno INT'
emps = spark.read \
    .schema(emps_schema) \
    .option('header', 'false') \
    .option('inferSchema', 'false') \
    .option('mode', 'DROPMALFORMED') \
    .option('nullValue', 'NULL') \
    .csv(file_path)
emps.printSchema()

result = emps.select('ename', 'sal', 'comm') \
    .withColumn('income', expr('sal + IFNULL(comm, 0.0)'))

result.show(truncate=False)

spark.stop()
