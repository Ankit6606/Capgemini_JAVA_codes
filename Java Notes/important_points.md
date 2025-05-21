# Early vs Lazy Instantiation

### write the difference between early instantiation and lazy instantiation

### Here is a clear explanation of the difference between early instantiation and lazy instantiation :

## Early Instantiation (Eager Instantiation)

### Definition : The object is created at the time of class loading or program startup.

### When It Happens : Immediately when the class is loaded into memory.

### Memory Usage : Uses more memory upfront since the object is created even if it is never used.

### Performance : Faster access time when the object is needed, since it is already created.

### Example Use Case : Useful when the object is lightweight and is used frequently throughout the

### application.

### Example (in Java) :

```
java
```
```
public class Singleton {
private static final Singleton instance = new Singleton(); // early instantiation
```
```
private Singleton() {}
```
```
public static Singleton getInstance() {
return instance;
}
}
```
## Lazy Instantiation (Lazy Loading)

### Definition : The object is created only when it is needed for the first time.

### When It Happens : On-demand, when a request is made to access the object.

### Memory Usage : More memory-efficient, as the object is created only if needed.

### Performance : Slightly slower the first time the object is accessed due to initialization.

### Example Use Case : Suitable when the object is resource-intensive or rarely used.

### Example (in Java) :

```
java
```
```
public class Singleton {
private static Singleton instance; // not created yet
```
```
private Singleton() {}
```
```
public static Singleton getInstance() {
```

```
if (instance == null) {
instance = new Singleton(); // lazy instantiation
}
return instance;
}
}
```
## Summary Table

```
Feature Early Instantiation Lazy Instantiation
```
```
Object Creation Time At class loading When first accessed
```
```
Memory Usage Higher More efficient
```
```
First Access Speed Faster Slightly slower
```
```
Suitable For Frequently used objects Rarely used/heavy objects
```
### Let me know if you want a comparison in another language or format!

### what is polykorphism

### Polymorphism is one of the core concepts of object-oriented programming (OOP). The word

### "polymorphism" comes from Greek, meaning "many forms."

## Definition

### Polymorphism allows objects of different classes to be treated as objects of a common superclass. It

### enables a single interface to represent different underlying forms (data types).

## Types of Polymorphism

### 1. Compile-Time Polymorphism (Static Polymorphism)

### Achieved through method overloading or operator overloading.

### The method to be called is determined at compile time.

### Example (Method Overloading in Java):

```
java
```
```
class Math {
int add(int a, int b) {
return a + b;
}
```
```
double add(double a, double b) {
return a + b;
}
}
```
### 2. Run-Time Polymorphism (Dynamic Polymorphism)


### Achieved through method overriding.

### The method to be called is determined at runtime.

### Example (Method Overriding in Java):

```
java
```
```
class Animal {
void sound() {
System.out.println("Animal makes a sound");
}
}
```
```
class Dog extends Animal {
void sound() {
System.out.println("Dog barks");
}
}
```
```
public class Main {
public static void main(String[] args) {
Animal a = new Dog(); // Polymorphism in action
a.sound(); // Output: Dog barks
}
}
```
## Benefits of Polymorphism

### Increases code reusability

### Promotes flexibility and maintainability

### Helps in implementing clean and extensible code

### Let me know if you’d like a real-world analogy or explanation in a specific programming language.

### difference between throw and throws in java

### Here is the clear difference between `throw` and `throws` in Java :

## 🔹 `throw` Keyword

### Purpose : Used to manually throw an exception.

### Usage : Inside a method or block of code.

### Follows : An instance of `Throwable` (e.g., `new Exception()` ).

### Example :

```
java
```
```
public void checkAge(int age) {
if (age < 18 ) {
throw new ArithmeticException("Not eligible to vote");
```

#### }

#### }

### Key Point : Only one exception can be thrown using a single `throw` statement.

## 🔹 `throws` Keyword

### Purpose : Declares exceptions that a method might throw.

### Usage : In the method signature.

### Follows : One or more exception class names.

### Example :

```
java
```
```
public void readFile() throws IOException {
// code that might throw IOException
}
```
### Key Point : You can declare multiple exceptions , separated by commas.

## ✅ Comparison Table

```
Feature `throw` `throws`
```
```
Definition Used to throw an exception Used to declare an exception
```
```
Location Inside a method/block In the method signature
```
```
Purpose Instantly trigger an exception Inform the caller that method might throw
```
```
Followed by An instance of `Throwable` class One or more exception class names
```
```
Example `throw new IOException();` `throws IOException, SQLException`
```
## 🔸 Example Showing Both

```
java
```
```
public void readFile(String fileName) throws IOException {
FileReader file = new FileReader(fileName);
if (file == null) {
throw new IOException("File not found");
}
}
```
### `throws IOException` : Declares that this method might throw an `IOException`.

### `throw new IOException(...)` : Actually throws the exception during execution.

### Let me know if you'd like a quiz, analogy, or further examples!


### comapre final , finally and finaloize keywords in java

### Here's a clear comparison of the `final`, `finally`, and `finalize` keywords in Java — these sound

### similar but serve completely different purposes :

## 🔹 1. `final` (Keyword)

### Purpose : Used to declare constants, prevent inheritance or method overriding.

### Usage :

### Variable : Makes it a constant (value can't be changed).

### Method : Prevents overriding in subclasses.

### Class : Prevents inheritance (no subclassing).

### Example :

```
java
```
```
final int MAX = 100 ; // constant variable
final void display() { } // method can't be overridden
final class Vehicle { } // class can't be extended
```
### When Used : At compile-time for design restrictions.

## 🔹 2. `finally` (Block)

### Purpose : Used to execute code regardless of whether an exception is thrown or not.

### Usage : In a `try-catch-finally` block for resource cleanup (like closing files, DB connections).

### Example :

```
java
```
```
try {
int data = 50 / 0 ;
} catch (ArithmeticException e) {
System.out.println("Exception caught");
} finally {
System.out.println("Finally block always runs");
}
```
### When Used : At runtime , always executes after try/catch.

## 🔹 3. `finalize()` (Method)

### Purpose : Called by the garbage collector before an object is destroyed, for cleanup.

### Usage : Can be overridden to perform actions before the object is reclaimed.

### Example :


```
java
```
```
protected void finalize() throws Throwable {
System.out.println("Object is being garbage collected");
}
```
### When Used : At runtime , before garbage collection (not guaranteed when or if it will run).

### 🔸 Note: `finalize()` is deprecated from Java 9 onwards and removed in Java 18+ due to

### unpredictability.

## ✅ Comparison Table

```
Keyword Type Purpose Executed When? Example Use
```
```
`final` Modifier
```
```
Prevents changes (var,
method, class)
```
```
Compile-time `final int x = 10;`
```
```
`finally` Block
```
```
Cleanup code that
always runs
```
```
After try/catch
```
```
`finally { close();
}`
```
```
`finalize()`
```
```
Method
(Deprecated)
```
```
Cleanup before
garbage collection
```
```
Before object
destruction
```
```
`protected void
finalize() {}`
```
### Let me know if you want code demos or diagrams to visualize their differences better!


