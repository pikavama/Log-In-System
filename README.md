# OOP Lab Assignment 4

## Description

This repository contains a Java program for an Object-Oriented Programming (OOP) Lab Assignment for Exception Handling. The program demonstrates the use of user-defined exceptions to handle login attempts and password validation.

### Functionality

The program allows users to log in with a predefined password ("password") with a maximum of three login attempts. Two custom exceptions are implemented:

1. **MaxAttemptsExceededException**: This exception is thrown when the user exceeds the maximum allowed login attempts.
2. **InvalidPasswordException**: This exception is thrown when the user enters an incorrect password.

### Usage

1. Clone the repository to your local machine.
2. Compile the Java files using a Java compiler.
3. Run the `LoginSystem` class.
4. Enter the password when prompted for login.
5. If the password is incorrect, an error message will be displayed. After three unsuccessful attempts, the account will be locked.
6. If the password is correct, a success message will be displayed, and the login process will be completed.

### Files

- **LoginSystem.java**: Contains the main Java program.
- **MaxAttemptsExceededException.java**: Defines the custom exception for exceeding the maximum login attempts.
- **InvalidPasswordException.java**: Defines the custom exception for an invalid password.

### Programmer's Name

- Pia Katleya V. Macalanda - piav.macalanda@gmail.com
