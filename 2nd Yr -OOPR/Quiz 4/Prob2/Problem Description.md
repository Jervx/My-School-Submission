#1. A Simple Game

**by CodeChum**

You probably are fond of games. This quiz though is not that complicated. You are simply going to work with a point on a screen, and a circle on a screen as well. And let's consider them as the characters in the game. We are going to call both of these characters as Movable objects. Objects are said to be Movable if they can be moved around the screen. The following simple movements are allowed:


public void moveLeft(); // moves the x to the left by 1 unit
public void moveRight(); // moves the x to the right by 1 unit
public void moveUp(); // moves the y 1 unit upward
public void moveDown(); // moves the y 1 unit downward
public void display(); // prints all the info about a Movable


Both Point and Circle characters are Movable.


The Point has an x coordinate and a y coordinate. The Circle has a Point (representing its center) and a radius (for our purpose this is an int). The attributes may all be set to public.


It goes without saying that Point and Circle should implement all the methods of Movable since they are Movable objects.


The screen where the characters are going to move around is a 2-dimensional screen with coordinates (0,0) as its top-left corner and (200,200) as its bottom-right corner.


Make sure that when the characters are moving on the screen, they do not go out of the screen, especially with the Circle character since it has a radius involved.


For the display() function, in Point, print Point: (x,y) and in Circle, print Circle: (x,y), r.

**Input Format**

The first input is either 1 (a Point) or 2 (a Circle). If it is a Point, 2 non-negative integers follow, if it is a Circle, 3 non-negative integers follow, the 3rd being the radius. Then a positive integer m is read representing the number of operations that have to be performed followed by the operations themselves.

    - 1 - moveLeft()
    - 2 - moveRight()
    - 3 - moveUp()
    - 4 - moveDown()

**Input Sample**

    1
    0 0
    5
    4
    4
    2
    2
    1

**Output Format**

    A single line simply printing the string returned by toString().

**Output Sample**

    Point: (1,2)