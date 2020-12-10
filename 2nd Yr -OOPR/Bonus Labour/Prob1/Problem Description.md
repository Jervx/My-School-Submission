# 1. Fraction

**by CodeChum**

Recall Fraction. Fractions are like rational numbers. Their denominators cannot be 0. For this problem, you are to reconstruct the class Fraction. It is to have 2 attributes, the numerator and the denominator.


It is supposed to have 3 constructors:

    default constructor that sets the numerator to 0 and denominator to 1
    Fraction(int n) - sets the numerator to n and denominator to 1
    Fraction(int n, int d) - sets the numerator to n and the denominator to d (the object must not be created if the denominator is 0 - throw an exception)
    Fraction(String f) - sets the numerator and denominator based on the string input. The string input may have the slash (/) separating the numerator and denominator. Sometimes, it may not have it representing a whole number.


It is going to have one method called toString() that returns the Fraction in String format: "numerator/denominator". If the denominator is 1, include the numerator alone and represent it as a whole number.

Input Format

The first line contains an integer that determines how the Fraction object should be created as defined below:

    1 - Fraction() - no input follows
    2 - Fraction(int n) - an integer follows
    3 - Fraction(int n, int d) - 2 integer follows
    4 - Fraction(String f) - a string follows

**Input Sample**

    1

**Output Format**

    A single line containing the string returned by invoking the toString() method if the object was successfully created. Otherwise, print the string "Fractions cannot have 0 for a denominator."

**Output Sample**

    1