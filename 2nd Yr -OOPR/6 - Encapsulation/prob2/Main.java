package Encapsulation.prob2;
import java.util.Scanner;
/* 🍇 Jervx 🍇 */
class Main{

    public static MixedFraction setMF(Scanner inpt){
        int opt = inpt.nextInt();
        if(opt == 1) return new MixedFraction(); 
        else if(opt == 2) return new MixedFraction(inpt.nextInt());
        else if(opt == 3) return new MixedFraction(inpt.nextInt(), inpt.nextInt());
        else return new MixedFraction(inpt.nextInt(),inpt.nextInt(),inpt.nextInt());
    }

    public static void main(String [] jervx){
        Scanner inpt = new Scanner(System.in);
        
        MixedFraction mf = null;
        MixedFraction mf2 = null;

        mf = setMF(inpt);
        mf2 = setMF(inpt);
        

        int M = inpt.nextInt();

        while(M > 0){
            int opt = inpt.nextInt();
            if(opt == 1) mf.plus(mf2);
            else if(opt == 2) mf.minus(mf2);
            else if(opt == 3) mf.mult(mf2);
            else if(opt == 4) mf.div(mf2);
            else if(opt == 5) System.out.println(mf.toString());
            M--;
        }
    }
}

/*
test case 1
2 3
4 1 3 4
1
1
5


*/