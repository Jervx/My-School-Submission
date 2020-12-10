import javax.swing.text.html.CSS;

public class Borrower extends Person{
    
    String CSSN;
    int transportaion;

    Borrower(String name,String middlename,String lastname,Gender gender,int age,
    int height, int weight,String CSSN,int transportation){
        super(name,middlename,lastname,gender,age,height,weight);
        this.CSSN = CSSN;
        this.transportaion = transportation;
    }

    public void goToLibraryToBorrowBook(){
        String commuteType = "";
        if(transportaion == 1) commuteType = "driving";
        else if(transportaion == 2) commuteType = "biking";
        else if(transportaion == 3) commuteType = "walking";
        else commuteType = "commuting";
        System.out.println(String.format("%s %s %s is %s to the Library to borrow books.",getFirstName(),getMiddleName(),getLastName(),commuteType));
    }

}