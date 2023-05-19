'''
Q.4 Replace all odd numbers in arr with -1
	Input:
	arr = np.array([0, 1, 2, 3, 4, 5, 6, 7, 8, 9])
'''

import numpy as np

arr = np.array([0, 1, 2, 3, 4, 5, 6, 7, 8, 9])
arr[arr%2!=0] = -1
print(arr)

