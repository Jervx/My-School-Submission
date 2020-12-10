# 1. Appliance and TV

**by CodeChum**

Create a class called Appliance. An appliance simply has a:

    brand (a text)
    a cost (a monetary value)
    a power status (ON or OFF)

Power status, brand and cost should not be accessible out the class or its hierarchy of inheritance.


It has one constructor that accepts a string and double for the brand and cost respectively (prints "Appliance Constructor" as well). It sets the power status to OFF.


Apart from the getters, it also has two public methods, power(), and toString(). power() turns on the appliance if it is off, otherwise, if it is on, it turns the appliance off. toString() simple returns a String object representing the Appliance in this format ("Brand: xxxx, Cost: PhP xxxx.xx, Power: xx"). 


Create another class called Television. Television is an Appliance. It only has the following additional private attributes:

    type (whether Smart or Non-Smart)
    volume (0 - 100)
    channel (1 - 100)

*It should have the following methods:*

    getters
    void volumeUp() - increases the volume by 1 (possible only when TV is ON)
    void volumeDown() - decreases the volume by 1 (possible only when TV is ON)
    void channelUp() - increases the channel by 1 (possible only when TV is ON)
    void channelDown() - decreases the channel by 1 (possible only when TV is ON)
    String toString() - overriding Appliance's. It should include type, volume, and channel in this format ("Brand: xxxx, Cost: PhP xxxx.xx, Power: xx, Type: xxxx, Volume: xx, Channel: xx"). 


A lone constructor is to be implemented with a type, brand, and cost as an argument. It sets the volume to 0 and channel to 1. And it prints "Television Constructor" as well. 

**Input Format**

The first line contains all arguments for creating a Television object. The next line contains m which is the number of operations. The following lines are the m operations.  For the type, 1 is used for Smart, 2 for Non-Smart. The operations are described below:

    1 - volumeUp
    2 - volumeDown
    3 - channelUp
    4 - channelDown
    5 - toString
    6 - power

Input Sample

    Philips 23000 2
    9
    1
    1
    1
    2
    3
    3
    3
    4
    5

**Output Format**

    Apart from the outputs of the constructors, only operation 5 prints an output. It prints the String toString returns.

**Output Sample**

    Appliance Constructor
    Television Constructor
    Brand: Philips, Cost: PhP 23000.00, Power: OFF, Type: Non-Smart, Volume: 0, Channel: 1