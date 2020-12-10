class StudentAssistant extends Student{

    int hoursRendered = 0;

    public int getHoursRendered(){ return hoursRendered; }

    public StudentAssistant(
        String firstName,
        String middleName,
        String lastName,
        int gender,
        int age,
        double height,
        double weight,
        String program,
        String studentNumber,
        int yearLevel,
        int hoursRendered
    ){
        super(firstName, middleName, lastName, gender == 2? Gender.MALE:Gender.FEMALE, age, height, weight, program, studentNumber, yearLevel);
        this.hoursRendered = hoursRendered;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Hours rendered: "+hoursRendered);
    }

}