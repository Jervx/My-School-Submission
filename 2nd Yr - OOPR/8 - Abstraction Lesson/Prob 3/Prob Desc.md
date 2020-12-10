# 3. Borrowable for the Library

**by CodeChum**

Since we are talking about the City Library, let's go on and see the collection of items that can be borrowed from the Library, and we care going to call this a Borrowable. We really are not sure what the different types of Borrowable are. They can be books, magazines, newspapers, audio books, video tapes, cassette tapes, compact disks, etc. 


What we do know is that these Borrowable may be loaned to Borrowers. They have to be returned, and a cost for computing for penalty dues when the Borrowable is not returned on time. 


This means that the Borrowable should be implemented as an interface and should have the following methods: 

```
    public void loan(int day);
    public void returned(int day);
    public double penalty();
```

Create a Borrowable called a Book. This should represent a Book object and is a Borrowable. This means that Book should implement Borrowable. It should have the following attributes: 

```
    String title;
    String author; // we are keeping this simple, no Person for now
    String ISBN;
    int yearPublished;
    boolean onLoan;
    int loanedMonth; // This is always set to 1
    int loanedDay; // range (1 - 31)
    int loanedYear; // This is always set to 2020
    int returnedMonth; // This is always set to 1
    int returnedDay; // range (1 - 31) and is always greater than loanedDay
    int returnedYear; // This is always set to 2020
    int daysAllowedOnLoan; // uniform for all Book Borrowables set to 5 days
    double dailyPenaltyCost; // this should be set to 15 pesos for all Book Borrowables
```

Implement the methods from Borrowable for Book. We are keeping this really simple and we are doing away with keeping a record of the Borrower (for purposes of focusing on interfaces). 


For loan(int day) simply set the loanedDay to the given day and update onLoan to true. For returned(int day) simply set the returnedDay to the given day and update onLoan to false. And for penalty(), compute the cost of the penalty based on the loanedDay and returnedDay. 

**Input Format**

    The first input is composed of all the information for the Book Borrowable (title, author, ISBN, year published). 
    Then two days will follow: date loaned and day returned.

By default the book is not on loan.

**Input Sample**

    Three·Cups·of·Tea
    Greg·Mortenson
    9781400152513
    2006
    18
    21

**Output Format**

    Print the title of the book, when it was borrowed, when it was returned, the penalty cost, and the onLoan status.

**Output Sample**

    Three·Cups·of·Tea
    01/18/2020
    01/21/2020
    Penalty:·0.00


**testcase 2**
Input

    One Hundred Years of Solitude
    Gabriel Garcia Marquez
    9780060114183
    1967
    1
    26

Expected Output

    One Hundred Years of Solitude
    01/01/2020
    01/26/2020
    Penalty: 300.00

**testcase 3**
Input

    Ermita
    F Sionil Jose
    9789718845127
    1988
    21
    22

Expected Output

    Ermita
    01/21/2020
    01/22/2020
    Penalty: 0.00