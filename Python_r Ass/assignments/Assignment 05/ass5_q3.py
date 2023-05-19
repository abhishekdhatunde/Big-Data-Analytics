'''
3. Write a program that contains a function that has one parameter, n, representing an integer
greater than 0. The function should return n! (n factorial). Then write a main function that
calls this
function with the values 1 through 20, one at a time, printing the returned results. This is what
your
output should look like:
1
2
6
24
120
720
5040
40320
362880
36288002.
'''

def factorial(num):
        if num>1:
            return num * factorial(num - 1)
        else:
            return 1
def fact():
           num = int(input("give input for fact"))
           for i in range(1, (num+1)):
               print(factorial(i))

fact()

