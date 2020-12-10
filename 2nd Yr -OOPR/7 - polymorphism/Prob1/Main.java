import java.util.Scanner;
/* 🍇 Jervx 🍇 */
class Main{
    public static void main(String [] args){
        Scanner inpt = new Scanner(System.in);

        Television tv = new Television(inpt.next(), inpt.nextDouble(), (inpt.nextInt() == 1?"Smart":"Non-Smart"));
        
        int op = inpt.nextInt();
        while(op-- > 0){
            int a = inpt.nextInt();
            if(a == 1) tv.volumeUp();
            else if(a == 2) tv.volumeDown();
            else if(a == 3) tv.channelUp();
            else if(a == 4) tv.channelDown();
            else if(a == 5) System.out.println(tv.toString());
            else if(a == 6) tv.power();
        }
    }
}