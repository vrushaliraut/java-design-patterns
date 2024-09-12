# Practical Examples to Apply Composite Design Pattern in Java

### File System (Directories and Files)
 - A classic example where directories can contain both files and other directories. 
 - Both files and directories can be treated as Component, and operations like size(), delete(), or display() can be applied uniformly to both.  

#### Manu and SubMenu 


# When to apply ? 
- When you have a hierarchical structure of objects and need to treat individual objects and groups of objects uniformly.
- When objects form tree structures, where you can perform common operations on both leaves and containers (composites).
- When you want to simplify client-side code by treating single objects and composite structures in the same way.

# How to Apply:

- **Component Interface:** 
  - Define a common interface (Component) that declares methods for both leaf and composite objects.
  
- **Leaf Class:** 
  - Implement Component for individual objects that do not have child objects.

- **Composite Class:** 
  - Implement Component for composite objects that can hold other components (leaf or composite). This class manages child components and delegates common operations to them.

- **Client:** 
  - Interacts with Component and doesn't need to worry about whether it's dealing with a single object or a composite.