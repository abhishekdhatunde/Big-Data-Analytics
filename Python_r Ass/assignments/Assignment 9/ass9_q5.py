'''
 Calculate the sum and average of the digits present in a string Str1=”Python83737@#8496”
'''

str = 'Python83737@#8496'

sum = 0
count = 1
for index in str:
    if index.isdigit():
        sum = sum + int(index)
        count+=1
        avg = sum/ count
print(f' Sum of given string is {sum} and Average is {avg}')


