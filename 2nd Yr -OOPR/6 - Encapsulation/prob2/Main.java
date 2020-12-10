import java.util.Scanner;

class Main{
    public static void main(String [] jervx){
        Scanner inpt = new Scanner(System.in);

        int opt = inpt.nextInt();
        Account acc = null;
        
        if(opt == 1) acc = new Account(inpt.nextInt());
        else acc = new Account(inpt.nextInt(),inpt.nextDouble());

        int n = inpt.nextInt();

        while(n-- > 0){
            opt = inpt.nextInt();

            if(opt == 1) acc.credit(inpt.nextDouble());
            else if(opt == 2) acc.debit(inpt.nextDouble());
            else if(opt == 3) System.out.println("Account Number: "+ acc.getAccountNumber());
            else if(opt == 4) System.out.println("Balance: "+String.format("%.2f",acc.getBalance()));
            else System.out.println(acc.toString());
        }
    }
}