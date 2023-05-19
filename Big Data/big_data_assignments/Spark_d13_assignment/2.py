#!/usr/bin/python3

from pyspark.sql import SparkSession

spark = SparkSession.builder.getOrCreate()

filepath = 'file:////home/niranjan/Desktop/dbda/Big_Data/data/emp.csv'

employees_schema = 'empno INT, ename STRING, job STRING, mgr INT, hire DATE, sal DOUBLE, comm DOUBLE, deptno INT'

employees = spark.read.schema(employees_schema).option('nullValue', 'NULL').csv(filepath)
employees.printSchema()

print(employees.groupBy('deptno').max('sal').show(truncate=False))

spark.stop()
