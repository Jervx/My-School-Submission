import java.util.Scanner;
/* 🍇 Jervx 🍇 */
class Main{
    public static void main(String [] jervx){
        Scanner in = new Scanner(System.in);
        Shape shp = null;

        if(in.nextInt() == 1) shp = new Rectangle(in.nextInt(), in.nextInt(),in.next(),in.nextBoolean());
        else shp = new Circle(in.nextInt(), in.next(), in.nextBoolean());
        System.out.println(shp.toString());

        
    }
}