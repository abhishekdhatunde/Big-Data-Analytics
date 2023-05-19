'''
Write a program that rotates the element of a list so that the element at the first index moves to the second index, the element in the second index moves to the third index, etc., and the element in the last index moves to the first index.
 Input:- [‘Sunday’,’Monday’,’Tuesday’,’Wednesday’] Output:- [’Wednesday’, ‘Sunday’, ’Monday’, ’Tuesday’]
'''

list = ['Sunday', 'Monday', 'Tuesday', 'Wednesday']
list1 = []
print(f" Old list : {list}")
word = list.pop(3)
list1.append(word)
for index in list:
    list1.append(index)
print(f" New list : {list1}")
