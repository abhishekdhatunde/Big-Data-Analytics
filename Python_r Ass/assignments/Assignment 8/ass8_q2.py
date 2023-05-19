'''
Que2
Write a Rectangle class in Python language, allowing you to build a rectangle with length and width attributes.
Create a Perimeter() method to calculate the perimeter of the rectangle and a Area() method to calculate the area of the rectangle.
Create a method display() that display the length, width, perimeter and area of an object created using an instantiation on rectangle class.
Create a Parallelepiped child class inheriting from the Rectangle class and with a height attribute and another Volume() method to calculate the volume of the Parallelepiped
'''

class Rectangle:
    def __init__(self, length, width):
        self.length = length
        self.width = width

    def area(self):
      return self.length * self.width

    def perimeter(self):
        return 2 * (self.width + self.length)

    def display(self):
        print(f" Area is {self.area()}")
        print(f" Area is {self.perimeter()}")


class Parallelepiped(Rectangle):
    def __init__(self, height,length, width ):
        Rectangle.__init__(self, length, width)
        self.height = height

    def volume(self):
        vol = self.area() * self.height
        return vol

    def print_details(self):
        Rectangle.display(self)
        print(f"volume is {self.volume()}")

length= int(input("please enter length"))
width = int(input("please enter width"))
height = int(input("please enter height"))
p1 = Parallelepiped(length,width,height)

p1.print_details()