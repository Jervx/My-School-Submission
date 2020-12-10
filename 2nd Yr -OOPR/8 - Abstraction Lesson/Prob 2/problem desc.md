# 2. Person and City Library Borrower 

**by CodeChum**

The City is implementing a simple library borrowing scheme.
The City Library has employees that oversee the Library. 
And the residents of the city are the customers of the library. 
In this scenario, both the Library employees and borrowers are Persons. 
This is the Person class that we have been discussing in our lessons (which is provided for you again in this problem).
Apart from these, all persons move around the city. But there is no knowledge as to their mode of transport (whether they own a car, a bike, or they walk, or commute). 


Apart from the constructors of Person, a default and an overloaded constructor, and the getters, include a toString() String method that you are all too familiar with replacing the display() method which only returns the full name of the person. And one abstract void method called goToLibraryToBorrowBook(). 


All borrowers (apart from the fact that they are persons), since they are city residents, have a City Social Security Number (CSSN), which is a String. And not all Persons have this. We are not going to include the address of the borrowers since this information may be extracted from their CSSN. The borrowers also have some way or form of going to the library. This is simply a number (1 - car, 2 - bike, 3 - walk, 4 - commute). 


Alimyon Cabahug Calipayan is walking to the Library to borrow books.


Construct the Borrower class which obviously has to extend from Person. Add all the necessary attributes as mentioned above for the Borrower. All the method goToLibraryToBorrowBook() does is print that "XXXX is YYYY to the Library to borrow books." where XXXX is the name of the borrower and YYYY is the mode of going to the library. The modes to be displayed are as follows: 

    car - driving
    bike - biking
    walk - walking
    commute - commuting

**Input Format**

The input is simply composed of all the information needed to create a Borrower object: first name, middle name, last name, gender (1 is female and 2 means male), age, height, weight, CSSN, and finally, their way of going to the library (1 - car, 2 - bike, 3 - walk, 4 - commute)

**Test Case 1**

    Alimyon
    Cabahug
    Calipayan
    1
    19
    130
    60
    CSSN-0001
    3

**Output Format**

    The output from goToLibraryToBorrowBook().

**Output Sample**

    Alimyon Cabahug Calipayan is walking to the Library to borrow books.


**Test Case 2**
Input

    Ambongan
    Cabahug
    Calipayan
    2
    18
    140
    68
    CSSN-0002
    4

Expected Output

    Ambongan Cabahug Calipayan is commuting to the Library to borrow books.