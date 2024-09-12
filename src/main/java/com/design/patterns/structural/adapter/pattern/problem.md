## Problem statement :-
- You have two payment systems, PayPal and Stripe, and both have their own unique methods for processing payments.
- In the client code, you need to call each payment system's method directly, leading to tightly coupled and less
  flexible code.

# Problems with this approach

- Tight Coupling - The client code is tightly coupled to specific payment system implementations (PayPal, Stripe).
  - If a new payment system is introduced, you need to modify the client code.
- No Unified Interface -
  - There is no unified way to interact with different payment systems
- Scalability -
  - As more payment gateways (like Apple Pay, Google Pay) are added, the client code will become increasingly complex, 
  - requiring additional if-else or direct method calls for each new payment system.


