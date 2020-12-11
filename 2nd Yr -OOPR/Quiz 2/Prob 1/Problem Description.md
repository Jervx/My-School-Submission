## 1. Air Conditioning Unit

**by CodeChum**

Construct a class to represent an air conditioning (AC) unit containing the following attributes:

    brand - name of manufacturers like Samsung, LG, Carrier, etc.
    type - whether it is an inverter type or not
    power - represents the status of the AC unit whether it is turned on or not
    thermostat - levels go from 1 to 10
    temperature - levels go from 16 to 30 (in .5 intervals)
    It should have two constructors - one default and another that is overloaded
        default constructor
            sets all the numerical values to the least value as described above
            sets power to off, and type to inverter
            sets brand to "AC Brand"
            prints "Default Constructor"
        overloaded constructor
            accepts brand and type as arguments
            everything else is set to the same values as in the default constructor
            prints "Overloaded Constructor"


**It should contain the following methods:**

    power() - this is supposed to turn the AC on if it is off, and turn it off if it is on
    thermostatUp() - increases thermostat by a value 1 (note that the thermostat has an upper limit)
    thermostatDown() - decreases thermostat by a value 1 (note that the thermostat has a lower limit)
    temperatureUp() - increases temperature by a value 0.5 (note that the temperature has an upper limit)
    temperatureDown() - decreases temperature by a value 1 (note that the temperature has a lower limit)
    display() - displays all the values of the member data (one member data per line) of AC following this format: <member_data>: <member_data_value>
    getter methods for all the private members of AC 

**Input Format**

The first input is an integer which will create an instance of an AC unit depending on the constructor used. This is specified below:

    1 - construct an AC unit object via the default constructor (no 
        input needed)
    2 - construct an AC unit object via the overloaded constructor
        (a String for the brand followed by 1 (inverter type) or 0 
        (non-inverter type))

Then a number m is encountered which represents the number of operations that have to be invoked. This is then followed by an integer representing what operator to execute. The operators are specified below:

    3 - calls power()
    4 - calls thermostatUp()
    5 - calls thermostatDown()
    6 - calls temperatureUp()
    7 - calls temperatureDown()
    8 - calls getBrand()
    9 - calls getType()
    10 - calls getPower()
    11 - calls getThermostat()
    12 - calls getTemperature()
    13 - calls display()

**Input Sample**

    1
    4
    14
    3
    4
    13
    14

**Output Format**

    For each of the getter methods that gets called, the values they return must be printed. And it goes without saying that the constructors and display() method produce output.

**Output Sample**

    Default Constructor
    Brand: AC Brand
    Type: true
    Power status: false 
    Thermostat: 1
    Temperature: 16.0
    Brand: AC Brand
    Type: true
    Power status: true
    Thermostat: 2 
    Temperature: 16.0