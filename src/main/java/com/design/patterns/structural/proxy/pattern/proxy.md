## Practical Examples to Apply Proxy Method Design Pattern in Java

- Remote Proxy:-
- A remote proxy controls access to an object that resides in a different address space
- example - Accessing a remote service such as a database, API, or messaging service through a proxy object
- that handles the communication details and networking aspects
- Virtual Proxy -
    - A virtual proxy is used to control a access to a resources that may be expensive to instantiate or may be not
      needed right away
- Protection proxy -
    - A protection proxy controls access to the original object, allowing only authorized requests or restricting
      operations based on user roles
    - example-
        - : Protecting sensitive operations like updating or deleting records in an application. The proxy would check
          user permissions before allowing access to the original operation
- Caching proxy -
    - A caching proxy stores the results of expensive operations and returns the cached results when the same operations
      are requested again.
    - Querying a remote API or database with frequently accessed data, and caching the result to avoid repeating the
      same query multiple times.

## When to apply -

- When you need to control access to an object, particularly for reasons like lazy initialization, caching, access
  control, logging, or remote access.
- If the object being represented is expensive to instantiate or load.

## How to apply -

- Create an interface for the original object.
- Implement the original class with all functionalities.
- Create a proxy class that implements the same interface and controls access to the real object.
- The proxy can handle additional concerns like logging, access control, caching, or lazy loading.

## Advantage -

- Lazy loading
- Decoupling
- Performance

## Problem statement -

Let’s create a more detailed example of a Wallet system using the Proxy Design Pattern. The wallet will hold funds, and
only authenticated users will be able to deposit, withdraw, or check the balance. The Proxy will handle authentication
and protect access to the real wallet object.

- We'll break it down into:
- Without the Proxy Pattern: A basic wallet system with no access control.
- With the Proxy Pattern: A wallet system with access control via a proxy.
