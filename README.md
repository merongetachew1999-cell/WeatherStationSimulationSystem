# Weather Station Simulation System

A simple Java console app that simulates a set of weather sensors (metrology)
Each sensor measures something different temperature, pressure,
wind speed, or humidity and reports its reading to a central station.



## How to Run

You'll need Java JDK 8 or above installed.

 Download or clone the repo
 Open a terminal in the project folder
 Compile:



## Files

what the files do

`Sensor.java` Base class, all child classes inherit from 
##child classes
`Thermometer.java`Measures temperature in °C 
`Barometer.java`  Measures pressure in hPa 
`Anemometer.java` Measures wind speed in km/h 
`Hygrometer.java`  Measures humidity in %RH 

`WeatherStation.java` Holds all sensors and runs reading cycles 
`Main.java` Entry point, creates objects and starts the program 



## Where the OOP concepts are

### Classes and Objects (V1.0, V2.0)
Defined in every `.java` file. Objects are created in `Main.java` lines 7–10.

### Encapsulation (V1.0, V2.0)
Fields in `Sensor.java` are `private` and `protected` (lines 3–5).
Getters and setters are on lines 18–26, including a null check on the setter.

### Inheritance (V3.0)
`Thermometer`, `Barometer`, `Anemometer`, and `Hygrometer` all extend `Sensor`
(line 1 of each file). The `super()` call passing arguments to the parent
constructor is on line 7 of each subclass.

### Polymorphism (V4.0)

Method overriding — `measure()` is declared abstract in `Sensor.java`
line 28 and overridden differently in each subclass. `report()` is also
overridden in `Anemometer.java` and `Hygrometer.java` to add extra output.

Method overloading — `report()` in `Sensor.java` lines 30–35 and
`runCycle()` in `WeatherStation.java` lines 22–28 each have two versions
with different parameters.

Superclass references — in `Main.java` lines 7–10, variables are typed
as `Sensor` but hold subclass objects. In `WeatherStation.java` line 8,
a `List<Sensor>` stores all four sensor types. The loop on line 16 calls
`report()` on each one and Java picks the right version at runtime.



## Sample Output
 Station: Addis Ababa Central
[T-01] Thermometer at Roof: 23.4 °C
[B-01] Barometer at Ground Floor: 1012.7 hPa
[A-01] Anemometer at Tower: 34.2 km/h
  Category: Moderate wind
[H-01] Hygrometer at Garden: 67.8 %RH
  Comfort: Humid

 Station: Addis Ababa Central [verbose] 
[T-01] Thermometer at Roof: 19.1 °C
  Unit: °C | ID: T-01
[B-01] Barometer at Ground Floor: 998.3 hPa
  Unit: hPa | ID: B-01
[A-01] Anemometer at Tower: 12.6 km/h
  Category: Light breeze
  Unit: km/h | ID: A-01
[H-01] Hygrometer at Garden: 85.3 %RH
  Comfort: Humid
High humidity alert!
  Unit: %RH | ID: H-01

Total sensors: 4
