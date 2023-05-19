'''
3. Create two classes:
A:- Author: authorName ,age,place
B:- Book: name ,price
C:- relationship: Book has-an Author
D:-add print method in Both class
'''

class Author:
    def __init__(self, authorName , age,place):
        self.authorName = authorName
        self.age = age
        self.place = place

    def view(self):
        print(self.authorName)
        print(self.age)
        print(self.place)


class Book:
    def __init__(self, name, price, authorName , age,place):
        self.name = name
        self.price = price
        self.book= Book( authorName , age,place)

    def view(self):
        print(self.name)
        print(self.price)

authorName = input("enter authorName")
age = input("enter age ")
place = input("enter place")
name = input("enter name")
price = input("enter price")

b1 = Book(authorName,age,place ,name,price)
b1.view()