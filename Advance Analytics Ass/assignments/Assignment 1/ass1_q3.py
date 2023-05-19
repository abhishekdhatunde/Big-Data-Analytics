'''
Q.3 Extract all odd numbers from arr
	Input:
	arr = np.array([0, 1, 2, 3, 4, 5, 6, 7, 8, 9])
'''

import numpy as np

arr = np.array([0, 1, 2, 3, 4, 5, 6, 7, 8, 9])
print(arr[arr%2!=0])

