# Problem statement

- Imagine you have files and directories
- Directories can contain subdirectories and file structure.
- Design this system using composite design pattern 


# What are problems without composite design pattern - 
- Manual management of subdirectories and files - Directory has File objects and Directory Object. 
- Recursive methods - We need to use recursive methods - getTotalSize() and displayStructure() 
- to handle hierarchical structure of directories, containing subdirectories. 
- Client-side logic - The client code is responsible for manually creating relationships between directories 
- and subdirectories, which introduces the possibility of errors and code duplication

# Problems with this approach - 
- Tight coupling 
- Limited scalability
- Duplication of logic

# Benefits of Using Composite Design Pattern Instead

- Unified Treatment: Both File and Directory can implement the same FileSystemComponent interface, allowing unified treatment of both.
- This removes the need for duplicating logic in the methods.
- Cleaner Code
- Scalability 
- Extensibility