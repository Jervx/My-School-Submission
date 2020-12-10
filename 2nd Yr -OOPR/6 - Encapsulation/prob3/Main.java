import java.util.Scanner;

class Main{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        Term T1 = new Term(input.nextInt(), input.nextInt());
        Term T2 = new Term(input.nextInt(), input.nextInt());

        Term result = T1.times(T2);
        System.out.println(result.toString());
    }
}