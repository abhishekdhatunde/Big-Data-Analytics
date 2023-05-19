'''
Que1. Create a python application for the following requirement .
 It is a banking application having minimum 5 accounts in it.
  Class bank is having followingdetails bankName, branch name,IFSC code , accountList(5 accounts)
   Class Account is having followingdetails AccHolderName ,mobileNumber , accNumber,
    balance Minimum balance amount of Rs3000 must be there in account . Implement following functions::
1:accept bank information
2:print bank information
3:add new account
4.print information of all accounts
5.print information of selected accounts
6.delete selected account (Return 1 if deleted else 0)
7.Deposit amount in a account (Return updated balance)
Write a menudriven program to achieve above requirements.
'''


accnumber=20222900
class Account:
    def __init__(self, accholdername, mobilenumber, accnumber, balance):

        self.accholdername = accholdername
        self.mobilenumber = mobilenumber
        self.accnumber = accnumber
        self.balance = balance

class Bank:
    def __init__(self):
        self.list=[]

    def accept_bankdetails(self):
        self.bankname = input('Enter Bank Name: ')
        self.branchname = input('Enter Branch Name: ')
        self.ifsccode = input('Enter IFSC Code: ')

    def add_account(self,):
        global accnumber
        accholdername = input('Enter Account holder name: ')
        mobilenumber  = input(' Enter Mobile Number: ')
        accnumber1 = accnumber+1
        accnumber += 1
        balance = 3000
        account = Account(accholdername, mobilenumber, accnumber, balance)
        self.list.append(account)

    def print_bankinformation(self):
        print(f'Name of the Bank : {self.bankname}')
        print(f'Name of the Bank : {self.branchname}')
        print(f'Name of the Bank : {self.ifsccode}')

    def account_inormation(self):
        for account in self.list:
            print(f'| Name : {account.accholdername} | Mobile : {account.mobilenumber} | Account Number :{account.accnumber} | Balance : {account.balance} |')


    def selected_account(self):
        n = int(input('Enter Account Number: '))
        for account in self.list:
            if account.accnumber == n:
                print(f'| Name : {account.accholdername} | Mobile : {account.mobilenumber} | Account Number :{account.accnumber} | Balance : {account.balance} |')

    def delete_selectedaccount(self):
        n = int(input('Enter Account Number: '))
        if len(self.list) == 0:
            print('PLEASE ENTER VALID BANK ACCOUNT')

        else:
            for account in self.list:
                if account.accnumber == n:
                    self.list.remove(account)
                    print('ACCOUNT DELETED SUCCESSFULLY')
                    break
            else:
                print("ERROR!! ACCOUNT NOT DELETED")

    def add_balance(self):
        account1 = int(input('Please Enter Account Number: '))
        amount = int(input('Enter Amount: '))

        for account in self.list:
            if account.accnumber == account1:
                account.balance += amount
                print(f'| Name : {account.accholdername} | Mobile : {account.mobilenumber} | Account Number :{account.accnumber} | Balance : {account.balance} |')
                break
        else:
            print('Please Enter Valid Account Number')

b1 = Bank()
def print_menu():

    print(f'-------------------Welcome----------------------------')
    print('1: Accept bank information')
    print('2: Print bank information')
    print('3: Add new account')
    print('4. Print information of all accounts')
    print('5. Print information of selected accounts')
    print('6. Delete selected account (Return 1 if deleted else 0)')
    print('7. Deposit amount in a account (Return updated balance)')
    print('8. Exit')
    print('------------------------------------------------------')

    result = int(input('Enter your choice : '))
    return result

while True:
    choice = print_menu()

    if choice == 1:
        b1.accept_bankdetails()
    elif choice == 2:
        b1.print_bankinformation()
    elif choice == 3:
        b1.add_account()
    elif choice == 4:
        b1.account_inormation()
    elif choice == 5:
        b1.selected_account()
    elif choice == 6:
        b1.delete_selectedaccount()
    elif choice == 7:
        b1.add_balance()
    elif choice == 8:
        print(" THANK YOU, VISIT AGAIN ")
        break

