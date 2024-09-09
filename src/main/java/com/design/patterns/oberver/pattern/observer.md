Give me a few practical example to apply Observable design pattern in java. 
Also give guidelines where and how to apply Observable design pattern?

# Practical Examples of Observable Design Pattern in Java
- The Observable design pattern, often used with Observer, helps establish a one-to-many relationship between objects,
- where an object (subject or observable) notifies its dependents (observers) when its state changes.

# Guidelines for Applying the Observable Design Pattern

## When to Apply the Observable Design Pattern:

**- Many Dependent Objects Need to Be Notified:**  
  - When an object’s state changes and multiple other objects need to be informed of this change. 
  - This pattern ensures automatic updates.
**Decoupling:** 
  - Use the pattern when you want to decouple the object being observed (subject/observable) from the objects observing it. 
  - The observable should not need to know who the observers are, only that they need to be notified
**Dynamic Subscriptions:**
  - When the number or type of observers can change dynamically at runtime

**Real-Time Updates:** 
  - If you need real-time updates to multiple clients, such as in stock monitoring, weather reporting, event systems

## How to Apply the Observable Design Pattern:
- **Identify the Observable (Subject):** 
 - Determine the object whose state will change and needs to notify multiple observers. 
 - This will be your observable or subject. 

- **Create the Observable Interface or Class:**
  - The observable class is responsible for maintaining the list of observers and notifying them when the state changes. 
  - In Java, this can be done via the Observable class, or you can implement a custom version

- **Create the Observer Interface**
  - Define an interface that the observers need to implement

- **Decouple Observers from the Observable:**
  - Ensure that observers are loosely coupled from the observable. 
  - Observers should subscribe to receive updates but should not directly manipulate the state of the observable.

- **Notify Observers of Changes:**
  - When the state of the observable changes, it should call the notifyObservers() method (or similar) to update all registered observers.

- **Flexible Observer Addition and Removal**
  - Flexible Observer Addition and Removal

## Pros of Using Observable Design Pattern
- Loose Coupling:
- Dynamic: Observers can be added or removed dynamically at runtime without changing the observable.
- Multiple Notifications : One observable can notify multiple observers without being tightly bound to them.