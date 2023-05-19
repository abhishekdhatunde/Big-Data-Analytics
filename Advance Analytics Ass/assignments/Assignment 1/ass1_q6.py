'''
Q.6] Write a Pandas program to convert a dictionary to a Pandas series.

SSample dictionary: d1 = {'a': 100, 'b': 200, 'c':300, 'd':400, 'e':800}
'''

import pandas as pd

d1 = {'a': 100, 'b': 200, 'c':300, 'd':400, 'e':800}
sep = pd.Series(d1)
print(sep)