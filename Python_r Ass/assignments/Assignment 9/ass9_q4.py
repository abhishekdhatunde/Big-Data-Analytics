'''
Write a Python Program to Find Product of Values of elements in a Dictionary
Input:-Given dictionary = {'Red': 10, 'Green': 5, 'Blue': 22, 'Yellow': 32, 'Black': 6}
'''


dictionary = {'Red': 10, 'Green': 5, 'Blue': 22, 'Yellow': 32, 'Black': 6}

list = []
for index in dictionary.values():
    list.append(index)
print(f"Values from dictionary are : {list}")
product = 1
for index1 in list:
    product = product * index1
print(f"Product of values from dictionary is {product}")