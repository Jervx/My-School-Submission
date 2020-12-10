import java.util.Scanner;
/* 🍇 Jervx 🍇 */
class Main{

    public void displayData(StudentAssistant [] data, int range){
        for(int x = 0; x < range; x++) data[x].display();
    }

    public void displayOnlyLess(StudentAssistant []data, int range){
        for(int x = 0; x < range; x++)
            if(data[x].getHoursRendered() < 40)
                data[x].display();
    }

    public void displayBasedOnFamilyName(StudentAssistant []data, int range, String familyName){
        for(int x = 0; x < range; x++ )
            if(data[x].getLastName().equals(familyName))
                data[x].display();
    }

    public void displayBasedOnYearLevel(StudentAssistant []data, int range, int yearLevel){
        for(int x = 0; x < range; x++)
            if(data[x].getYearLevel() == yearLevel)
                data[x].display();
    }

    public boolean isPresent(StudentAssistant [] data,int range,String studentID){
        for(int x =  0; x < range; x++)
            if(data[x].getStudentNumber().equals(studentID))
                return true;
        return false;
    }

    public StudentAssistant [] widthdrawStudent(StudentAssistant [] data, int range, String studID){
        StudentAssistant [] newData = new StudentAssistant[data.length];
        int ptr1 = 0;
        for(int x = 0 ;x < range; x++)
            if(!data[x].getStudentNumber().equals(studID))
                newData[ptr1++] = data[x];
        return newData;
    }

    public void Mmain(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        StudentAssistant [] SAStorage = new StudentAssistant[10];
        int size = 0;

        while(n-->0){
            int op = in.nextInt();
            if(op == 1)
                if(size != SAStorage.length){
                    SAStorage[size++] = new StudentAssistant(
                        in.next(), in.next(),
                        in.next(), in.nextInt(),
                        in.nextInt(), in.nextDouble(), in.nextDouble(),
                        in.next(), in.next(), in.nextInt(), in.nextInt());
                }else System.out.println("Sorry. Program is full");
            else if(op == 2) {
                String sID = in.next();
                if(isPresent(SAStorage, size, sID)){
                    SAStorage = widthdrawStudent(SAStorage, size, sID);
                    size--;
                }
                else System.out.println("Student Assistant not found.");
            }
            else if(op == 3) displayData(SAStorage,size);
            else if(op == 4) displayBasedOnFamilyName(SAStorage, size, in.next());
            else if(op == 5) displayBasedOnYearLevel(SAStorage, size, in.nextInt());
            else if(op == 6) displayOnlyLess(SAStorage, size);
        }

    }

    public static void main(String [] jervx){ new Main().Mmain(); }
}