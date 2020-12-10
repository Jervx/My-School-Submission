# 3. Term

**by CodeChum**

Construct a class called Term. It is going to represent a term in polynomial expression. It has an integer coefficient and an exponent. In this case, there is only 1 independent variable that is 'x'.


There should be two operations for the Term:

    public Term times(Term t) - multiplies the term with another term and returns the result
    public String toString() - prints the coefficient followed by "x^" and appended by the exponent. But with the following additional rules:
        if the coefficient is 1, then it is not printed.
        if the exponent is 1, then it is not printed ( the caret is not printed as well)
        if the exponent is 0, then only the coefficient is printed. 

**Input Format**

    The first line contains the coefficient and the exponent of the first term. The second line contains the coefficient and the exponent of the second term.

**Input Sample**

    1 1
    4 3

**Output Format**

    Display the resulting product for each of the test case.

**Output Sample**

    4x^4