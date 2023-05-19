'''
Q.5 Convert a 1D array to a 2D array with 2 rows
	Input:
	arr = np.array([0, 1, 2, 3, 4, 5, 6, 7, 8, 9])
'''

import numpy as np

arr = np.array([0, 1, 2, 3, 4, 5, 6, 7, 8, 9])
arr1 = arr.reshape([2,5])
print(arr1)