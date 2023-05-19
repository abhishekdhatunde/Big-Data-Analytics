'''
6.Write a function filter_long_words() that takes a list
of words and an integer len and returns the list of words that are longer than len.
'''

def filter_long_words():
    a = int(input("number of words you wanna enter"))
    words = []
    list = []
    list2 = []
    for i in range(0,a):
        b = input("enter the word")
        words.append(b)
        list.append(len(b))

    c = int(input("enter the min length of word"))

    for i in range(0,a):
        if len(words[i]) > c:
            list2.append(words[i])

    print(list2)

filter_long_words()