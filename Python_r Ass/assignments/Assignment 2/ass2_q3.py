#3. Replace single element ‘b’ in given list ['a', 'b', 'c', 'd', 'e'] with [1, 2, 3]

list1 = ['a', 'b', 'c', 'd', 'e']
lis=list1.index('b')
list1[lis]=[1,2,3]
print(list1)