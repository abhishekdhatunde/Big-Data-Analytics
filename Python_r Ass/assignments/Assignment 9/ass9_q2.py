'''
Computation class:
1 - Create a Coputation class with a default constructor (without parameters) allowing to perform various calculations on integers numbers.
2 - Create a method called Factorial() which allows to calculate the factorial of an integer. Test the method by instantiating the class.
3 - Create a method called Sum() allowing to calculate the sum of the first n integers 1 + 2 + 3 + .. + n. Test this method.
4 - Create a method called testPrim() in the Calculation class to test the primality of a given integer. Test this method.
4 - Create a method called testPrims() allowing to test if two numbers are prime between them.
5 - Create a tableMult() method which creates and displays the multiplication table of a given integer. Then create an
 allTablesMult() method to display all the integer multiplication tables 1, 2, 3, ..., 9.
'''

class Computation:
    def factorial(self,num):
        total =1
        for i in range(1, num+1):
            total = total*i
        print(total)

    def Sum(self,num1):
        total1 = 0
        for i in range(num1 + 1):
            total1 += i
        return total1

    def testPrim(self,num2):
        count = False
        for index in range(2,num2+1):
            if num2%index == 0:
                count = True
                print(" It is not prime number")
        print("It is prime number")

    def testPrims(self,num3):
        count = False
        for index in range(2,num3 + 1):
            if num3 % index == 0:
                count = True
                if num3 % 2 == 0:
                    return print("it is divisible by prime")

    def tableMult(self,num4):
        for index in range(1,11):
            mult = num4 * index
            print(f"{num4} * {index} = {mult}")

    def allTablesMult(self):
        for index in range(1,10):
            for index1 in range(1,11):
                mult = index1 * index
                print(f"{index} * {index1} = {mult}")

c1 = Computation()
c1.factorial(5)
print(c1.Sum(5))
print(c1.testPrim(5))
print(c1.tableMult(5))
print(c1.allTablesMult())
