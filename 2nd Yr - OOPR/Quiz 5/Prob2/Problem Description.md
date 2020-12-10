# 2. Postfix Calculator
**by CodeChum**

One good implementation of computing infix expressions is to transform them to postfix and then evaluate via the postfix expression.

Infix expressions is the common way of writing arithmetic expressions. The binary operator come between them as shown below:

    2 * 5 + 9 - 10 / 20

In postfix expressions, the operands come first before the operator:

    2 5 * 9 + 10 20 / -

A stack can be used to evaluate postfix expressions. The operands are pushed onto the Stack and when an operator is found two operands are popped and the operation is performed and finally the result is pushed back onto the Stack.



The final answer will be the lone element of the Stack.

**Input Format**

    The first line contains a positive integer n representing the number of postfix expressions. What follows are n postfix expressions themselves.

**Input Sample**

    5
    10 20 +
    30 15 2 * +
    100 20 30 + /
    90 20 10 + + 0 /
    9 3 - 10 + 2 *

**Output Format**

    A single line containing the result of the expression. When a division by zero is encountered, this should be handled properly and print "Division by 0 Error". The program should be able to proceed with the next test case if there are still any.

**Output Sample**

    30
    60
    2
    Division by 0 Error
    32