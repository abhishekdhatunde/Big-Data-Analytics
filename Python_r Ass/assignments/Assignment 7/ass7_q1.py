'''

1 - Define a Circle class allowing to create a circleC (O, r) with center O(a, b) and radius r using the
constructor:
def init (self,a,b,r):
self.a = a
self.b = b
self.r = r
A:- Define a Area() method of the class which calculates the area of the circle.
B:-Define a Perimeter() method of the class which allows you to calculate the perimeter of
the circle.

'''

class Circle:
    def __init__(self, r):
        # self.a = a
        # self.b = b
        self.r = r

    def area(self):
        area = 3.14 ** self.r
        return print(f"area will be {area}")

    def perimeter(self):
        perimeter = 2 * 3.14 * self.r
        return print(f"perimeter will be {perimeter}")
c1 = Circle(2)
c1.area()
c1.perimeter()



