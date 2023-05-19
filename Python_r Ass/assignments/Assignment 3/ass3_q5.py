'''
Python program to find sum of n numbers using for loop
'''

a = int(input("how many numbers do you want to enter"))
list = []
for i in range (0,a):
    b = int(input(f"enter the {i+1} number"))
    list.append(b)

def fun():

    sum1 = 0
    for i in range(a):
        sum1 = sum1 + list[i]

    print(f"sum = {sum1}")

fun()
