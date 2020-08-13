# Design Patterns whit kotlin

On this repo you can find my own implementations of some design patterns in kotlin
(I'm reading "Head First design patterns")

## Actual implementations 

#### Strategy
[Strategy](./src/strategy/) (src/strategy/)
 
Defines a family of algorithms, encapsulates each one, and
makes them interchangeable. Strategy lets the algorithm
vary independently from clients that use it.

### Observer
[Observer](./src/observer) (src/observer)

Defines a one-to-many dependency between objects so that one object
changes state, all its dependents are notified and updates 
automatically

### Decorator
[Decorator](./src/decorator) (src/decorator)

Attach additional responsibilities to an object dynamically.
Decorators provide a flexible alternative to subclassing for 
extending functionality.

### Factory
[Simple Factory](./src/SimpleFactory) (src/SimpleFactory)

The simple factory isn't a design pattern, Is more like a
programming idiom. The simple factory is a good way to
understand the Factory design pattern.

The factory method pattern defines an interface for creating 
an object, but lets subclasses decide which class to instantiate. 
Factory method lets a class defer instantiation to subclasses.
