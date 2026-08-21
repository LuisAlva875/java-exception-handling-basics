# Java Exception Handling Basics

A simple Java console application that demonstrates basic exception handling using a `try-catch` block. The program continuously accesses command-line arguments until an exception occurs, allowing the application to demonstrate how runtime exceptions can be captured and handled.

## Overview

The application attempts to access the elements contained in the `args` array using an infinite loop.

When the program attempts to access an array position that does not exist, an exception is thrown. The exception is captured by the `catch` block, which displays a termination message and ends the program.

This exercise demonstrates the basic structure of exception handling in Java.

## Concepts Demonstrated

- Java exception handling
- `try-catch` blocks
- Runtime exceptions
- Command-line arguments
- Array access
- Infinite loops
- Program termination with `System.exit()`
- Basic console input and output

## Project Structure

```text
java-exception-handling-basics/
│
├── assets/
│   └── images/
│       ├── execution_with_arguments.jpg
│       └── execution_without_arguments.jpg
│
├── src/
│   └── ejercicio1/
│       └── TestExceptions.java
│
├── README.md
└── LICENSE
```

## Source Code

### `TestExceptions.java`

```java
package ejercicio1;

public class TestExceptions {

    public static void main(String[] args) {
        try {
            for (int i = 0; true; i++) {
                System.out.println(
                    "args[" + i + "] is '" + args[i] + "'"
                );
            }
        } catch (Exception e) {
            System.out.println("Termino anormal");
            System.exit(0);
        }
    }
}
```

## How It Works

The application starts an infinite `for` loop:

```java
for (int i = 0; true; i++)
```

During every iteration, the program attempts to access an element of the `args` array:

```java
args[i]
```

As long as the current index exists, the corresponding command-line argument is printed.

Eventually, the index exceeds the number of available arguments and Java throws an exception. This exception is captured by the following block:

```java
catch (Exception e)
```

The program then displays the message:

```text
Termino anormal
```

Finally, the application terminates using:

```java
System.exit(0);
```

## Execution

The program can be executed from an IDE such as NetBeans or from the command line.

### Example with command-line arguments

For example, if the application receives the following arguments:

```text
Hello Java
```

The output will be similar to:

```text
args[0] is 'Hello'
args[1] is 'Java'
Termino anormal
```

After processing the available arguments, the program attempts to access a position outside the array and the exception is handled.

### Example without command-line arguments

If the application is executed without arguments, the program immediately attempts to access:

```java
args[0]
```

Since the array does not contain any elements, an exception occurs and the output is:

```text
Termino anormal
```

## Screenshots

### Execution with Command-Line Arguments

![Execution with Arguments](assets/images/execution_with_arguments.jpg)

The application prints the available command-line arguments before attempting to access an invalid array position.

### Execution without Command-Line Arguments

![Execution without Arguments](assets/images/execution_without_arguments.jpg)

The application immediately handles the exception because no command-line arguments are available.

## Expected Behavior

The application behaves as follows:

1. Starts an infinite loop.
2. Attempts to access command-line arguments sequentially.
3. Prints each available argument.
4. Reaches an invalid array position.
5. Throws an exception.
6. Captures the exception using a `catch` block.
7. Displays a termination message.
8. Ends the program.

## Requirements

- Java Development Kit (JDK) 8 or later
- NetBeans, IntelliJ IDEA, Eclipse, or another Java-compatible IDE

## Learning Objectives

This project was created to practice and demonstrate:

- Handling exceptions in Java
- Using `try-catch` blocks
- Working with command-line arguments
- Understanding runtime errors caused by invalid array access
- Controlling application termination
- Writing basic console applications

## Notes

The program catches the generic `Exception` class in order to demonstrate the basic mechanics of exception handling.

For more specific exception management, the program could catch the particular exception generated when an invalid array index is accessed.

## Author

Luis Alva
