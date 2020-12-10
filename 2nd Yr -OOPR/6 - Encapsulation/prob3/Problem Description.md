#3. Student Storage

**by CodeChum**

Given the Student class that inherited from the Person class (the same ones from our lesson), construct another class called StudentAssistant. The class inherits from Student. What makes a StudentAssistant different from Student is that they have to render a fixed set number of hours. All student assistants are to render at least 40 hours of duty in a month. This maybe changed at any time by the Administrator.


Assuming that we are keeping a record of all student assistants enrolled in a University and that there are only 10 slots available for student assistants. 


**We should be able to do the following operations:**

    enroll a student in the student assistant program
    withdraw a student from the student assistant program
    display all student assistants
    search all student assistants based on the family name
    search all student assistants based on the year-level
    search all students who have rendered less than 40 hours 

**Input Format**

    The first input is a positive integer n representing the number of operations. What follows are the n operations themselves. Each operation starts with its operation number followed by the needed information for that information.

Described below are all the needed information for all the operations:

    1 - first name, middle name, last name, gender (1 is used for female, 2 for male), age, height, weight, program, student-number, year level, hours rendered
    2 - student number
    3 - no additional information needed
    4 - family name
    5 - year level
    6 - no additional information needed

**Input Sample**

    11
    1
    Alimyon
    Cabahug
    Calipayan
    1
    19
    130
    60
    BSBiology
    2019-10002
    2
    38
    1
    Honofrio
    Buot
    Bilar
    2
    17
    142
    70
    BSPolSci
    2020-10004
    1
    42
    1
    Ambongan
    Cabahug
    Calipayan
    2
    18
    140
    68
    BSPolSci
    2020-10003
    1
    35
    3
    6
    4 Calipayan
    5 1
    2 2020-10005
    3
    2 2020-10004
    3

**Output Format**

Print the output only of the operations that have output (operations 3 - 6). First off is the display all student assistants (operation 3) which is going to print all the information about the student assistant. When the program has admitted 10 students, enrolling is no longer possible and print "Sorry. Program is full." When withdrawing a student and the student is not in the list, print "Student Assistant not found." All the other searches, when a student assistant is found, will print all the information.

**Output Sample**

    Name: Alimyon Cabahug Calipayan
    Gender: FEMALE
    Age: 19
    Height: 130.0
    Weight: 60.0
    Program: BSBiology
    Student Number: 2019-10002
    Year Level: 2
    Hours rendered: 38
    Name: Honofrio Buot Bilar
    Gender: MALE
    Age: 17
    Height: 142.0
    Weight: 70.0
    Program: BSPolSci
    Student Number: 2020-10004
    Year Level: 1
    Hours rendered: 42
    Name: Ambongan Cabahug Calipayan
    Gender: MALE
    Age: 18
    Height: 140.0
    Weight: 68.0
    Program: BSPolSci
    Student Number: 2020-10003
    Year Level: 1
    Hours rendered: 35
    Name: Alimyon Cabahug Calipayan
    Gender: FEMALE
    Age: 19
    Height: 130.0
    Weight: 60.0
    Program: BSBiology
    Student Number: 2019-10002
    Year Level: 2
    Hours rendered: 38
    Name: Ambongan Cabahug Calipayan
    Gender: MALE
    Age: 18
    Height: 140.0
    Weight: 68.0
    Program: BSPolSci
    Student Number: 2020-10003
    Year Level: 1
    Hours rendered: 35
    Name: Alimyon Cabahug Calipayan
    Gender: FEMALE
    Age: 19
    Height: 130.0
    Weight: 60.0
    Program: BSBiology
    Student Number: 2019-10002
    Year Level: 2
    Hours rendered: 38
    Name: Ambongan Cabahug Calipayan
    Gender: MALE
    Age: 18
    Height: 140.0
    Weight: 68.0
    Program: BSPolSci
    Student Number: 2020-10003
    Year Level: 1
    Hours rendered: 35
    Name: Honofrio Buot Bilar
    Gender: MALE
    Age: 17
    Height: 142.0
    Weight: 70.0
    Program: BSPolSci
    Student Number: 2020-10004
    Year Level: 1
    Hours rendered: 42
    Name: Ambongan Cabahug Calipayan
    Gender: MALE
    Age: 18
    Height: 140.0
    Weight: 68.0
    Program: BSPolSci
    Student Number: 2020-10003
    Year Level: 1
    Hours rendered: 35
    Student Assistant not found.
    Name: Alimyon Cabahug Calipayan
    Gender: FEMALE
    Age: 19
    Height: 130.0
    Weight: 60.0
    Program: BSBiology
    Student Number: 2019-10002
    Year Level: 2
    Hours rendered: 38
    Name: Honofrio Buot Bilar
    Gender: MALE
    Age: 17
    Height: 142.0
    Weight: 70.0
    Program: BSPolSci
    Student Number: 2020-10004
    Year Level: 1
    Hours rendered: 42
    Name: Ambongan Cabahug Calipayan
    Gender: MALE
    Age: 18
    Height: 140.0
    Weight: 68.0
    Program: BSPolSci
    Student Number: 2020-10003
    Year Level: 1
    Hours rendered: 35
    Name: Alimyon Cabahug Calipayan
    Gender: FEMALE
    Age: 19
    Height: 130.0
    Weight: 60.0
    Program: BSBiology
    Student Number: 2019-10002
    Year Level: 2
    Hours rendered: 38
    Name: Ambongan Cabahug Calipayan
    Gender: MALE
    Age: 18
    Height: 140.0
    Weight: 68.0
    Program: BSPolSci
    Student Number: 2020-10003
    Year Level: 1
    Hours rendered: 35