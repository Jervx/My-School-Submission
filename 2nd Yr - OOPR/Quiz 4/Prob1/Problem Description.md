
# 1. More Shapes
**by CodeChum**

Since we are interested with drawing in this quiz (it seems), consider a Shape object. We know that for regular shapes (like Rectangle and Circle), they have properties like area and perimeter. Let's also assume that these Shapes have color (simply a String for the purpose of this quiz) and whether the shapes are filled with this color or not (boolean).



Construct a class called Shape that has color and filled as attributes. It should also have methods: area() and perimeter(). But Shape does not know how to compute for this. These methods should be defined properly in Shape and Shape must be defined accordingly as well.



Define Rectangle and Circle classes. Rectangle has a length and a width, while Circle a radius. For purposes of this quiz, all these attributes are positive integers.



Both Rectangle and Circle are Shapes. So you should know what to do. Implement a toString() method as well printing the information about the Shape object.



Also, when defining area() and perimeter() in Shape, take note that the area and perimeter for some shapes are not always integers.



Note: Use Math.PI for pi

**Input Format**

The first input is either 1 (a Rectangle) or 2 (a Circle). 
If it is a Rectangle, 2 positive integers follow (length and width). If it is a Circle, there is only integer that follows (radius). The next input is either true (filled) or false (not filled) and it follows a string which is the color.

**Input Sample**

    1 4 8
    Orange
    true
    Output Format

Simply print the result returned by invoking toString(). And print the area and perimeter of the shapes. If the area and/or the perimeter is not a whole number, print the value with two decimal places. If the shape is filled, print the color, else, end of output.

**Output Sample**

    Rectangle: length: 4, width: 8
    Area: 32
    Perimeter: 24
    Color: Orange