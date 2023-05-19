'''
5. Write a program in Python to read a string from the keyboard. Replace each ‘this’ word
with ‘that word’ in this
String.
Example: this is me and this is my python program.
Output: That is me and That is my python program.
'''

def replacefun():

    user_input = input(" please enter sentence ").lower()

    replace1 = user_input.replace("this", "That")
    print(replace1)

replacefun()