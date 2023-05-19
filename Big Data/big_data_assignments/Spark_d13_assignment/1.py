from pyspark.sql import SparkSession

spark = SparkSession.builder.getOrCreate()

filepath = 'file:///home/niranjan/hadoop-3.3.2/LICENSE.txt'

txt = spark.read.text(filepath)

results = txt.select(txt.colRegex("value"))

result = results.selectExpr("lower(value) AS text")

res = result.selectExpr("explode(split(text,' ')) AS word")\
    .where('''length(word) > 1 AND word NOT IN ("a","an","the","of","or", "and","to","any","work","you","for","in",
    "that","by", "this")''')\
    .groupBy('word').count()\
    .orderBy('count', ascending=False).show(n=10, truncate=False)

print(result)

spark.stop()
