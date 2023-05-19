'''

Ques1:

Calculate the coefficient of covariance for the following data:

X	2	8	18	20	28	30
Y	5	12	18	23	45	50

So calculate Covariance using Python ,R and Formula.
'''

import numpy as np

x = [2,	8, 18, 20, 28, 30]
y = [5,	12,	18,	23,	45,	50]

cov = np.cov(x, y)
print(cov[0][1])

mean_x = np.sum(x) / len(x)
mean_y = np.sum(y) / len(y)

x_m = list(map(lambda v : v - mean_x , x))
x_y = list(map(lambda v : v - mean_y,y))

cov_p = [a*b for a,b in  zip(x_m,x_y)]
add = np.sum(cov_p)
mean_covp = add / (len(cov_p)-1)
print(mean_covp)



