
# 100 Days of Java 🇮🇳☕

![Java](https://img.shields.io/badge/Java-100%20Days-orange)
![GitHub last commit](https://img.shields.io/github/last-commit/dixitk941/java)
![GitHub stars](https://img.shields.io/github/stars/dixitk941/java?style=social)
![GitHub forks](https://img.shields.io/github/forks/dixitk941/java?style=social)

## About Java

### History
Java was developed by James Gosling and his team at Sun Microsystems and released in 1995. It was originally designed for interactive television, but it was too advanced for the digital cable television industry at the time. Java's primary goal was to be platform-independent, which led to the creation of the Java Virtual Machine (JVM). This feature has made Java a popular choice for web applications, mobile applications (Android), and enterprise solutions.

### Features
- **Platform Independence:** Java programs are compiled into bytecode, which can be run on any device equipped with a JVM.
- **Object-Oriented:** Everything in Java is treated as an object, which helps in modularizing and organizing the code.
- **Robust:** Java has strong memory management, exception handling, and a type-checking mechanism.
- **Secure:** Java provides a secure environment for developing applications through its built-in security features.
- **Multithreaded:** Java supports multithreading, allowing multiple threads to run concurrently.

## Learning Structure

### Day-by-Day Progress

- **Day 1-10:** Basics of Java
  - Variables, Data Types, Operators
  - Control Flow: if-else, loops
  - Functions and Methods
- **Day 11-20:** Data Structures
  - Arrays, Lists, Sets, Maps
  - Java Collections Framework
- **Day 21-30:** Advanced Topics
  - Generics, Enums, Annotations
  - Exception Handling
- **Day 31-40:** Object-Oriented Programming (OOP)
  - Classes and Objects
  - Inheritance, Polymorphism, Encapsulation
- **Day 41-50:** File Handling
  - Reading and Writing Files
  - Working with CSV and JSON files
- **Day 51-60:** Concurrency
  - Threads and Executors
  - Synchronization and Concurrent Collections
- **Day 61-70:** Networking
  - Sockets and Server-Socket
  - HTTP and Web Services
- **Day 71-80:** JavaFX
  - GUI Development
  - Event Handling
- **Day 81-90:** Spring Framework
  - Dependency Injection
  - Spring Boot
- **Day 91-100:** Final Projects
  - Putting it all together with real-world projects

## Topics Covered

### Basics of Java

#### Variables, Data Types, Operators

##### Variables
Variables are used to store data that can be used and manipulated throughout a program. Each variable in Java must be declared with a data type.

```java
int number = 10;
String message = "Hello, World!";
boolean isJavaFun = true;
```

##### Data Types
Java has two main types of data types:

1. **Primitive Data Types:** These include:
   - `byte`: 8-bit integer
   - `short`: 16-bit integer
   - `int`: 32-bit integer
   - `long`: 64-bit integer
   - `float`: single-precision 32-bit floating point
   - `double`: double-precision 64-bit floating point
   - `char`: single 16-bit Unicode character
   - `boolean`: true or false

2. **Non-Primitive Data Types:** These include classes, arrays, and interfaces.

##### Operators
Operators are special symbols that perform operations on variables and values. Java operators can be categorized into:
- **Arithmetic Operators:** `+`, `-`, `*`, `/`, `%`
- **Relational Operators:** `==`, `!=`, `>`, `<`, `>=`, `<=`
- **Logical Operators:** `&&`, `||`, `!`
- **Assignment Operators:** `=`, `+=`, `-=`, `*=`, `/=`, `%=`

### Control Flow: if-else, loops

#### if-else Statements
The `if` statement allows you to make decisions based on conditions. The `else` and `else if` statements provide alternative conditions.

```java
int age = 18;

if (age < 18) {
    System.out.println("You are a minor.");
} else if (age == 18) {
    System.out.println("You just became an adult.");
} else {
    System.out.println("You are an adult.");
}
```

#### Loops
Loops allow you to execute a block of code repeatedly.

- **for Loop:**
  ```java
  for (int i = 0; i < 5; i++) {
      System.out.println(i);
  }
  ```

- **while Loop:**
  ```java
  int i = 0;
  while (i < 5) {
      System.out.println(i);
      i++;
  }
  ```

- **do-while Loop:**
  ```java
  int i = 0;
  do {
      System.out.println(i);
      i++;
  } while (i < 5);
  ```

### Functions and Methods

In Java, the terms "functions" and "methods" are often used interchangeably. However, technically, a function that is part of a class is called a method.

#### Functions
A function is a block of code that performs a specific task, and it can be called by its name.

```java
public class MyClass {
    // This is a function
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int sum = add(5, 3); // Calling the function
        System.out.println("Sum: " + sum);
    }
}
```

#### Methods
Methods are functions that are associated with an object. They define the behavior of the objects created from a class.

```java
public class MyClass {
    // This is a method
    public void displayMessage() {
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass(); // Creating an object
        obj.displayMessage(); // Calling the method on the object
    }
}
```

## Summary
- **Variables:** Used to store data values.
- **Data Types:** Specify the type of data that can be stored in a variable.
- **Operators:** Symbols that perform operations on variables and values.
- **Control Flow:** Directs the order of execution of the statements in a program using `if-else` statements and loops (`for`, `while`, `do-while`).
- **Functions and Methods:** Functions perform specific tasks and can be called by name; methods are functions associated with objects.

These basics form the foundation of Java programming. As you progress, you'll build on these concepts to develop more complex and powerful applications.

## Resources

- [Official Java Documentation](https://docs.oracle.com/en/java/)
- [Java Programming and Software Engineering Fundamentals](https://www.coursera.org/specializations/java-programming)
- [Java Code Geeks](https://www.javacodegeeks.com/)
- [Geeks for Geeks](https://www.geeksforgeeks.org/java/)

## How to Use This Repository

1. Clone the repo:
   \```sh
   git clone https://github.com/dixitk941/java.git
   \```
2. Navigate to the project directory:
   \```sh
   cd java
   \```
3. Follow along each day's progress and code along with the exercises.

## Contributing

Feel free to fork this repository and make your own contributions. Pull requests are welcome!

## Contact

If you have any questions or suggestions, feel free to reach out to me:

- LinkedIn: [Karan Dixit](https://www.linkedin.com/in/karan-dixit-7223a628a/)

---

Happy coding! Let's become Java gurus together! 🎉

---

**Jai Hind! 🇮🇳**