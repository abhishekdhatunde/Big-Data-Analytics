'''
2. Write a program that display following output:
SHIFT
HIFTS
IFTSH
FTSHI
TSHIF
SHIFT
'''


word = 'SHIFT'

for i in range(len(word)):
    word = word[1:] + word[0]
    print(word)