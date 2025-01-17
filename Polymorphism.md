
# Polymorphism in Java

**Polymorphism** means the ability to achieve a task in multiple forms. It allows methods or behaviors to act differently based on the context.

There are two types of polymorphism:

## 1. Compile-Time Polymorphism (Static)
- Achieved through **method overloading**.
- The method to be executed is determined during **compile time**.
- **Example**:
  ```java
  class Calculator {
      int add(int a, int b) {
          return a + b;
      }

      double add(double a, double b) {
          return a + b;
      }
  }

  public class Main {
      public static void main(String[] args) {
          Calculator calc = new Calculator();
          System.out.println(calc.add(2, 3));         // Output: 5
          System.out.println(calc.add(2.5, 3.5));     // Output: 6.0
      }
  }
  ```

## 2. Run-Time Polymorphism (Dynamic)
- Achieved through **method overriding**.
- The method to be executed is determined during **runtime**.
- **Example**:
  ```java
  class Animal {
      void sound() {
          System.out.println("Animal makes a sound");
      }
  }

  class Dog extends Animal {
      @Override
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

**Key Differences**:
| Compile-Time Polymorphism       | Run-Time Polymorphism          |
|----------------------------------|--------------------------------|
| Resolved at compile time.        | Resolved at runtime.           |
| Achieved via method overloading. | Achieved via method overriding.|
| Does not involve inheritance.    | Involves inheritance.          |
```
