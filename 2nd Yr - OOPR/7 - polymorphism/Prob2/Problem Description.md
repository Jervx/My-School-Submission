# 2. Fraction/Mixed Fraction

**by CodeChum**

Given the class Fraction in the code editor. Fill in the operations and display for the class Fraction. For plus and minus, think cross multiplication. times is straightforward, while divide has to do with reciprocals. toString should return the fraction in string format ("nume/deno" - as a String) but if denominator is 1, then the string should just contain the numerator. 


Then, construct another class called MixedFraction. MixedFraction inherits from Fraction. That means it has a numerator and a denominator as well. It should have a whole part that makes it not just a simple fraction. This whole part is an integer as well. It now has 3 forms of constructor defined as follows:

    default constructor sets whole to zero, nume to 0, and deno to 1.
    first overloaded constructor accepts 1 integer for the whole. nume is set to zero and deno to 1.
    second overloaded constructor accepts two integers for nume and deno. whole is set to zero.
    third overloaded constructor accepts 3 integers, for the whole, nume, and deno.


The constructors print what kind of constructor they are similar to the ones found in the Fraction. This also means that the toString() method and all the other operations should be overridden. The answers do not necessarily have to be in their lowest form but the numerator must always be less than the denominator. If ever the numerator is greater than the denominator, convert the improper fraction into a mixed fraction. Also, if the numerator is equal to the denominator, set nume to 0 and deno to 1 and do not print the fraction, only print the whole number with additional 1.


Note: When multiplying or dividing mixed fractions, convert the fractions first to improper fractions and multiply or divide them like you would do in a normal fractions. Don't forget to convert the result into a mixed fraction!

**Input Format**

The first input is either a 1, 2, 3, 4. 

    1 means the MixedFraction should be constructed via the default constructor, 
    2 for the first overloaded constructor, 
    3 for the second overloaded constructor, and 
    4 for the third overloaded constructor.

If it is a 2, one integer follows. If it is a 3, 2 integers follow. If it is a 4, 3 integers follow. This represents the first MixedFraction input. 

Another set just like that follows for the second MixedFraction input. 

What comes next is a number m, representing the number of operations that need to be executed followed by the operations themselves as described below:

    1 - plus
    2 - minus
    3 - times
    4 - divide
    5 - toString

**Input Sample**

    2 3
    4 1 3 4
    4
    1
    5
    2
    5

**Output Format**

The output is based solely on the call to toString and the print statements from the constructors.

**Output Sample**

    Fraction default constructor
    MixedFraction first overloaded constructor
    Fraction overloaded constructor
    MixedFraction third overloaded constructor
    4 3/4
    1 3/4