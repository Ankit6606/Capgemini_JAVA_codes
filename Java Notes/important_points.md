
## Early vs Lazy Instantiation

### Difference Between Early and Lazy Instantiation

#### Early Instantiation (Eager Instantiation)

- **Definition**: Object is created when the class is loaded.
- **When It Happens**: Immediately during class loading.
- **Memory Usage**: Higher, since the object is created whether used or not.
- **Performance**: Fast access as the object is already created.
- **Use Case**: When the object is lightweight and frequently used.

**Example (Java)**:
```java
public class Singleton {
    private static final Singleton instance = new Singleton(); // early instantiation

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}
```

#### Lazy Instantiation (Lazy Loading)

- **Definition**: Object is created only when needed.
- **When It Happens**: Upon first access.
- **Memory Usage**: Efficient, object created only if required.
- **Performance**: Slightly slower on first access due to initialization.
- **Use Case**: For heavy or rarely used objects.

**Example (Java)**:
```java
public class Singleton {
    private static Singleton instance; // not created yet

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // lazy instantiation
        }
        return instance;
    }
}
```

#### Summary Table

| Feature               | Early Instantiation     | Lazy Instantiation        |
|-----------------------|-------------------------|----------------------------|
| Object Creation Time  | At class loading        | When first accessed        |
| Memory Usage          | Higher                  | More efficient             |
| First Access Speed    | Faster                  | Slightly slower            |
| Suitable For          | Frequently used objects | Rarely used/heavy objects  |

---

## What is Polymorphism?

- **Definition**: Polymorphism allows objects of different classes to be treated as instances of a common superclass. It supports "many forms" via a shared interface.

### Types of Polymorphism

#### 1. Compile-Time Polymorphism (Static)

- Achieved by method overloading.
- Resolved at compile time.

**Example**:
```java
class Math {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

#### 2. Run-Time Polymorphism (Dynamic)

- Achieved by method overriding.
- Resolved at runtime.

**Example**:
```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound(); // Output: Dog barks
    }
}
```

**Benefits**:
- Code reusability
- Flexibility and maintainability
- Clean and extensible code

---

## Difference Between `throw` and `throws` in Java

### 🔹 `throw`

- **Purpose**: Manually throw an exception.
- **Used In**: Method or block.
- **Follows**: An instance of `Throwable`.

**Example**:
```java
public void checkAge(int age) {
    if (age < 18) {
        throw new ArithmeticException("Not eligible to vote");
    }
}
```

### 🔹 `throws`

- **Purpose**: Declares possible exceptions a method may throw.
- **Used In**: Method signature.
- **Follows**: Exception class names.

**Example**:
```java
public void readFile() throws IOException {
    // code that might throw IOException
}
```

### ✅ Comparison Table

| Feature      | `throw`                         | `throws`                          |
|--------------|----------------------------------|-----------------------------------|
| Definition   | Used to throw an exception       | Declares exceptions in method     |
| Location     | Inside a method or block         | In method signature               |
| Purpose      | Instantly trigger an exception   | Inform caller about possible exceptions |
| Follows      | Throwable instance               | Exception class name(s)           |
| Example      | `throw new IOException();`       | `throws IOException, SQLException`|

**Example using both**:
```java
public void readFile(String fileName) throws IOException {
    FileReader file = new FileReader(fileName);
    if (file == null) {
        throw new IOException("File not found");
    }
}
```

---

## Compare `final`, `finally`, and `finalize` in Java

### 🔹 `final`

- **Purpose**: Prevents modification.
- **Used With**:
  - Variable → constant
  - Method → cannot be overridden
  - Class → cannot be subclassed

**Example**:
```java
final int MAX = 100;
final void display() {}
final class Vehicle {}
```

### 🔹 `finally`

- **Purpose**: Code that always runs after try/catch (e.g. cleanup).
- **Usage**: In try-catch-finally block.

**Example**:
```java
try {
    int data = 50 / 0;
} catch (ArithmeticException e) {
    System.out.println("Exception caught");
} finally {
    System.out.println("Finally block always runs");
}
```

### 🔹 `finalize()` (Deprecated)

- **Purpose**: Cleanup before garbage collection.
- **Usage**: Called by GC before object destruction.

**Example**:
```java
protected void finalize() throws Throwable {
    System.out.println("Object is being garbage collected");
}
```

> ⚠️ Note: `finalize()` is deprecated in Java 9 and removed in Java 18+.

### ✅ Comparison Table

| Keyword     | Type     | Purpose                          | When It Runs                   | Example                       |
|-------------|----------|----------------------------------|--------------------------------|-------------------------------|
| `final`     | Modifier | Prevents changes                 | Compile-time                   | `final int x = 10;`           |
| `finally`   | Block    | Cleanup after try/catch          | Always, after try/catch block  | `finally { close(); }`        |
| `finalize()`| Method   | Cleanup before GC (deprecated)   | Before object destruction      | `protected void finalize()`   |
