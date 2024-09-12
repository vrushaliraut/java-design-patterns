# Flyweight Design Pattern in Java

- The Flyweight pattern is used to reduce the memory footprint by sharing as much data as possible with similar objects. 
- It's especially useful when you have many objects that share similar state and 
- you want to minimize memory usage by reusing existing objects rather than creating new ones.

## Guidelines for Applying Flyweight Pattern
- Use when - 
  - There are a large number of similar objects.
  - You can group object states into intrinsic (shared) and extrinsic (not shared) states.
  - Memory optimization is a key concern.
##  How to Apply 
- Identify shared and not shared properties of the objects.
- Keep intrinsic data shared within the flyweight object and pass extrinsic data during object use.
- Use a factory to manage and reuse the flyweight objects.

## Benefits 
- Reduced memory usage 
- Scalability 
- Improved performance
