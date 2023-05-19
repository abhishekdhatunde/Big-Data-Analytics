'''
Q.No.2 Daily Closing Prices of Two Stocks arranged as per returns. So calculate Covariance using R,Python and Formula.

	x: 1.8 , 1.5, 2.1 , 2.4 , 0.2
	y: 2.5 , 4.3 , 4.5 , 4.1 ,2.2
'''

import numpy as np

x = [1.8 , 1.5, 2.1 , 2.4 , 0.2]
y = [2.5 , 4.3 , 4.5 , 4.1 ,2.2]

cov = np.cov(x, y)
print(cov[0][1])

t_x = np.sum(x) / len(x)
t_y = np.sum(y) / len(y)

mean_x = list(map(lambda v : v - t_x,x))
mean_y = list(map(lambda v : v - t_y,y))

avg = [a*b for a,b in zip(mean_x,mean_y)]
cov = np.sum(avg) / (len(avg)-1)
print(cov)