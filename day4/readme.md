
# Basics of Java 🇮🇳☕

## Variables, Data Types, Operators

### Variables
Variables are used to store data that can be used and manipulated throughout a program. Each variable in Java must be declared with a data type.

```java
int number = 10;
String message = "Hello, World!";
boolean isJavaFun = true;
```

### Data Types
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

### Operators
Operators are special symbols that perform operations on variables and values. Java operators can be categorized into:
- **Arithmetic Operators:** `+`, `-`, `*`, `/`, `%`
- **Relational Operators:** `==`, `!=`, `>`, `<`, `>=`, `<=`
- **Logical Operators:** `&&`, `||`, `!`
- **Assignment Operators:** `=`, `+=`, `-=`, `*=`, `/=`, `%=`

## Control Flow: if-else, loops

### if-else Statements
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

### Loops
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

## Functions and Methods

In Java, the terms "functions" and "methods" are often used interchangeably. However, technically, a function that is part of a class is called a method.

### Functions
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

### Methods
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

---

**Jai Hind! 🇮🇳**