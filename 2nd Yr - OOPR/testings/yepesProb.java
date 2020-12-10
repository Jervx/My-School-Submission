import java.util.Scanner;

public class yepesProb {

    public static void main(String [] args){
        int[] array = {1, 2, 3, 4, 5};
        Scanner in = new Scanner(System.in);

        int iteration = in.nextInt();

        for(int y = 0; y < iteration; y++)
            for(int x = 0; x < array.length; x++)
                array[x] *= array[x];

        for(int x : array) System.out.printf("%03d\n",x);
    }
    
}
