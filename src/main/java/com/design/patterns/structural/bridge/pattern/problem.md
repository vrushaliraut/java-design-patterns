- Problem statement

- normal real-world example without using the Bridge design pattern.
- We'll simulate a scenario where you are building an application that manages different notification types
- (e.g., Email and SMS) for various channels (e.g., Promotional and Transactional notifications).
- Without the Bridge pattern, this implementation may lead to a tight coupling between
- notification types and channels, causing a class explosion and making the code difficult to maintain

- Scenario :
- You have two notification types: Email and SMS.
- You also have two notification channels: Promotional and Transactional.
- In this setup, every combination of notification type and channel needs a separate class.

# Problems with This Approach:

- Class Explosion:
    - If you have more types of notifications (e.g., Push Notifications) and more channels (e.g., Reminder, Alert),
    - you would need to create a new class for every combination of notification type and channel, leading to an
      explosion of classes
- Tight Coupling:
    - The notification types (Email, SMS) are tightly coupled with their specific channels (Promotional, Transactional).
    - Adding new notification types or channels requires modifying multiple classes
- Scalability:

## Applying the Bridge Design Pattern:

- To solve the issues of class explosion and tight coupling, we can apply the Bridge design pattern.
- The Bridge pattern allows us to decouple the notification types from the notification channels, so that both can vary
  independently.
- This allows us to create new combinations of notifications without creating new classes for each combination.

## Solution:

- Abstraction:
    - The Notification class defines the interface for sending notifications.
- Implementation:
    - The NotificationChannel interface represents different channels (e.g., Promotional, Transactional).
- Concrete Implementations:
    - Different notification types (Email, SMS, etc.) can be implemented independently of the channels.
