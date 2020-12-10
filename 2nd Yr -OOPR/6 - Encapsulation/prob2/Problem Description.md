# 2. Account

**by CodeChum**

Create a new file called Account.java and construct a class called Account, which models a simple bank account. It contains the following members: 

    Two private instance variables: accountNumber (int), and balance (double) which maintains the current account balance.
    Constructors (overloaded):
        Implement an overloaded constructor that takes in as input the account number and simply sets balance to 3000.00. This prints "First Overloaded Constructor" as well.
        Implement another overloaded constructor that takes in an account number and a balance as arguments. This prints "Second Overloaded Constructor" as we​ll.
    Getters for the instance variables
    public methods
        public void credit(double) - adds the given amount to the balance
        public void debit(double) - subtracts the given amount from the balance (obviously, one cannot subtract more from what is available - prints "Insufficient Funds" if this is the case)
        public String toString() - returns "Account Number: xxx, Balance: Php xxx.xx", with balance rounded to two decimal places. 

**Input Format**

The first input is either a 1 or 2. If it is a 1, it means to create an Account via the first overloaded constructor and an account number follows. If it is a 2, 2 values follow, an account number and an amount in pesos. 
This is then followed by a number m representing the number of operations to be performed followed by the operations themselves as specified below:
    1 - credit 
    2 - debit
    3 - getAccountNumber
    4 - getBalance
    5 - toString

For both operations 1 and 2, an amount in pesos follows. The other operations do not have inputs to them.

**Input Sample**

    1 1001 5
    3
    4
    1 2000
    5
    2 7000

**Output Format**

For the getter operations (3 - 4), including toString(), the values they return must be printed. For debit(), when the amount to be deducted is bigger than the balance, print "Insufficient Funds" while credit() will not have any output.

**Output Sample**

    First Overloaded Constructor
    Account Number: 1001
    Balance: 3000.00
    Account Number: 1001, Balance: Php 5000.00
    Insufficient Funds