'''
4:- Write a program that reads a string from keyboard and display:
 * The number of uppercase letters in the string
  * The number of lowercase letters in the string
  * The number of digits in the string
   * The number of whitespace characters in the string
'''

sentence = input("please enter a input")

count_upper = 0
count_lower = 0
count_space = 0
for index in sentence:
    if index.isupper():
        count_lower += 1

    elif index.islower():
        count_upper += 1

    elif index.isspace():
        count_space += 1

print(f"upper letters are {count_lower}")
print(f"upper letters are {count_upper}")
print(f"upper letters are {count_space}")



