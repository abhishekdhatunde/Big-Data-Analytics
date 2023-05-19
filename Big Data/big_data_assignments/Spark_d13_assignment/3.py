#!/usr/bin/python3

from pyspark.sql import SparkSession

spark = SparkSession.builder.getOrCreate()

emp_filepath = 'file:///home/niranjan/Desktop/dbda/Big_Data/data/emp.csv'
dept_filepath = 'file:///home/niranjan/Desktop/dbda/Big_Data/data/dept.csv'

emps_schema = 'empno INT, ename STRING, job STRING, mgr INT, hire DATE, sal DOUBLE, comm DOUBLE, deptno INT'
dept_schema = 'deptno INT, dname STRING, city STRING'

emps = spark.read.schema(emps_schema).option('nullValue', 'NULL').csv(emp_filepath)
depts = spark.read.schema(dept_schema).csv(dept_filepath)

# emps.show(truncate=False)
# depts.show(truncate=False)

depts\
    .join(emps, [emps.deptno == depts.deptno])\
    .groupBy('dname')\
    .sum('sal')\
    .show(truncate=False)

spark.stop()
