'''
 Q.NO.2] Read Adler.csv.
	check the number of values missing in rating column
	get the mean value of rating
	replace the missing values with mean of rating column
	check the number of values missing in rating column
	check the mean of rating column after filling the NA records with mean
	add Exrtarating column based on rating* 20
	add Newrating column = rating + Exrtarating
'''

from matplotlib import pyplot as plt
import pandas as pd

df = pd.read_csv("F:\\GIT DBDA - SUNBEAM\\Advance Analytics\\advanced_analytics_using_statistics\\Assignment\\Adler.csv")

print(df.rating.isna().sum())

print(df.rating.mean())

df.rating = df.rating.fillna(df.rating.mean())
print(df.rating )

print(df.isna())

print(df.rating.mean())

df['Exrtarating'] = df.rating * 20

df["Networking"] = df.rating + df['Exrtarating']

print(df)
