## 2. Rectangle

**by CodeChum**

A rectangle can be formed given two points, the top left point and the bottom right point. Assuming that the top left corner of the console is point (0,0), the bottom right corner of the console is point (MAX, MAX) and given two points (all "x" and "y" coordinates are positive), you should be able to draw the rectangle in the correct location, determine if it is a square or a rectangle, and compute for its area, perimeter and center point.


To be able to do this, you should create a class for a point (that has an x-coordinate and a y-coordinate). Also, create another class called Rectangle. The Rectangle should have 2 points, the top left and the bottom right. You should also implement the following methods for the Rectangle:

    display() - draws the rectangle on the console based on the sample
    area() - computes and returns the area of a given rectangle
    perimeter() - computes and returns the perimeter of a given rectangle
    centerPoint() - computes and returns the center point of a given rectangle
    isSquare() - checks whether a given rectangle is a square or not. 

**Input Format**

    A pair of numbers representing the points for the rectangle (x and y).

**Input Sample**

    5 8

**Output Format**

    The first few lines contain the drawn rectangle. After one empty line, the next line prints either "RECTANGLE" or "SQUARE". This is then followed by its area, perimeter, and the coordinates of its center point.

**Output Sample**

    # # # # # #
    #         #
    #         #
    #         #
    #         #
    #         #
    #         #
    #         #
    # # # # # #

    RECTANGLE
    AREA: 40
    PERIMETER: 26
    CENTER POINT: (2.50,4.00)