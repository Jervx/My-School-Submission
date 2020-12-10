import java.util.Scanner;
/* 🍇 Jervx 🍇 */
public class Main {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        Borrower taoXD = new Borrower(in.next(), in.next(), in.next(), (in.nextInt() == 1? Gender.FEMALE : Gender.MALE), in.nextInt(), in.nextInt(), in.nextInt(), in.next(), in.nextInt());

        taoXD.goToLibraryToBorrowBook();
    }
}