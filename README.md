# Online Grocery Store : 2nd semester Project 
## Team Member: Ekamleen Maan

## Project Overview

This **Online Grocery Store** project allows users to browse products, add items to their cart, and manage their purchases through an inventory management system. While the project includes basic user authentication (a password system). The project is intended to provide a basic online shopping experience with a focus on inventory management.

## Features

- **Product Listing**: Users can browse a wide variety of grocery products and select items for further information and images.
- **Shopping Cart**: Allows users to add/remove items from the cart and see the total price dynamically.
- **User Authentication**: A simple password-based authentication system for user login and account management.
- **Inventory Management for Owner**: To add new products, remove, update information about products
- **Basic Security**: Implements a password system for user accounts, though no advanced security protocols are in place.

## Technologies Used

- **Java**: Core programming language for the project.
- **JavaFX**: Used for building the graphical user interface.
- **JUnit**: Used for unit testing the application.
- **Object Oriented Programming**

## File Structure

- `Main.java`: Entry point for the application, responsible for initializing the JavaFX interface.
- `product.java`: Defines the `Product` class with attributes such as `name`, `price`, `category`, and stock management.
- `UserInfo.java`: Handles user data, including password management.
- `scene1.java`, `scene2.java`, `scene3.java`: JavaFX scenes that handle different parts of the user interface (home, product listing, inventory).
- `WlcmPage.java`: Implements the welcome page for user login and access to the store.

## How to Run the Project

1. **Clone the Repository**: Clone the project from GitHub using the following command:
   ```bash
   git clone <repository-url>
   ```
2. **Compile the Project**: Navigate to the project directory and compile the Java files using `javac`:
   ```bash
   javac *.java
   ```
3. **Run the Application**: Use the following command to run the application:
   ```bash
   java Main
   ```

## Future Enhancements

- **Secure Payment Gateway**: Integration of secure payment methods.
- **Email Notifications**: Implementing a system to send order confirmations and updates via email.
- **Order History**: Allow users to view their past orders.
- **Improved Security**: Strengthen the user authentication system and implement encryption for sensitive data.

## Project Images

Images showcasing the project (interface, inventory system) can be found by searching for similar JavaFX inventory management systems or by using sample images online.

## Contributing

1. Fork the project.
2. Create your feature branch (`git checkout -b feature/AmazingFeature`).
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`).
4. Push to the branch (`git push origin feature/AmazingFeature`).
5. Open a Pull Request.

## License

No license is required for this project.
