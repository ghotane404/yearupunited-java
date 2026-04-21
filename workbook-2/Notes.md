# Java Study Guide

I'm tired

## Table of Contents

1. [How Programming Works](#1-how-programming-works)
    1. [What programming is](#11-what-programming-is)
    2. [Precision and ambiguity](#12-precision-and-ambiguity)
    3. [Pseudocode](#13-pseudocode)
2. [Binary, Bits, Bytes, and Storage](#2-binary-bits-bytes-and-storage)
    1. [Binary basics](#21-binary-basics)
    2. [Bits vs bytes](#22-bits-vs-bytes)
    3. [32-bit vs 64-bit](#23-32-bit-vs-64-bit)
    4. [Memory sizes and number sizes](#24-memory-sizes-and-number-sizes)
3. [Java Platform Basics](#3-java-platform-basics)
    1. [Java, JVM, JRE, and JDK](#31-java-jvm-jre-and-jdk)
    2. [Compiling Java](#32-compiling-java)
4. [Java Syntax and Variables](#4-java-syntax-and-variables)
    1. [Basic syntax rules](#41-basic-syntax-rules)
    2. [Primitive vs non-primitive types](#42-primitive-vs-non-primitive-types)
    3. [Number types and sizes](#43-number-types-and-sizes)
    4. [char, boolean, and String](#44-char-boolean-and-string)
    5. [Variables and naming](#45-variables-and-naming)
    6. [Constants and default values](#46-constants-and-default-values)
    7. [Stack vs heap](#47-stack-vs-heap)
5. [Operators and Expressions](#5-operators-and-expressions)
    1. [Math operators](#51-math-operators)
    2. [Order of operations](#52-order-of-operations)
    3. [Increment and decrement](#53-increment-and-decrement)
    4. [Type casting](#54-type-casting)
    5. [Assignment operators](#55-assignment-operators)
    6. [Math class](#56-math-class)
6. [Working with Output and Input](#6-working-with-output-and-input)
    1. [Printing to the console](#61-printing-to-the-console)
    2. [Reading input with Scanner](#62-reading-input-with-scanner)
    3. [The nextLine trap](#63-the-nextline-trap)
7. [Conditionals and Decision Making](#7-conditionals-and-decision-making)
    1. [if](#71-if)
    2. [if / else / else if](#72-if--else--else-if)
    3. [Logical operators](#73-logical-operators)
    4. [Comparing Strings correctly](#74-comparing-strings-correctly)
    5. [switch](#75-switch)
    6. [Ternary operator](#76-ternary-operator)
8. [Methods](#8-methods)
    1. [Why methods matter](#81-why-methods-matter)
    2. [Declaring methods](#82-declaring-methods)
    3. [Parameters and return values](#83-parameters-and-return-values)
    4. [Using Scanner in multiple methods](#84-using-scanner-in-multiple-methods)
9. [Strings](#9-strings)
    1. [String basics](#91-string-basics)
    2. [Useful String methods](#92-useful-string-methods)
    3. [split, indexOf, and substring](#93-split-indexof-and-substring)
    4. [Converting Strings to numbers and dates](#94-converting-strings-to-numbers-and-dates)
    5. [StringBuilder](#95-stringbuilder)
10. [Object-Oriented Programming and Encapsulation](#10-object-oriented-programming-and-encapsulation)
1. [Class vs object](#101-class-vs-object)
2. [Encapsulation](#102-encapsulation)
3. [Fields, constructors, getters, and setters](#103-fields-constructors-getters-and-setters)
4. [Derived properties](#104-derived-properties)
5. [Access modifiers and packages](#105-access-modifiers-and-packages)
11. [Overloading and Method Signatures](#11-overloading-and-method-signatures)
1. [What a signature is](#111-what-a-signature-is)
2. [Overloading methods](#112-overloading-methods)
3. [Overloading constructors](#113-overloading-constructors)
12. [Loops](#12-loops)
1. [while](#121-while)
2. [do/while](#122-dowhile)
3. [for](#123-for)
4. [break and continue](#124-break-and-continue)
5. [Loop scope and common mistakes](#125-loop-scope-and-common-mistakes)
13. [Arrays](#13-arrays)
1. [Creating arrays](#131-creating-arrays)
2. [Indexes](#132-indexes)
3. [for and for-each loops with arrays](#133-for-and-for-each-loops-with-arrays)
4. [Passing and returning arrays](#134-passing-and-returning-arrays)
5. [Sorting and copying arrays](#135-sorting-and-copying-arrays)
14. [Common Quiz Mistakes to Remember](#14-common-quiz-mistakes-to-remember)
15. [Practice Problems](#15-practice-problems)
16. [Quick Cheat Sheet](#16-quick-cheat-sheet)

---

## 1. How Programming Works

### 1.1 What programming is

Programming is giving a computer exact instructions, step by step. 

Humans can guess missing details. 

Computers cannot. 

They will do exactly what you wrote, even when what you wrote is nonsense.


</br>


### 1.2 Precision and ambiguity

A big beginner skill is learning to be precise.

Human instruction:

> “Make scrambled eggs.”

Programming-style instruction:

1. Get eggs.
2. Get skillet.
3. Turn on stove.
4. Crack eggs into skillet.
5. Stir until cooked.
6. Turn off stove.

The lesson is simple: computers need exact steps and clear conditions.

### 1.3 Pseudocode

Pseudocode means writing program steps in plain English before writing real code.

Example:

```text
Ask user for age

If age is less than 18
    print "Minor"

Else
    print "Adult"
```

Use pseudocode when:

- the problem feels confusing
- you want to plan logic first
- you want to catch missing steps before coding

---

## 2. Binary, Bits, Bytes, and Storage

### 2.1 Binary basics

Computers process data in **binary**, which uses only `0` and `1`.

Each position in binary is a power of 2.

Example:

| binary power of 2: | 128 | 64 | 32 | 16 | 8 | 4 | 2 | 1 |
|--------------------|---|---|---|---|---|---|---|---|
| bit:               | 1 | 0 | 1 | 0 | 1 | 1 | 1 | 0 |
```text
= 128 + 32 + 8 + 4 + 2 
= 174
```

Example 2:
```text
1011 0101

= 128 + 32 + 16 + 4 + 1
= 181
```

### 2.2 Bits vs bytes

- **bit** = one binary digit, `0` or `1`
- **byte** = 8 bits

Storage units:

- 1 KB = 1024 bytes
- 1 MB = 1024 KB
- 1 GB = 1024 MB
- 1 TB = 1024 GB

### 2.3 32-bit vs 64-bit

This describes how much data a processor can work with at one time.

- **32-bit** systems handle smaller numbers and less memory
- **64-bit** systems handle much larger values and more memory

### 2.4 Memory sizes and number sizes

Common Java numeric sizes:

| Type | Size | Example Range / Notes |
|---|---:|---|
| `byte` | 8 bits | -128 to 127 |
| `short` | 16 bits | -32,768 to 32,767 |
| `int` | 32 bits | about -2.1 billion to 2.1 billion |
| `long` | 64 bits | very large whole numbers |
| `float` | 32 bits | decimals, less precise |
| `double` | 64 bits | decimals, more precise |
| `char` | 16 bits | one Unicode character |
| `boolean` | logical | `true` or `false` |

Important:

- `float` and `double` are **not good for money** when exact precision matters.
- `String` is **not primitive**.

---

## 3. Java Platform Basics

### 3.1 Java, JVM, JRE, and JDK

- **Java**: the programming language
- **JVM**: Java Virtual Machine, runs Java bytecode
- **JRE**: Java Runtime Environment, lets you run Java apps
- **JDK**: Java Development Kit, lets you build Java apps

Easy memory trick:

- Want to **run** Java? You need the **JRE**.
- Want to **write** Java? You need the **JDK**.

### 3.2 Compiling Java

Java source code is compiled into **bytecode**.

```text
.java source file -> compiled by javac -> .class bytecode file -> run by JVM
```

If your code has syntax errors, it will not compile.

---

## 4. Java Syntax and Variables

### 4.1 Basic syntax rules

Java rules you need to remember:

- Java is **case-sensitive**
- statements usually end with `;`
- code blocks use `{ }`
- single-line comments use `//`
- multi-line comments use `/* ... */`

**Example**:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}
```

### 4.2 Primitive vs non-primitive types

**Primitive types** store simple values directly:

```java
byte, short, int, long, float, double, char, boolean
```

**Non-primitive types** include:

```java
String, arrays, classes, interfaces
```

### 4.3 Number types and sizes

**Example declarations**:

```java
byte smallNumber = 100;
short mediumNumber = 30000;
int age = 25;
long worldPopulation = 8000000000L;
float price = 19.99f;
double pi = 3.14159;
```

**Notes**:

- `long` often needs `L` at the end
- `float` needs `f` at the end
- `double` is the default decimal type

### 4.4 char, boolean, and String

```java
char grade = 'A';
boolean isPassing = true;
String name = "Linus";
```

Remember:

- `char` uses **single quotes**
- `String` uses **double quotes**

### 4.5 Variables and naming

A variable stores a value.

```java
int score = 100;
String firstName = "Dana";
```

Good naming:

```java
int studentCount;
double totalPrice;
String lastName;
```

Bad naming:

```java
int x;
String stuff;
double thing;
```

Use **camelCase** for variables and methods.

### 4.6 Constants and default values

A constant uses `final`.

```java
final double TAX_RATE = 0.10;
```

**General style**:

- constants are often written in `UPPER_CASE`

### 4.7 Stack vs heap

From the quiz:

- **Primitive types** are managed on the **stack**
- **Reference types** like `String` and objects are managed on the **heap**

Another way:

- Stack = Direct simple values
- Heap = Objects and referenced data

---

## 5. Operators and Expressions

### 5.1 Math operators

```java
int a = 10;
int b = 3;

System.out.println(a + b); // 13
System.out.println(a - b); // 7
System.out.println(a * b); // 30
System.out.println(a / b); // 3
System.out.println(a % b); // 1
```

`%` gives the remainder.

Example:

```java
if (number % 2 == 0) {
    System.out.println("Even");
}
```

### 5.2 Order of operations

Java follows normal math order of operations.

Example:

```java
int x = 15 + 5 * 3;
System.out.println(x); 

// Output: 30
```

Because multiplication happens before addition.

Use parentheses when needed:

```java
int y = (15 + 5) * 3; 

// Output: 60
```

### 5.3 Increment and decrement

```java
int i = 5;
i++;
// Same as i = i + 1
// Output: 6


int i = 5;
i--; 
// Same as i = i - 1
// Output: 4
```

### 5.4 Type casting

Type casting converts one type to another.

```java
double price = 9.99;
int whole = (int) price; 

// Output: 9
```

**Be careful**: narrowing conversions may lose data.

</br>

### 5.5 Assignment operators

```java
int sum = 6;
sum += 5; 
// same as sum = sum + 5
// Output: 11


int sum = 6;
sum -= 2; 
// same as sum = sum - 2
// Output: 4

int sum = 6;
sum *= 3; 
// same as sum = sum * 3
// Output: 18

int sum = 6;
sum /= 2; 
// same as sum = sum / 2
// Output: 3
```

### 5.6 Math class

Useful methods:

```java
System.out.println(Math.max(10, 20)); // 20
System.out.println(Math.min(10, 20)); // 10
System.out.println(Math.sqrt(25));    // 5.0
System.out.println(Math.random());    // random decimal from 0.0 to <1.0
```

Random number in a range:

```java
int minValue = 1;
int maxValue = 6;
int randomNumber = (int)(Math.random() * maxValue) + minValue;
```

---

## 6. Working with Output and Input

### 6.1 Printing to the console

```java
System.out.println("Hello");   // prints "Hello" and then moves to the next line
System.out.print("Hi ");       // prints "Hi " and stays on the same line
System.out.print("there");     // prints "there" on the same line as the previous print
```

Output: 

```java
Hello
Hi there
```

</br>

Formatted output:

```java
String name = "Geri";
double price = 12.5;

System.out.printf("Name: %s Price: %.2f%n", name, price);
// %s prints the String value of name
// %.2f prints price as a decimal with 2 digits after the decimal
// %n moves to the next line
```

Note:
Common Java printf format specifiers are:
- `%s` = String 
- `%d` = integer (int)
- `%f` = decimal number (float or double)
- `%c` = single character (char)
- `%b` = boolean (true / false)
- `%n` = new line 
- `%%` = prints a percent sign

Example: 
```java
String name = "Dana";
int age = 25;
double price = 19.99;
char grade = 'A';
boolean isOpen = true;

System.out.printf("%s%n", name);     // Dana
System.out.printf("%d%n", age);      // 25
System.out.printf("%f%n", price);    // 19.990000
System.out.printf("%.2f%n", price);  // 19.99
System.out.printf("%c%n", grade);    // A
System.out.printf("%b%n", isOpen);   // true
System.out.printf("100%% done%n");   // 100% done
```


</br>

### 6.2 Reading input with Scanner

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello " + name + ", age " + age);
    }
}
```

### 6.3 The nextLine trap

A very common beginner problem:

```java
int age = scanner.nextInt();

String name = scanner.nextLine(); // often reads empty line
```

Why? `nextInt()` leaves the newline behind.

The Fix:

```java
int age = scanner.nextInt();
scanner.nextLine(); // consume leftover newline

String name = scanner.nextLine();
```

---

## 7. Conditionals and Decision Making

### 7.1 if

```java
int age = 17;

if (age < 18) {
    System.out.println("Minor");
}
```

### 7.2 if / else / else if

```java
int age = 70;
double price;

if (age < 18) {
    price = 18.00;
} 
else if (age < 65) {
    price = 25.00;
} 
else {
    price = 18.00;
}
```

### 7.3 Logical operators

- `&&` = and
- `||` = or
- `!` = not

```java
if (age < 18 || age >= 65) {
    System.out.println("Discount applies");
}
```

### 7.4 Comparing Strings correctly

Do **not** use `==` to compare string contents.

Wrong:

```java
if (name == "Linus") {
    // not reliable
}
```

Right:

```java
if (name.equals("Linus")) {
    System.out.println("Match");
}
```

Ignore case:

```java
if (name.equalsIgnoreCase("linus")) {
    System.out.println("Match");
}
```

### 7.5 switch

Use `switch` when you are checking one value against multiple fixed choices.

```java
int dayNumber = 3;   // stores the day as a number
String description;   // will store whether the day is a weekday or weekend

switch (dayNumber) {   // checks the value of dayNumber

    // case 0 and case 6 are grouped together
    // because both of these values should mean "Weekend"
    // example: 0 = Sunday, 6 = Saturday
    case 0:
    case 6:
        description = "Weekend";   // if dayNumber is 0 or 6, set description to Weekend
        break;             // stop the switch here
    
    // case 1 through 5 are grouped together
    // because all of these values should mean "Weekday"
    // example: 1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 = Friday
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
         description = "Weekday";   // if dayNumber is 1, 2, 3, 4, or 5, set description to Weekday
         break;             // stop the switch here
    
    // default runs if dayNumber does not match any case above
    default:
         description = "Invalid day";   // used for numbers outside 0 through 6
}
```

If you forget `break`, execution can fall into the next case.

### 7.6 Ternary operator

The conditional operator is a short form of `if / else`.

Example: 

```java
int age = 20;

String type = (age >= 18) ? "Adult" : "Minor";
```

Which is the same as: 

```java
int age = 20;
String type;

if (age >= 18) {
    type = "Adult";
} 
else {
    type = "Minor";
}
```



---

## 8. Methods

### 8.1 Why methods matter

Methods break code into smaller reusable parts.

Benefits:

- easier to read
- easier to test
- easier to reuse
- easier to debug

### 8.2 Declaring methods

```java
public class Main {
    public static void main(String[] args) {
        sayHello(); // how to call the method
    }
    
    // this is the method - sayHello()
    // should be outside the main
    public static void sayHello() {
        System.out.println("Hello");
    }
```

### 8.3 Parameters and return values

```java
// int a and int b are the parameters
public static int add(int a, int b) {
    return a + b;   // returns the sum of a and b
}

public static void main(String[] args) {
    int result = add(3, 4);   // 3 and 4 are the arguments
    System.out.println(result);
    // Output: 7
}
```

### 8.4 Using Scanner in multiple methods

You can either:

- create the `Scanner` once and pass it into methods
- or create one shared scanner carefully

Good approach:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // creates a Scanner object so the program can read keyboard input
        Scanner scanner = new Scanner(System.in);

        // calls the getName method and stores the returned name in the variable "name"
        String name = getName(scanner);

        // prints a greeting using the name the user entered
        System.out.println("Hello " + name);
    }

    public static String getName(Scanner scanner) {
        // asks the user to type their name
        System.out.print("Enter your name: ");

        // reads the full line the user types and returns it back to main
        return scanner.nextLine();
    }
}
```

---

## 9. Strings

### 9.1 String basics

Strings store text.

```java
String welcome = "Hello";
String quote = "Big Tex says \"Howdy\"!";
```

Output: 

```java
Hello
Big Tex says "Howdy"!
```

Useful escape sequences:

- `\n` newline
- `\t` tab
- `\"` quote inside a string

### 9.2 Useful String methods

```java
String fullName = " Dana Wyatt ";

System.out.println(fullName.length());      // includes spaces
System.out.println(fullName.trim());        // removes edges
System.out.println(fullName.toUpperCase()); // uppercase
System.out.println(fullName.toLowerCase()); // lowercase
```

Other useful checks:

```java
String fileName = "grades.csv";

System.out.println(fileName.endsWith(".csv"));   // true
System.out.println(fileName.startsWith("grad")); // true
System.out.println(fileName.contains("ade"));    // true
```

### 9.3 split, indexOf, and substring

Split a string into pieces:

- `split(",")` breaks the string apart anywhere there is a comma 
- pieces get stored in the items array 
- each piece has an index number

```java
String foods = "apples,bananas,oranges,grapes";
String[] items = foods.split(",");
// items[0] = "apples"
// items[1] = "bananas"
// items[2] = "oranges"
// items[3] = "grapes"
System.out.println(items[0]); 
// Output: apples
```

</br>


Use `indexOf` plus `substring`:
- `indexOf(",")` finds the position of the first comma 
- `substring(0, index)` starts at position 0 and stops right before the comma 
- that gives you the first word: `apples`


```java
String foods = "apples,bananas,oranges,grapes";
int index = foods.indexOf(",");
String firstItem = foods.substring(0, index);
System.out.println(firstItem);
// Output: apples
```

- `indexOf(",")` = “where is the comma?”
- `string(0, index)` = “give me everything from the beginning up to that comma”

```java
a p p l e s , b a n a n a s , o r a n g e s , g r a p e s
0 1 2 3 4 5 6 7 8 9 ...
```



```java
String foods = "apples,bananas,oranges,grapes";
int index = foods.indexOf(",");
String firstItem = foods.substring(0, index);

System.out.println("Comma position: " + index);
System.out.println("First item: " + firstItem);

Comma position: 6
First item: apples
```


</br>

Parse names:

```java
String fullName = "Cheryl Jamie Robbins";
String[] names = fullName.split(" ");
System.out.println(names[2]); 
// Output: Robbins
```

### 9.4 Converting Strings to numbers and dates

String to int:

```java
String ageInput = "35";
int age = Integer.parseInt(ageInput);

// age = 35
```

This fails if the text is not a valid integer:

```java
String ageInput = "35.5";
int age = Integer.parseInt(ageInput); // throws NumberFormatException

// int only accepts whole number. 35.5 is not an int
```

</br>

String to double:

```java
String priceText = "4.99";
double price = Double.parseDouble(priceText);

// price = 4.99
```

</br>

String to date:

```java
import java.time.LocalDate;

String userInput = "2002-10-17";   // date entered as text
LocalDate birthDay = LocalDate.parse(userInput);   // convert text into a LocalDate

// birthDay = 2002-10-17
```

</br>

Custom date format:

```java
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

String userInput = "10/17/2022";
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
LocalDate date = LocalDate.parse(userInput, formatter);

// date = 2022-10-17
```

</br>

### 9.5 StringBuilder

`String` is immutable, which means it cannot be changed directly.
When you do a lot of concatenation, use `StringBuilder`.

```java
StringBuilder skills = new StringBuilder();
skills.append("Git, ");
skills.append("HTML, ");
skills.append("CSS");

String result = skills.toString();
System.out.println(result);
```

Use `StringBuilder` when you are building a large string piece by piece.

---

## 10. Object-Oriented Programming and Encapsulation

### 10.1 Class vs object

- **class** = blueprint
- **object** = instance created from the class

Example:

```java
// This is a class named CellPhone
// A class is like a blueprint for creating objects
public class CellPhone {
    String model;   // this is a field/property that belongs to the CellPhone class
}
```

Creating an object:

```java
// Creates an object from the CellPhone class
CellPhone phone = new CellPhone();

// sets the model field of the phone object
phone.model = "iPhone";
```

- `CellPhone` = the class type
- `phone` = the object variable (reference variable)
- `new CellPhone()` = creates a new `CellPhone` object

Summary: 
```java
// defines a class called CellPhone
public class CellPhone {

    // field/property for storing the phone model
    String model;
}

public class Main {
public static void main(String[] args) {

        // create a CellPhone object and store it in the variable named phone
        CellPhone phone = new CellPhone();

        // assign a value to the model field of that object
        phone.model = "iPhone";

        // print the model stored in the object
        System.out.println(phone.model);   // Output: iPhone
    }
}
```


### 10.2 Encapsulation

Encapsulation means grouping related data and methods together inside a class and hiding the internal details.

Example idea:

- fields are private
- getters and setters control access

### 10.3 Fields, constructors, getters, and setters

A constructor is a special part of a class that runs when an object is created. Its purpose is to give the object its starting values by initializing its fields.

### Key Points About Constructors
* A constructor name must be exactly the same as the class name.
* A constructor can have no parameters or one or more parameters.
* A class can have more than one constructor. This is called constructor overloading.
* Constructors help make sure an object starts in a valid and usable state.

```java
// defines a class named Hotel
public class Hotel {

    // private field that stores the hotel's name
    // private means it can only be accessed directly inside this class
    private String name;

    // constructor
    // runs when a new Hotel object is created
    // takes a name value and stores it in the object's name field
    public Hotel(String name) {
        this.name = name;   // this.name = the object's field, name = the parameter
    }

    // getter method
    // returns the current value of the hotel's name
    public String getName() {
        return name;
    }

    // setter method
    // updates the hotel's name with a new value
    public void setName(String name) {
        this.name = name;   // this.name = the object's field, name = the parameter
    }
}
```

- **Class**: `Hotel`
- **Field / instance variable**: `name`
- **Constructor**: `Hotel(String name)`
- **Getter**: `getName()`
- **Setter**: `setName(String name)`



**Rules to remember**:

**Getter**

- public
- returns field type
- no parameters
- starts with `get`

**Setter**

- public
- returns `void`
- takes one parameter
- starts with `set`

### 10.4 Derived properties

A derived property is calculated from other values instead of being stored directly.

```java
// defines a class named Person
public class Person {

    // private fields that store the person's first and last name
    // private means they can only be accessed directly inside this class
    private String firstName;
    private String lastName;

    // constructor
    // runs when a new Person object is created
    // takes the first name and last name as input and stores them in the object
    public Person(String firstName, String lastName) {
        this.firstName = firstName;   // stores the parameter firstName in the object's firstName field
        this.lastName = lastName;     // stores the parameter lastName in the object's lastName field
    }

    // getter method for the full name
    // this is a derived value because there is no single fullName variable stored in the class
    // it combines lastName and firstName and returns them in "LastName, FirstName" format
    public String getFullName() {
        return this.lastName + ", " + this.firstName;
    }
}
```

- **Class**: `Person`
- **Fields / instance variables**: `firstName, lastName`
- **Constructor**: `Person(String firstName, String lastName)`
- **Method**: `getFullName()`
- **Derived value**: full name, because it is built from `firstName` and `lastName`

</br>

### 10.5 Access modifiers and packages

Important modifier:

- `private` hides fields and methods from code outside the class

Packages are used for organization and avoiding class name conflicts.

Example:

Imagine you have two different classes both named: `public class Student { ... }`. Without packages, Java would get confused.  

With packages, you can have:

```java
com.school.project.Student
com.pluralsight.Student
```

These are treated as different classes because they live in different packages.


---

## 11. Overloading and Method Signatures

### 11.1 What a signature is

A method signature includes:

- method name
- number of parameters
- parameter data types

It does **not** include:

- return type
- parameter names
- access modifier

### 11.2 Overloading methods

Overloading means using the same method name with different parameter lists.

```java
public void dial(String phoneNumber) {
    // this version of dial is used when a String phone number is passed in
    System.out.println("Dialing " + phoneNumber);
}

public void dial(CellPhone phone) {
    // this version of dial is used when a CellPhone object is passed in
    // phone.getPhoneNumber() gets the phone number stored inside the object
    System.out.println("Dialing " + phone.getPhoneNumber());
}
```

Output: 

```java 
dial("206-555-1234");  // uses dial(String phoneNumber)
dial(myPhone);        // uses dial(CellPhone phone)
```

### 11.3 Overloading constructors

Overloading constructors means a class can have more than one constructor, as long as the parameter lists are different. This allows objects to be created in different ways.

Example:

```java 
CellPhone phone1 = new CellPhone(); 
// uses the no-argument constructor

CellPhone phone2 = new CellPhone("iPhone", "206-555-1234"); 
// uses the constructor with two parameters
```



```java
public class CellPhone {
    // fields that store the phone's model and number
    private String model;
    private String number;

    // no-argument constructor
    // used when a CellPhone object is created with no values
    // example: CellPhone phone1 = new CellPhone();
    public CellPhone() {
        // gives the object default starting values
        this.model = "Unknown";
        this.number = "";
    }

    // overloaded constructor
    // used when a CellPhone object is created with a model and number
    // example: CellPhone phone2 = new CellPhone("iPhone", "206-555-1234");
    public CellPhone(String model, String number) {
        this.model = model;     // stores the model passed into the constructor
        this.number = number;   // stores the number passed into the constructor
    }
}
```



---

## 12. Loops

### 12.1 while

Use `while` when you do not know exactly how many times the loop should run ahead of time.

```java
int i = 1;      // starting value for the loop counter
int sum = 0;    // variable used to keep track of the total

while (i <= 10) {   // keep looping while i is less than or equal to 10
    sum += i;       // add the current value of i to sum
    i++;            // increase i by 1 each time through the loop
}

System.out.println(sum);   // prints the final total
```

### 12.2 do/while

The `do/while` loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true. Then it will repeat the loop as long as the condition is true.

A `do/while` loop always be executed at least once, **even if the condition is false**, because the code block is executed before the condition is tested:

```java
int i = 1;      // starting value for the loop counter
int sum = 0;    // variable used to keep track of the total

do {
    sum += i;   // add the current value of i to sum
    i++;        // increase i by 1 each time through the loop
}

while (i <= 10);   // keep looping while i is less than or equal to 10
```

### 12.3 for

Use `for` when you know the number of repetitions.

```java
for (int i = 0; i < 5; i++) {   // start i at 0, repeat while i is less than 5, increase i by 1 each time
    System.out.println(i);      // prints the current value of i
}
```

Countdown example:

```java
for (int i = 10; i >= 1; i--) {   // starts at 10, keeps looping while i is 1 or more, subtracts 1 each time
    System.out.println(i);        // prints the current value of i
}

System.out.println("Launch!");    // prints Launch! after the loop is finished
```

Output: 
```java 
10
9
8
7
6
5
4
3
2
1
Launch!
```

### 12.4 break and continue

`break` exits the loop completely.

```java
// starts at 1, keeps looping while i is 10 or less, adds 1 each time
for (int i = 1; i <= 10; i++) {
    // checks if i is equal to 5
    if (i == 5) {                 
        break;    // stops the loop completely when i becomes 5
    }

    System.out.println(i);   // prints i if the loop has not been stopped
}
```

Output:

```java
1
2
3
4
```

`continue` skips the rest of the current iteration.

```java
// starts at 1, keeps looping while i is 5 or less, adds 1 each time
for (int i = 1; i <= 5; i++) {
    // checks if i is equal to 3
    if (i == 3) {                 
        continue;   // skips the rest of this loop iteration when i is 3
    }

    System.out.println(i);   // prints i unless it was skipped by continue
}
```

Output:

```java
1
2
4
5
```

### 12.5 Loop scope and common mistakes

Loop variable scope mistake:

```java
// i is declared inside the loop, so it only exists inside this loop
for (int i = 0; i < 10; i++) {   
    System.out.println(i);   // allowed because i is inside its scope
}

// ERROR: i cannot be used outside the loop
// System.out.println(i);        
```

Resetting a variable inside the loop by accident:

```java
for (int i = 0; i < 5; i++) {
    int sum = 0;
    sum += i;
    
    System.out.print(sum + " ");
}
```

Output:

```text
0 1 2 3 4
```

Why? Because `sum` is recreated every time.

Correct version:

```java
int sum = 0;

for (int i = 0; i < 5; i++) {
    sum += i;
}

System.out.println(sum); 
// Output: 10
```

Even-number sum example:

```java
int answer = 0;

for (int i = 0; i < 10; i++) {
    if (i % 2 == 0) {
        answer = answer + i;
    }
}

System.out.println(answer);
// Output: 20
```

---

## 13. Arrays

Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

### 13.1 Creating arrays

To declare an array, define the variable type with square brackets [ ] :

```java
String[] cars;
```

We have now declared a variable that holds an array of strings. To insert values to it, you can place the values in a comma-separated list, inside curly braces { }:

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
```


To create an array of integers, you could write:

```java
int[] myNum = {10, 20, 30, 40};
```

Example: 
</br>

```java
// creates an int array with 5 spaces for numbers
int[] numbers = new int[5];
// creates a String array and stores 3 names in it
String[] names = {"Dana", "Geri", "Ezra"};   
```

### 13.2 Indexes

Arrays start at index `0`.

```java
// creates an array with 4 values: 
// index0 = 5, index1 = 3, index2 = 18, index3 = 4
int[] prices = {5, 3, 18, 4};
// changes the value at index 2 from 18 to 1
prices[2] = 1;
System.out.println(prices[2]);   // prints the value at index 2

// Output: 1
```

This means:

- `prices[0]` is the first item
- `prices[1]` is the second item
- `prices[2]` is the third item

### 13.3 for and for-each loops with arrays

Standard `for` loop:

```java
// creates an array with 4 values
int[] prices = {5, 3, 1, 4};

// prices.length = 4 (that's the length of the 'prices'
// starts at index 0 and loops through each index in the array
for (int index = 0; index < prices.length; index++) {
    // prints the value at the current index followed by a space    
    System.out.print(prices[index] + " ");  
}
```

Output:

```text
5 3 1 4
```

For-each loop:

```java
// creates an array with 4 values
int[] prices = {5, 3, 1, 4};

// goes through each value in the array one at a time
for (int price : prices) {
    // prints the current value
    System.out.println(price);
}
```
Output:

```text
5 
3 
1 
4
```

### 13.4 Passing and returning arrays

Pass array to a method:

```java
// numbers is an array parameter passed into this method
public static void printNumbers(int[] numbers) {
    // goes through each value in the numbers array one at a time
    for (int n : numbers) {   
        System.out.println(n);   // prints the current value
    }
}
```

Return array from a method:

```java
// this method returns an int array
public static int[] createArray() {
    // creates an array and sends it back to the code that called this method
    return new int[] {1, 2, 3, 4};   
}
```

Main idea:
- `int[] numbers` in `printNumbers()` means the method receives an array of integers
- `int[]` before `createArray()` means the method returns an array of integers


### 13.5 Sorting and copying arrays

Sorting:

```java
import java.util.Arrays;

// creates an array with 4 numbers
int[] numbers = {5, 2, 9, 1};
// sorts the array in ascending order (smallest to largest)
Arrays.sort(numbers);           

System.out.println(Arrays.toString(numbers));   // prints the whole sorted array

// Output: [1, 2, 5, 9]
```

Copying:

```java
import java.util.Arrays;

int[] original = {1, 2, 3};   // original array
// creates a new array with the same values as original
int[] copy = Arrays.copyOf(original, original.length);   
```

Filling an array with a pattern:

```java
// creates an int array with 10 spaces
int[] numbers = new int[10];

// loops through each index in the array
for (int index = 0; index < numbers.length; index++) {
    // stores index * 3 at each position
    numbers[index] = index * 3;   
}
// gets the value at index 3
int result = numbers[3];   

System.out.println(result);   // prints the value at index 3

// Output: 9
```

---

## 14. Common Quiz Mistakes to Remember

1. **Do not compare Strings with `==`**
   ```java
   if (name.equals("Dana"))
   ```

2. **`String` is not primitive**
    - It is a class, which means it is a reference type.

3. **`Integer.parseInt()` only works on valid integer text**
   ```java
   Integer.parseInt("35")   // works
   Integer.parseInt("35.5") // exception
   ```

4. **Arrays start at index 0**
    - Third element is `[2]`

5. **Loop variables have scope only inside the loop**

6. **If you declare an accumulator inside the loop, it resets every time**

7. **Use `endsWith(".csv")` to check file extension**
   ```java
   fileName.endsWith(".csv")
   ```

8. **Use `.length()` for String length**
   ```java
   fullName.length()
   ```

9. **Use `.toLowerCase()` when input should be saved in lowercase**
   ```java
   email = email.toLowerCase();
   ```

10. **Getters and setters follow naming rules**
    - getter: `getName()`
    - setter: `setName(String name)`

---

## 15. Practice Problems


### Practice 1: Parse a full name

Prompt for a full name and print:

- first name
- middle name if present
- last name

</br>

### Practice 2: Theater reservation

Prompt for:

- full name
- date in `MM/dd/yyyy`
- ticket count

Print:

```text
3 tickets reserved for 2023-05-13 under Johnson, Geri
```

</br>

### Practice 3: High score wins

Input:

```text
Home:Visitor|21:9
```

Print the winning team.

</br>

### Practice 4: Dice roller

Roll two dice 100 times and count how often sums of 2, 4, 6, and 7 appear.

</br>

### Practice 5: Book class

Create a class with fields, constructor, getters, setters, and methods for checking in and checking out.

</br>

### Practice 6: Array statistics

Given an array of scores, find:

- total
- average
- highest
- lowest

---

## 16. Quick Cheat Sheet

### Variables

```java
int age = 25;           // whole number

double price = 19.99;   // decimal number

char grade = 'A';       // single character

boolean isOpen = true;  // true or false value

String name = "Dana";   // text
```

### Input

```java
Scanner scanner = new Scanner(System.in);   // creates a Scanner to read user input

String text = scanner.nextLine();           // reads a full line of text

int number = scanner.nextInt();             // reads an integer
```

### Conditions

```java
if (x > 10) {                     // checks if x is greater than 10
    System.out.println("Big");    // runs if condition is true
}
else {
    System.out.println("Small");  // runs if condition is false
}
```

### Strings

```java
text.length();                 // gets the number of characters
text.trim();                   // removes spaces at the beginning and end
text.toLowerCase();            // changes text to lowercase
text.toUpperCase();            // changes text to uppercase
text.equals("yes");            // compares exact text
text.equalsIgnoreCase("yes");  // compares text without caring about uppercase/lowercase
text.split(",");               // splits text into pieces using comma
text.indexOf("-");             // finds the position of "-"
text.substring(0, 3);          // gets part of the string from index 0 up to 3
text.endsWith(".csv");         // checks if text ends with ".csv"
```

### Parsing

```java
int n = Integer.parseInt("42");        // converts text into an int

double d = Double.parseDouble("3.14"); // converts text into a double
```

### Loops

```java
for (int i = 0; i < 5; i++) {
        // repeats a set number of times
}   

--------------------------------------
while (condition) {
        // repeats while the condition is true
}             

--------------------------------------
do {

}
while (condition);         // runs once first, then repeats while true
```

### Arrays

```java
int[] nums = {1, 2, 3};   // creates an array of integers
nums[0];                  // gets the first value in the array
nums.length;              // gets the number of items in the array
```

### Methods

```java
// method that takes 2 ints
public static int add(int a, int b) {   
    return a + b;    // returns their sum
}
```

### OOP

```java
// defines a class named Person
public class Person {
    // private field to store the name
    private String name;

    // constructor that sets the name
    public Person(String name) {   
        this.name = name;
    }

    // getter that returns the name
    public String getName() {      
        return name;
    }

    // setter that changes the name
    public void setName(String name) {   
        this.name = name;
    }
}
```
