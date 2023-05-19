'''
2. Accept the full name from user(Name Middlename Surname) in lowercase and Print
it in title case. NOTE:(Using in-built function)
'''

def user():

    a = input("Please write your full name?").lower()
    b = input("Please write your middle name?").lower()
    c = input("Please write your last name?").lower()

    length=a.split()

    for i in range(len(length)-1):
        a = length[i]
        print(a[0])

    length = b.split()

    for i in range(len(length) - 1):
        b = length[i]
        print(b[0])

    print(f"title = {a[0].upper()}.{b[0].upper()}.{c.upper()}")

user()

