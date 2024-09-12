# Adapter design pattern 

## Context :- 
- The Adapter design pattern in Java is a structural design pattern.
- Used to bridge the gap between two incompatible interfaces, allowing them to work together.
- It acts as a wrapper that adapts one interface to another expected by the client.

- ** Key Characteristics: ** 
- SRP - allows class to perform only one task. 
- OCP - you can introduce new adapters without modifying existing code. 

## Components of Adapter Pattern :
- Target Interface: The interface the client expects.
- Adaptee: The existing class that has a different interface.
- Adapter: The class that implements the Target interface and internally uses the Adaptee class, 
- converting the interface into a usable form.

## Improvements with adapter design pattern :- 
- Unified interface  
- Loose Coupling 
- Scalability 
- Extensibility 

## When to Use Adapter Design Pattern:

- Third-Party Libraries: When using a third-party library that doesn’t have the interface or method signature your application requires.
- Legacy Code: When integrating legacy systems or APIs that don't match your system’s current design.
- Interfacing Incompatible Systems: When you need to integrate components that are developed independently with incompatible interfaces.
- Modular Systems: To make a set of existing classes work with others without modifying their source code.

## Real-World Example Scenarios:

- ** Java IO Streams: ** 
- The Java IO system uses the Adapter pattern extensively, such as adapting an InputStream to Reader

** Database Drivers:** 
- JDBC drivers often use adapters to unify access to different database systems.

** GUI Frameworks:** 
- Swing or AWT libraries might use adapters to handle events for different platforms.

** Payment Integrations:** 
- Wrapping different payment APIs (PayPal, Stripe, etc.) into a single interface for a shopping cart system.