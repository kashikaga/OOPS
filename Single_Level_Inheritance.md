

This example demonstrates the concept of single level inheritance in Java, where a derived class (`Fish`) inherits properties and methods from a base class (`Animal`).

```
public class JavaBasics {
    public static void main(String args[]) {
        Fish shark = new Fish();
        shark.eat();
    }

    // Base class
    class Animal {
        String color;

        void eat() {
            System.out.println("eats");
        }

        void breathe() {
            System.out.println("breathes");
        }
    }

    // Derived class
    class Fish extends Animal {
        int fins;

        void swim() {
            System.out.println("swims in water");
        }
    }
}
```

### Explanation

- **Base Class (`Animal`)**: Contains properties like `color` and methods like `eat()` and `breathe()`.
- **Derived Class (`Fish`)**: Inherits from `Animal` and adds its own property (`fins`) and method (`swim()`).
- **Main Method**: Creates an instance of `Fish` and calls the `eat()` method, demonstrating inheritance.

