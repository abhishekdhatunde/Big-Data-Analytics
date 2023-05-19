'''
4. Print the given number in words.(eg.1234 => one two three four).
numbers = [" ", "one", "two", "three", "four"]
'''

dict = { " ":0, 1:"one", 2:"two", 3:"three", 4: "four", 5:"five", 6:"six", 7:"seven", 8:"eight", 9:"nine", 10:"ten"}

a = input("write numbers?")
numbers = []
for i in a:
    numbers.append(int(i))

for i in numbers:
    print(dict[i])
