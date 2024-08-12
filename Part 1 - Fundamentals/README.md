# JAVA Fundamentals

This section contains the fundamentals every Java developer must know and I showcase my learning path to understanding the fundamentals of the Java language.

## What Is JAVA?

Java is a programming language that has multiple features that allows it to be used in the enterprise market. Most big companies use Java as their preferred language. In Java we have a technology called JVM (Java Virtual Machine). We have multiple languages running on JVM aswell such as Scala and Kotlin, just to name a few. Java can be used for Development and Testing. It is also one of the most readable language. What this means is that you can read someone else's code line by line and understand what is going on. It is also highly maintanable. Java was made in 1995 by Sun Microsystems under a team led by James Gosling and later on Oracle bought them.

## JDK (Java Development Kit)

- To write Java code you need a compiler. In java we need to download the _JDK_
- In the JDK, we have two versions, the propriety _JDK version_ from _oracle_ and an _open source JDK version_.

## How to Run Java code

- We need both the _javac_ and _java_ to compile and run the application respectively.
- _Javac_ stands for _Java Compiler_.
- Whenever you create a _Java file_ you have to give it the _.java_ extension.
- We have a concept of _Jshell_ in Java. It is a **cli** that allows you to run java operations.
- Always end your lines with a _semi colon(;)_.
- There are two steps to follow to run java code:
- 1. We need to compile the code with the command _javac -filename-_.
- 2. Then we run the compiled code with the command _java -ClassName-_.

## How Java works behind the scenes

- In your machine we have something called _JVM_. This is why Java code is platform independent, it doesn't matter which _OS_ you write the code, it will run on any machine. So if you have _JVM_ you can run Java code and without it you can't run Java code.
- You have to convert your code into _Byte Code_, this is what JVM understands.
- So we use a _compiler (javac)_ to convert your _java code_ into _byte code_.
- JVM always wants to know what the first file is and that file needs to have a **main method/function**.
- The execution starts at the **main method**, and this main has a signature which is _public static void main_, always parse this method, and main accepts some params/arguments which is _String a[] / String[] args_.
- Java is Object Oriented and what this means is that everything is supposed to be an object and to create an object we need a class.
- So when we compile a _java_ file it creates a new file with a _.class_ file extension which contains _Byte code_.
- If you want to run your Java application, you need external libraries and a runtime. A runtime is something inwhich you can run things. Now we can run something in a JVM.
- Java provides us with _JRE_, which stands for _Java Runtime Environment_.
- _JVM_ stands for _Java Virtual Machine_. JVM is part of JRE, and also the external libraries are part of JRE.
- _Javac_ is only for development purposes, which is why we install the _JDK (Java Development Kit)_.

## 1. Variables

- We store temporary data in variables.
- They have a name and value.
- Java is a strongly typed language, this means you have to declare the data type in which you're going to store data in a variable.
- It allows us to store data in variable name.
- When creating a variable make sure you give it a **name**, a **type** and **assign** a **value** to it of the same type.

## 2. Data Types

- We have multiple data types in java, and we have two categories of data types:

### a. Primitive Types

- It is simple and basic to work with.
- We divide primitives into 4 categories:

#### i. Integer

- To store whole numbers from negative to positive values.
- We have multiple subtypes of integers, we have byte, short, int, long.
- These all have different sizes.
- byte is only 1 byte (8 bits). _How do we calculate this range?_ It goes from -2^7 to 2^7 - 1. It starts from -128 to 127.
- short is only 2 bytes and can store a range of whole numbers from -32768 to 32767.
- The size of int is 4 bytes and can store whole numbers from -2147483648 to 2147483647. It is the preferred data type when we create variables with a numeric value
- long supports 8 bytes, and can store whole numbers from -9223372036854775808 to 9223372036854775807. It is used when int is not large enough to store the value. Note that you should end the value with an **"L"**.

#### ii. Float

- You should use a floating point type whenever you need a number with a decimal.
- We have two subtypes of float; **double** and **float**.
- Float takes 4 bytes.
- Double takes 8 bytes.
- Double is the default in Java. The reason is because double allows precision. Float has a limited precision set.
- Note that you should end the value with an **"f"** for floats and **"d"** for doubles is optional.

#### iii. Character

- These include characters in succession.
- They are 2 bytes in size.
- It follows _Unicode_ instead of _ASCII_. It has all the characters in the world.
- You can work with any type of values or characters you have.
- To set a _single character_ variable you need to use **single quotes.**
- **Double quotes** are for _strings_.

#### iv. Boolean

- The only values we can have is **true** and **false**.
- We don't do 0 and 1 to denote true or false like other languages do.
- to declare booleans in variables we use the **boolean** keyword.

### Literals

- Literals are the exact values of that value.
- For example we can print hexadecimal values, binary values, scientific numbers, etc.

## Type Casting & Conversion

- Type casting allows us to change the data types of certain data.
- For instance we can change floats to integers and vice versa.
- The only way this doesn't work is converting a **char** datatype to **int** or **float** or **boolean**.
- Casting is explicit conversion.
- Conversion is automatic conversion.
- Type promotion is the automatic conversion of a data type into a different one when you perform operations on two same data types.

## Arithmetic Operators

## Relational Operators

- These are operators that allow us two compare two values.
- Just like we have in mathematics, we also have these in programming languages.
- Greater than(>), less than(<), greater than or equal to (>=), less than or equal to(<=), etc.
- In Java, we use 2 equals to signs for comparison, e.g (a == b).
- Two check if two values are not equal we use a special not equal operator,which uses an exclamation sign before the equal sign(!=).
- These relational operators return a boolean, true of false.

## Logical Operators

- These operators combine two different relation operations to get a single boolean output.
- We use the **AND (&)** operator to check if both conditions true.
- We use the **OR (|)** operator to check if either operations return are true.
- We use the **NOT (!)** operator to reverse a condition.
- There is something called shortcircuiting, which quickly stops a conditional check if one of the conditions is not false. It won't check the remaining conditions.
- To short circuit we use double symbols for the _AND(&&)_ and _OR(||)_ oprators.

## Conditional Statements

- Conditional Statements enable us to check for certain criteria and respond how we want based on that criteria.
- We use the keyword **if** to check for a condition followed by the logic in parenthesis.
- If the conditional is false, the block is omitted.

## Key Notes

- The difference between _print_ and _println_ is that _println_ will always output with a new line.
- We don't put semi colons on blocks.
- Everytime you're creating a new variable mention the type.
- In programming, the **equals to (=)** symbol is used for _assigning_ values to a variable.
- You can also run your java source file directly without compiling it using the commant **java -filename-**
