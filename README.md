# online-store-java

Here's the updated README incorporating JavaFX, Maven, and the OOP approach:

---

# Online Grocery Store

## Project Overview

This **Online Grocery Store** project is designed using **Java**, **JavaFX**, and **Maven** to provide a user-friendly interface for customers to browse, add products to their cart, and make purchases. The project follows the principles of **Object-Oriented Programming (OOP)** to manage the system's components such as products, users, and orders.

## Features

- **Product Listing**: Displays a variety of grocery products, categorized for easy browsing.
- **Search Functionality**: Allows users to search for specific products based on keywords.
- **Shopping Cart**: Users can add or remove items from the shopping cart and see the total price in real time.
- **User Authentication**: Supports user registration and login, ensuring personalized shopping sessions.
- **Checkout Process**: Enables a secure checkout with multiple payment options.
- **Modular Design**: Built with OOP principles for easy maintenance and feature expansion.

## Object-Oriented Design

This project adheres to the principles of **Object-Oriented Programming (OOP)**, such as:

- **Encapsulation**: Key components such as `Product`, `User`, and `Order` are encapsulated within their respective classes, exposing only necessary interfaces.
- **Inheritance**: Common attributes and methods are shared between classes using inheritance (e.g., base classes for different types of users or products).
- **Polymorphism**: The project uses method overriding and interfaces for flexibility in handling different user actions and payment methods.
- **Abstraction**: Complex processes, such as payment and order tracking, are abstracted into methods to simplify the interface for the user.

## Technologies Used

- **Java**: Core language used for backend and business logic.
- **JavaFX**: For building the graphical user interface.
- **Maven**: For managing dependencies and building the project.
- **JUnit**: For unit testing to ensure code quality.

## File Structure

- `Main.java`: Entry point of the application, responsible for initializing the JavaFX interface.
- `product.java`: Defines the `Product` class with attributes such as `name`, `price`, and `category`.
- `UserInfo.java`: Manages user data, including registration and login functionality.
- `scene1.java`, `scene2.java`, `scene3.java`: JavaFX scenes representing different parts of the user interface (home, product listing, checkout).
- `WlcmPage.java`: Implements the welcome screen for the application.

## How to Run the Project

1. **Clone the Repository**: Clone the project from GitHub using the following command:
   ```bash
   git clone <repository-url>
   ```
2. **Install Maven Dependencies**: Navigate to the project directory and install dependencies:
   ```bash
   mvn clean install
   ```
3. **Run the Application**: Use Maven to run the JavaFX application:
   ```bash
   mvn javafx:run
   ```

## Future Enhancements

- **Mobile App Integration**: Add support for mobile platforms.
- **Order History**: Implement a feature that allows users to view their past orders.
- **Discount Codes**: Introduce support for discount codes and special offers.
- **Admin Panel**: Develop an admin interface to manage inventory, users, and orders.

## Contributing

1. Fork the project.
2. Create your feature branch (`git checkout -b feature/AmazingFeature`).
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`).
4. Push to the branch (`git push origin feature/AmazingFeature`).
5. Open a Pull Request.

## License

This project is licensed under the MIT License - see the LICENSE file for details.

---

Does this version cover everything you wanted, or would you like any more changes?