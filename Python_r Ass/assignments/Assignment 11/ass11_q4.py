'''
Write a Python program to replace dictionary values(V,VI)and with their average.
Input:-
student_details= [
{'id' : 1, 'subject' : 'math', 'V' : 70, 'VI' : 82},
{'id' : 2, 'subject' : 'math', 'V' : 73, 'VI' : 74},
{'id' : 3, 'subject' : 'math', 'V' : 75, 'VI' : 86}
]
Expected Output:
[{'subject': 'math', 'id': 1, 'V+VI': 76.0}, {'subject': 'math', 'id': 2, 'V+VI': 73.5}, {'subject': 'math', '
id': 3, 'V+VI': 80.5}]
'''

student_details= [
{'id' : 1, 'subject' : 'math', 'V' : 70, 'VI' : 82},
{'id' : 2, 'subject' : 'math', 'V' : 73, 'VI' : 74},
{'id' : 3, 'subject' : 'math', 'V' : 75, 'VI' : 86}
]


for index in student_details:
    average = index['V'] + index['VI'] / 2
    t1 = index.pop('V')
    t2 = index.pop('VI')
    index['V+VI'] = average
print(student_details)