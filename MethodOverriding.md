Parent and child classes both contain the same function with a different definition

# Method Overriding in Java

**Method Overriding** occurs when a child class provides its own implementation of a method that is already defined in the parent class.  
It allows a child class to offer a specific behavior for a method, overriding the behavior defined in the parent class.

## Key Points:
1. The method in the child class must have the **same name**, **return type**, and **parameters** as the method in the parent class.
2. Method overriding is an example of **runtime polymorphism**.
3. The overridden method in the parent class is invoked only if accessed through a parent class reference.

---

## Example Code:

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Deer extends Animal {
    @Override
    void sound() {
        System.out.println("Deer makes a soft sound");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        // Parent class reference
        Animal animal = new Animal();
        animal.sound(); // Output: Animal makes a sound

        // Child class reference
        Deer deer = new Deer();
        deer.sound(); // Output: Deer makes a soft sound

        // Parent reference pointing to child object
        Animal animalDeer = new Deer();
        animalDeer.sound(); // Output: Deer makes a soft sound
    }
}
```

---

## Explanation:
1. **Parent Class (`Animal`)**:
   - Defines a generic `sound()` method for all animals.

2. **Child Class (`Deer`)**:
   - Overrides the `sound()` method with a specific implementation for deer.

3. **Behavior**:
   - When called on a `Deer` object, the overridden `sound()` method in the `Deer` class is executed.
   - When accessed via a parent reference (`Animal animalDeer = new Deer()`), the overridden method in the child class (`Deer`) is executed, demonstrating **runtime polymorphism**.

---

## Output:
```
Animal makes a sound
Deer makes a soft sound
Deer makes a soft sound
```

