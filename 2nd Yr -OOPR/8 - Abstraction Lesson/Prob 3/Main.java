import java.util.Scanner;
/* 🍇 Jervx 🍇 */
public class Main{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        Book book = new Book(in.nextLine(), in.nextLine(), in.nextLine(), in.nextInt(), in.nextInt(), in.nextInt() );

        book.display();
    }
}