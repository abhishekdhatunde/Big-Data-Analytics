'''
6. Write a program in Python to remove repetitive items from a list.
 Hint Given num = [2,3,4,5,2,6,3,2] Expected output Result: [2, 3, 4, 5, 6] New list
'''

def rep():
    a = input("enter numbers")
    list1 = []

    for i in a:
        list1.append(int(i))

    b = set(list1)
    print(list(b))

rep()