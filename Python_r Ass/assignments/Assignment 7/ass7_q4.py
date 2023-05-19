'''
4. Write a program that prompts the user to input number of calls and calculate the monthly
telephone bills as per the following rule:
A:- Minimum Rs. 200 for up to 100 calls.
B:- Rs. 0.60 per call for next 50 calls.
C:- Plus Rs. 0.50 per call for next 50 calls.
D:-Plus Rs. 0.40 per call for any call beyond 200 calls.
'''

def monthlybill(amt):
    if amt <= 100 :
        print(f" your bill amount is 200 for {amt} calls")

    elif amt > 100 and amt <= 150 :
        amount = 200 + (amt - 100) * 0.60
        print(f" your bill amount is 200 for {amount} calls")

    elif amt > 150 and amt <= 200 :
        amount1 = (200 + 50 * 0.60) + (amt- 150) * 0.5
        print(f" your bill amount is 200 for {amount1} calls")

    elif amt > 200  :
        amount2 = (200 + 50 * 0.60) + 50 * 0.5 + ( amt - 200) * 0.4
        print(f" your bill amount is 200 for {amount2} calls")

amt = int(input(" please enter number of calls you done"))
monthlybill(amt)


