'''
1:-Write a Python program to sort a list of tuples using Lambda.
Input
[('English', 88), ('Science', 90), ('Maths', 97), ('Social sciences', 82)]
Expected Output
[('Social sciences', 82), ('English', 88), ('Science', 90), ('Maths', 97)]
'''

list = [('English', 88), ('Science', 90), ('Maths', 97), ('Social sciences', 82)]

list.sort(key= lambda x : x[1])
print(list)
