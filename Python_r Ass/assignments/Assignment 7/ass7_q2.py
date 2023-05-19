'''
2. Define a Book class with the following attributes: Title, Author (Full name), Price.
A:- Define a constructor used to initialize the attributes of the method with values entered by
the user.
B:-The View() method to display information for the current book.
C:-Write a program to testing the Book class.
'''

class Book:
    def __init__(self, title, author, price):
        self.title = title
        self.author = author
        self.price = price

    def view(self):
        print(self.title)
        print(self.author)
        print(self.price)

title = input("enter title")
author = input("enter author ")
price = input("enter price")
b1 = Book(title,author,price)
b1.view()