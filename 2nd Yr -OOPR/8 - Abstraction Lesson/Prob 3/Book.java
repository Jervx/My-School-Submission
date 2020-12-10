class Book implements Borrowable{
    String title, author, ISBN;
    boolean  onLoan;
    int yearPublished, loanedMonth = 1, loanedDay,
     loanedYear = 2020, returnedMonth = 1, returnedDay,
     returnedYear, daysAllowedOnLoan;

    double dailyPenaltyCost;

    public Book(String title,String author, String ISBN, int yearPublished, int day, int retDay){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
        loan(day);
        returned(retDay);
    }

    @Override
    public void loan(int day) {
        loanedDay = day;
        onLoan = true;
    }

    @Override
    public void returned(int day) {
        returnedDay = day;
        onLoan = false;
    }

    @Override
    public double penalty() {
        if(loanedDay+5 < returnedDay) dailyPenaltyCost = (returnedDay - (loanedDay+5)) * 15.0; 
        else dailyPenaltyCost = 0.0;
        return dailyPenaltyCost;
    }

    public void display(){
        System.out.printf("%s\n%02d/%02d/%d\n%02d/%02d/%d\nPenalty: %.2f",title,loanedMonth,loanedDay,loanedYear,loanedMonth,returnedDay,loanedYear,penalty());
    }
}