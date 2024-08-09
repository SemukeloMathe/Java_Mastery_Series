# JAVA Fundamentals

This section contains the fundamentals every Java developer must know and I showcase my learning path to understanding the fundamentals of the Java language.

## What Is JAVA?

Java is a programming language that has multiple features that allows it to be used in the enterprise market. Most big companies use Java as their preferred language. In Java we have a technology called JVM (Java Virtual Machine). We have multiple languages running on JVM aswell. Java can be used for Development and Testing. It is also one of the most readable language. What this means is that you can read someone else code line by line and understand what is going on. It is also highly maintanable.
Java was made in 1995 by Sun Microsystems and was led by the team of James Gosling. and later on Oracle bought them.

## JDK (Java Development Kit)

- To write Java code you need a compiler. In java we need to download the _JDK_
- In JDK we have two versions, the propriety _JDK version_ from _oracle_ and an _open source JDK version_.

## How to Run Java code

- We need both the _javac_ and _java_ to compile and run the application respectively.
- _Javac_ stands for _Java Compiler_.
- Whenever you create a _Java file_ you have to give it the _.java_ extension.
- We have a concept of _Jshell_ in Java. It is a cli that allows you to run java operations.
- Always end your lines with a _semi colon(;)_.
- There are two steps to follow to run java code:
- 1. We need to compile the code with the command _javac -filename-_.
- 2. Then we run the compiled code with the command _java -ClassName-_.

## How Java works behind the scenes

- In your machine we have something called _JVM_. This is why Java code is platform independent, it doesn't matter which _OS_ you write the code, it will run on any machine. So if you have _JVM_ you can run Java code and without it you can't run Java code.
- You have to convert your code into _Byte Code_, this is what JVM understands.
- So we use a _compiler (javac)_ to convert your _java code_ into _byte code_.
- JVM always wants to know what the first file is and that file needs to have a main method.
- The execution starts at the main, and this main has a signature which is _public static void main_, always parse this method, and main accepts some params/arguments which is _String a[] / String[] args_.
- Java is Object Oriented and what this means is that everything is supposed to be a object and to create an object we need a class.
- So when we compile a _.java_ file it creates a new file with a _.class_ filename extension which contains _Byte code_.
- If you want to run your Java application, you need external libraries and a runtime. A runtime is something inwhich you can run things. Now we can run something in a JVM.
- Java provides us with _JRE_, which stands for _Java Runtime Environment_.
- _JVM_ stands for _Java Virtual Machine_. JVM is part JRE, and also the external libraries are part of JRE.
- _Javac_ is only for development purposes, which is why we install the _JDK (Java Development Kit)_.
-
