import java.util.Scanner;

class Main{
    public static void main(String [] jervx){
        Scanner in = new Scanner(System.in);

        Movable movableSyaEh = null;

        if(in.nextInt() == 1) movableSyaEh = new Point(in.nextInt(),in.nextInt());
        else movableSyaEh = new Circle(in.nextInt(),in.nextInt(), in.nextInt());

        int ilan = in.nextInt();

        while(ilan-- > 0){
            int option = in.nextInt();
            if(option == 1) movableSyaEh.moveLeft();
            else if(option == 2) movableSyaEh.moveRight();
            else if(option == 3) movableSyaEh.moveUp();
            else movableSyaEh.moveDown();
        }

        movableSyaEh.display();
    }
}


/*
1 100 100
5
2
2
4
4
*/