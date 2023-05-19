'''
5. Using for loop, write and run a Python program to find factorial from 0 to
10.
'''
num = int(input("give input for fact"))
fact=1
for i in range(1,(num+1)) :

    fact =  fact * i
    print(f" fact are = {fact}")

