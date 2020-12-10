#3. Balance Parentheses

**by CodeChum**

Notice that every time you write code in Java or in any other programming languages, the parentheses that you are using are always balanced - for every open parenthesis there is a matching close parenthesis. Use the Stack to aid you in this activity.

    Clue 1: use push and pop. empty() might be useful as well
    Clue 2: start appending items to the stack only when you have found an open parenthesis.

**Input Format**

    A single line containing a String with open and close parentheses.

**Input Sample**

    ()()()()

**Output Format**

    The first line contains either "Balanced" or "Not Balanced" depending on the string input. The second line contains the remaining contents of the Stack that you used.

**Output Sample**

    Balanced
    The contents of the Stack are:


    Input


**Testcase 2**

**Input**
    ((()))((((


**Expected Output**

    Not Balanced
    The contents of the Stack are: ((((