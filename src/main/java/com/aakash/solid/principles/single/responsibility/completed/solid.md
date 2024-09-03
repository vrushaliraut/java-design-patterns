# SOLID

## Single Responsibility Principle -

    Class should have only one reason to change

    - Why it matter? 
    - When a class has multiple responsibilities, changes in one area can inadvertently affect another,
    - making the system fragile and hard to maintain.

## Open closed principle (OCP)

    - Base Class should be open for extension and closed for modification 
    - Create new susbclasses , add new abstractions with interfaces 
    - classes, modules, functions open for extension and closed for modification 
    - Admin user and CustomerUser

    Why it is matter ? - 
    - promotes code reusability and reduces the risk of introducing bugs when extending functionality.

## LISKOV SUBSTITUTION PRINCIPLE
    - Objects of a superclass should be replaceable with objects of its subclasses without 
    - affecting the correctness of the program.
    
     Why it matters ? 
    - Ensures that a subclass can stand in for its superclass, promoting reliability and flexibility in code.
    - Admin - profile, permission 
    - ex - Ostrich can only eat but birds can be fly and eat

## Interface Segregation Principle
    Clients should not be forced to depend on interfaces they do not use. 
    Instead of one large, general-purpose interface, multiple smaller, specific interfaces are preferable.   
    
    Why It Matters:
    Reduces the impact of changes and promotes a more modular and flexible design

## Dependency Inversion Principle (DIP) -
    High-level modules should not depend on low-level modules. Both should depend on abstractions. 
    Additionally, abstractions should not depend on details; details should depend on abstractions.

    Why It Matters:
    Promotes decoupling between different parts of the system, enhancing flexibility and testability.

