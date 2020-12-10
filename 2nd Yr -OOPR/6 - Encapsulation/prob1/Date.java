class Date{
    private int year, month, day;

    public Date(){
        year = 1972;
        month = 01;
        day = 01;
        System.out.println("Default Constructor");
    }

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month; 
        this.year = year;
        System.out.println("Overloaded Constructor");
    }

    public int getDay(){ return day; }
    public int getMonth(){ return month; }
    public int getYear(){ return year; }

    public void setDay(int day){ this.day = day; }
    public void setMonth(int month){ this.month = month; }
    public void setYear(int year){ this.year = year; }
    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Day dayOfTheWeek(){
        int yearT = year, monthT = month, dayT = day;

        if(monthT == 1 || monthT == 2){
            yearT -= 1;
            monthT += 12;
        }

        double A = yearT / 100;  
        double B = A / 4;        
        double C = 2 - A + B;    
        double E = 365.25 * (yearT + 4716);
        double F = 30.6001 * (monthT + 1);
        double JD = C + dayT + E + F - 1524.5;
        int dayY= (int)JD % 7;

        if(((yearT % 4 == 0) && (yearT % 100!= 0)) || (yearT % 400 == 0))
            dayY += 1;

        switch(dayY){
            case 1: return Day.MON;
            case 2: return Day.TUE;
            case 3: return Day.WED;
            case 4: return Day.THU;
            case 5: return Day.FRI;
            case 6: return Day.SAT;
            default: return Day.SUN;
        }
    }


    public String toString(){ return ""+String.format("%02d",day)+"/"+String.format("%02d",month)+"/"+year; }
    
}

enum Day{
    MON,TUE,WED,THU,FRI,SAT,SUN;
}