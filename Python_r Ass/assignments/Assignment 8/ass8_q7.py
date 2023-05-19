'''
7:- Write a program that accepts a list from user and print the alternate element of list
'''

list = []
num = int(input("how many inputs you want to add"))

for index in range(num):
    user = input("please enter a input")
    list.append(user)

print(list[::2])
