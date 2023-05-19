'''
1. Write a python program to print sum of tuple elelments.
'''

def sum():
    t1 = (1,2,3,4,5,6)
    sum = 0
    for i in range(len(t1)):
        sum = sum + t1[i]

    print(f"sum = {sum}")

sum()

