# 1. Date

**by CodeChum**

Create a new file called Date.java and construct a Date class that models a calendar date with day, month and year. It contains the following members:

    3 private integer instance variables: day, month (1 - 12), and year (4-digit)
    a default constructor which will set the date to 01/01/1972. When called, this also prints the string "Default Constructor"
    an overloaded constructor that takes in the day, month, and year as arguments. When called, this also prints the string "Overloaded Constructor"
    public getters and setters for the private instance variables
    public void setDate(int day, int month, int year) - sets the day, month, and year based on the arguments
    public String toString() - returns "DD/MM/YYYY", with leading zero for DD and MM if applicable (note: return the string and do not display it from the method itself)
    public Day dayOfTheWeek() - returns the day of the week (MON, TUE, WED, THU, FRI, SAT, SUN) for the date. Create an enum Day to handle this. Follow the formula below for this.


To get the day of the week, one can make use of the JD (Julian Day). Based on the given date, Y M D, perform the following computations:

    If the month is January or February, subtract 1 from the year to get a new Y and add 12 to the month to get a new M.
    Dropping the fractional part of all results of all multiplications and divisions, let:
        A = Y / 100
        B = A / 4
        C = 2 - A + B
        E = 365.25 x (Y + 4716)
        F = 30.6001 x (M + 1)
        JD = C + D + E + F - 1524.5
    The day of the week is JD % 7 (notice that JD ends in .5. Investigate this properly to get the correct day of the week)


**Note:** A Main.java file which contains the main method is already created for you. Do not edit that file. Just create your own Date.java file. But do observe how this has been created because for the next problems, it'll be you who will create the Main file as well.

**Input Format**

The first line contains an integer which is either 1 or 2. If it is a 1, it means to create a Date via the default constructor. If it is a 2, 3 integers follow in the next line representing the day, month, and year of the Date to be created. This is then followed by a number m representing the number of operations to be performed followed by the operations themselves as specified below:
    1 - setDay
    2 - setMonth
    3 - setYear
    4 - setDate
    5 - getDay
    6 - getMonth
    7 - getYear
    8 - toString
    9 - dayOfTheWeek

For operations 1, 2, 3, one integer follows. For setDate, 3 integers follow (D M Y). For the rest of the operations, no other inputs follow.

**Input Sample**

    1
    7
    8
    9
    1 20
    2 8
    3 1980
    8
    9

**Output Format**

The default Constructor should output "Default Constructor", and the overloaded constructor should output "Overloaded Constructor". All the setter operations will not output anything. For the getter operations (5 - 7), the values they return must be printed. Operations 8 and 9 should print their outputs as well.

**Output Sample**

    Default Constructor
    01/01/1972
    SAT
    20/08/1980
    WED