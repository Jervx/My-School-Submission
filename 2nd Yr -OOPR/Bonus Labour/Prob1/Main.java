import java.util.Scanner;

class Main{
    public static void main(String [] jervx){
        Scanner in = new Scanner(System.in);

        Fraction fract;

        int inpt = in.nextInt();
        
        try{
            if(inpt == 1) fract = new Fraction();
            else if(inpt == 2) fract = new Fraction(in.nextInt());
            else if(inpt == 3) fract = new Fraction(in.nextInt(),in.nextInt());
            else fract = new Fraction(in.next());
            System.out.println(fract.toString());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}