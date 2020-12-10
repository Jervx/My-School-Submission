# 2. Student Storage

**by CodeChum**

Given the Student class from one of the previous lessons, the one that inherited from Person, construct another class called StudentAssistant. What makes a StudentAssistant different from Student is that they have to render a fixed set number of hours. All student assistants are to render at least 40 hours of duty in a month. This may changed at any time by the Administrator.


Store the StudentAssistants in a List implemented as a LinkedList.


We should be able to do the following operations:

    1 - enroll a student in the student assistant program
    2 - withdraw a student from the student assistant program
    3 - display all student assistants
    4 - search all student assistants based on the family name
    5 - search all student assistants based on the year-level
    6 - search all students who have rendered less than 40 hours

**Input Format**

The first line contains a positive integer n which represents the number of operations to be performed. What follows are the n operations themselves. Each operation has a number as listed above. The succeeding lines contain the needed information for that operation as described below:

    1 - first name, middle name, last name, gender (1 is used for female, 2 for male), age, height, weight, student number, program, year level, hours rendered
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

Print the output only of the operations that have output. First off is the display all student assistants which is going to print all the information about the student assistant. When withdrawing a student and the student is not in the list, print "Student Assistant not found." All the other searches, when a student assistant is found, will print all the information.

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
