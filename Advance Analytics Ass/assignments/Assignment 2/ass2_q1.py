'''
Q.NO.1]    1] Read the data from a jamesbond.csv file from Dataset folder

	2] plot scatter plot where xlable - Year . Ylable - Box Office title - Box Office vs Year
	3] plot scatter plot where xlable - Year . Ylable - Budget title - Budget Vs Year


'''
from matplotlib import pyplot as plt
import pandas as pd

df = pd.read_csv("F:\\GIT DBDA - SUNBEAM\\Advance Analytics\\advanced_analytics_using_statistics\\Assignment\\jamesbond.csv")
print(df)

plt.scatter(df.Year, df['Box Office'])

plt.xlabel("Year")
plt.ylabel('Box')
plt.title('Box Office vs Year')
plt.show()

plt.scatter(df.Year, df.Budget)
plt.xlabel("Year")
plt.ylabel('Budget')
plt.title('Budget Vs Year')

plt.show()