# Strategy design pattern

The Strategy Pattern defines a family of algorithms,
encapsulates each one, and makes them interchangeable. Strategy
lets the algorithm vary independently from clients that use it.

### My example
I have to define some characters and their weapons, but it is 
bad to have a lot of classes whit the same function "fight".

So I made an interface called WeaponBehavior and use it in
different classes that makes their own implementation of it
like AxeBehavoir for example.

Then I made a super class called character, and the different
character types inherit from it and implements a specific 
behavior.
