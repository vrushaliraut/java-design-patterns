# Payment Processing System

Scenario: An e-commerce system where users can choose different payment methods such as credit card,
PayPal, and bank transfer.

# Application of Strategy Pattern:
- Define an interface PaymentStrategy that includes a method pay().
- Implement different strategies like CreditCardPayment, PayPalPayment, and BankTransferPayment
- which follow the PaymentStrategy interface.
- The checkout process in the system will not depend on any specific payment method but on the selected strategy.

# When to Apply the Strategy Pattern
- **Frequent Changes in Algorithms:** 
  Use the strategy pattern when a class needs to switch between different algorithms or behaviors at runtime

- **Avoiding Complex Conditionals**
  - If you find yourself using complex conditional logic (e.g., if-else or switch-case) to select different behaviors
  - based on some condition, the strategy pattern can replace this with a cleaner, more maintainable structure.

- **Varying Only Behavior**
  - If the core functionality of an object remains the same but only a specific behavior varies, the strategy pattern
  - helps encapsulate this behavior, keeping the core logic clean.

- **Selecting a Strategy Dynamically:** 
- If you need to choose between different strategies dynamically at runtime based on 
- user input or context (e.g., different payment methods, compression formats, sorting algorithms)


# How to Apply the Strategy Pattern
- ** Define the Strategy Interface:**
  - Create an interface that encapsulates the common behavior (e.g., PaymentStrategy, SortStrategy, etc.). 
  - This interface will define the method(s) that each strategy will implement.
- ** Implement Concrete Strategies**
  - Implement the different algorithms or behaviors as separate classes that adhere to the strategy interface.
  - Each class should implement the specific strategy.
- ** Create a Context Class**
  - This class should maintain a reference to a strategy object. The context is responsible for delegating the behavior to the strategy object without knowing which strategy it is using.
  - The strategy is often set via a setter method or passed in the constructor.
- **Use Composition Over Inheritance** 
  - The strategy pattern promotes composition over inheritance by allowing objects to dynamically change their behavior 
  - through composition (the context contains a strategy) rather than through extending a class hierarchy
- **Avoid Tight Coupling:** The context class should not be tightly coupled to any specific strategy.
- **Decouple Client from Algorithms:** Ensure that the client code is unaware of the specific strategies and 
- can use any implementation of the strategy without knowing the underlying logic.

**Pros of Using the Strategy Pattern**
- Open/Closed Principle: Adding a new strategy doesn’t require modification of existing code.
- Code Reusability: Algorithms are decoupled from the context, making them reusable across different parts of the application.
- Separation of Concerns: By isolating different behaviors in separate strategy classes, you achieve better organization and clarity.
- Simplifies Complex Conditionals:

**Cons of Using the Strategy Pattern**
- Increased Number of Classes