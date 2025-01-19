
# Abstract Classes in Java

## Key Points about Abstract Classes
1. **Cannot Create an Instance** 
   An object cannot be created directly from an abstract class.

2. **Can Have Abstract and Non-Abstract Methods** 
   Abstract classes can include both abstract methods (without a body) and concrete methods (with a body).

3. **Can Have Constructors**  
   Abstract classes can have constructors, which are called when a subclass is instantiated.

---

## Code Example: Abstract Classes and Inheritance

```java
public class OOPS {
    public static void main(String args[]) {
        Mustang myHorse = new Mustang();
        // Animal -> Horse -> Mustang
    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "brown";
        System.out.println("animal constructor called");
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("horse constructor called");
    }

    void changeColor() {
        color = "dark brown";
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("mustang constructor called");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "yellow";
    }

    void walk() {
        System.out.println("walks on 2 legs");
    }
}
```

---

## Explanation
1. **Abstract Class**: `Animal` is an abstract class with an abstract method `walk()` and a non-abstract method `eat()`.
2. **Inheritance**:
   - `Horse` extends `Animal` and provides implementation for `walk()`.
   - `Mustang` extends `Horse` and inherits its behavior.
   - `Chicken` extends `Animal` and provides its own implementation for `walk()`.
3. **Constructors**:
   - Constructors of parent classes are called first when a child class object is created.
   - Example Output for `Mustang myHorse = new Mustang();`:
     ```
     animal constructor called
     horse constructor called
     mustang constructor called
     ```

---
