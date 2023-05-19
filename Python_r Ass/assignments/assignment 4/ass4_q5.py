'''
5.Define a procedure histogram() that takes a list of integers and prints a histogram to the screen.
For example, histogram([4, 9, 7]) should print the following:
****
*********
*******
'''
def histogram():

    a =input("enter a number")

    for i in a:
        b = int(i)
        for j in range(b):
            print('*', end="")
        print()
histogram()
#
#     for i in range(len(a)):
#         b = ' '
#         while (i > 0):
#             b += '*'
#             i = i - 1
#         print(b)
#
# histogram()

'''
def histogram():

    a =input("write a numbers")

    for i in range(len(a)):
        b = ' '
        while (i > 0):
            b += '*'
            i = i - 1
        print(b)

histogram()

'''

