'''
3. Write a function find_longest_word() that takes a list of words and returns
 the length of the longest word and that word itself.
'''

def find_longest_word():

    a = int(input("how many colors do you want to write?"))
    colors = []
    list = []
    for i in range (0, a):
     b = input("write colors?")
     colors.append(b)
     list.append(len(b))

    c = max(list)
    for i in range(0, a):
        if c == len(colors[i]):
            print(f"longest word is {colors[i]} and length is {c}")

find_longest_word()