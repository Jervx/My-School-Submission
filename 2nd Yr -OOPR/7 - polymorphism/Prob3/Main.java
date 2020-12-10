import java.util.Iterator;
import java.util.Scanner;
import java.util.*;

class Main{

    public int getStudentPosition(List <StudentAssistant> database,String studID){
        int x = 0;
        for(Iterator <StudentAssistant> iter = database.iterator(); iter.hasNext(); x++) {
			StudentAssistant studFocus = iter.next();
            //System.out.println("Is matched? "+studFocus.getStudentNumber()+" to "+studID);
			if(studFocus.getStudentNumber().equals(studID))
                return x;
		}
        return -1;
    }

    public void displayAll(List <StudentAssistant> database){
        Iterator <StudentAssistant> iter = database.iterator();
        while(iter.hasNext()){
            StudentAssistant studFocus = iter.next();
            studFocus.display();
        }
    }

    public void displayBasedOnApelyedo(List <StudentAssistant> database,String Apelyedo){
        Iterator <StudentAssistant> iter = database.iterator();
        while(iter.hasNext()){
            StudentAssistant studFocus = iter.next();
            if(studFocus.getLastName().equals(Apelyedo))studFocus.display();
        }
    }

    public void displayBasedOnYearLevel(List <StudentAssistant> database, int year){
        Iterator <StudentAssistant> iter = database.iterator();
        while(iter.hasNext()){
            StudentAssistant studFocus = iter.next();
            if(studFocus.getYearLevel() == year)studFocus.display();
        }
    }

    public void displayOnlyLess40(List <StudentAssistant> database){
        Iterator <StudentAssistant> iter = database.iterator();
        while(iter.hasNext()){
            StudentAssistant studFocus = iter.next();
            if(studFocus.getHoursRendered() < 40)studFocus.display();
        }
    }

    public void Mmain(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<StudentAssistant> database  = new ArrayList<StudentAssistant>();
        int size = 0;

        while(n-->0){
            int op = in.nextInt();
            if(op == 1)
                    database.add(new StudentAssistant(
                        in.next(), in.next(),
                        in.next(), in.nextInt(),
                        in.nextInt(), in.nextDouble(), in.nextDouble(),
                        in.next(), in.next(), in.nextInt(), in.nextInt()));
            else if(op == 2) {
                String sID = in.next();
                int searched = getStudentPosition(database,sID);
                if(searched != -1) database.remove(searched);
                else System.out.println("Student Assistant not found.");
            }
            else if(op == 3) displayAll(database);
            else if(op == 4) displayBasedOnApelyedo(database, in.next());
            else if(op == 5) displayBasedOnYearLevel(database, in.nextInt());
            else if(op == 6) displayOnlyLess40(database);
        }

    }

    public static void main(String [] jervx){ new Main().Mmain(); }
}


