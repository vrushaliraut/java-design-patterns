# Facade Design pattern

* Booking system in travel agency
    - Travel include flight booking, hotel booking, car rental and payment services.
    - TravelFacade can provide a single method like bookVacation()
* Logging Framework
* Banking System

## When to apply :-

- complex subsystem
- Loose coupling
- Multiple steps or interface

## How to apply :-

- Identify complex subsystem
- Create a facade class
- Decouple client code
- Extensibility

# Problem statement

In a travel booking system, booking a vacation package typically involves interacting with several services such as:

- FlightBookingService: For booking flights.
- HotelBookingService: For reserving hotels.
- CarRentalService: For renting cars.
- PaymentService: For processing payments.
- If you do not apply the Facade design pattern, the client must interact with each service individually,
- making the code complex. Using the Facade design pattern simplifies this by offering a unified interface to interact
  with all these services.

## Issues With This Approach:

- Complexity: The client code has to interact with multiple services, increasing complexity.
- Tight Coupling: The client is tightly coupled to all individual services.
- Any changes to service interfaces will require changes in the client code.
- Lack of Abstraction: The client code is responsible for knowing how to interact with all services
- and the order in which to call them.

- Design Facade pattern
- To simplify the client interaction, we apply the Facade design pattern by creating a TravelFacade class
- that internally manages all the services and provides a simplified interface to the client.

## Advantage :- 
- Simplified interface 
- Loose coupling
- Maintainability 
- Single responsibility 