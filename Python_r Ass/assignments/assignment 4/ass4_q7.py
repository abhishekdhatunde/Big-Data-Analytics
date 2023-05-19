'''
7. Write a program to sum all the values of a dictionary.
 Hint dict1 = {‘key 1’: 200, ‘key 2’: 300} Expected output Result: 500
'''

def dictionary():
    dict = {}
    give = int(input("how many values you want write"))
    for i in range(give):
        age = int(input("enter your number"))
        dict[i]=age

    sum=0
    for i in range(give):
        sum += dict[i]
    print(sum)

dictionary()