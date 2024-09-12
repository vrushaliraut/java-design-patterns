# Practical Examples of Decorator Design Pattern in Java

- The Decorator Pattern is a structural design pattern that allows behavior to be added to individual objects,
- either statically or dynamically, without affecting the behavior of other objects from the same class.
- The pattern is based on the principle of wrapping or decorating objects to extend their functionality.

# step-by-step breakdown of implementing the Decorator Pattern:

- Step 1 - Define the Component Interface
    - defines the methods that will be implemented by both the base object and any decorators that add additional
      features
    - This ensures that both the base class and decorators share a common contract, allowing them to be interchangeable
    - public interface Beverage {
      String getDescription();
      double cost();
      }
- Step 2: Create Concrete Component
    - This is the Concrete Component class that implements the Component interface
    - This class contains the basic functionality that will be extended by decorators.

- Step 3: Create the Abstract Decorator Class
    - The Abstract Decorator Class implements the same interface as the concrete component and holds a reference to the
    - Component (in this case, a Beverage). The purpose of this class is to delegate calls to the Component and provide
    - a structure for adding extra behavior in concrete decorators.

- Step 4: Implement Concrete Decorators
    - Concrete Decorators extend the abstract decorator class and provide specific enhancements
    - or extensions to the core functionality.
    - Each decorator adds some functionality before or after delegating to the base component.

- Step 5: Use the Decorators in the Client Code
    - The client uses the decorators by wrapping the concrete component with various decorators dynamically at runtime.
    - The key point here is that both the base object (Coffee) and the decorators (MilkDecorator, SugarDecorator)
    - implement the same interface (Beverage), allowing them to be treated uniformly

## When to Apply the Decorator Pattern:

- **Dynamically Add Functionality:**
    - When you need to add behavior or responsibilities to an object dynamically without affecting other objects of the
      same class
- **Avoiding Class Explosion:** When subclassing leads to a large number of similar classes,
    - the decorator pattern avoids this by combining behaviors at runtime rather than in class definitions.
- **Open for Extension, Closed for Modification:**
    - Use the decorator pattern when you want to adhere to the Open/Closed Principle—where
    - a class should be open to extending its behavior but closed to modifying its structure
- **Flexible Combinations:**
    - Use this pattern when the behavior needs to be combined in different ways or
    - when you need multiple decorators that can be stacked together.