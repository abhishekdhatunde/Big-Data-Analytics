'''
Q.7] Given a numpy array whose underlying data is of 'int32' type. Change the dtype of the given object to 'float64'.
arr = [10, 20, 30, 40, 50]
'''
import numpy as np

arr = [10, 20, 30, 40, 50]
rep = np.array(arr, dtype=np.float64)
print(rep)
