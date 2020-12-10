class Account{

    private int accountNumber;
    private double balance;

    public Account(int accountNumber){
        this.accountNumber = accountNumber;
        balance = 3000.00;
        System.out.println("First Overloaded Constructor");
    }

    public Account(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        System.out.println("Second Overloaded Constructor");
    }

    public int getAccountNumber(){ return accountNumber; }
    public double getBalance(){ return balance; }

    public void credit(double amount){ balance += amount; }
    public void debit(double amount){
        if(amount < balance) balance -= amount;
        else System.out.println("Insufficient Funds");
    }

    public String toString(){ return "Account Number: "+accountNumber+", Balance: Php "+String.format("%.2f",balance); }
}