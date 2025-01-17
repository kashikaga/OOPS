
## Java Multi Level Inheritance Example

This example demonstrates the concept of multi level inheritance in Java

```
public class JavaBasics {
    public static void main(String args[]) {
        Dog dobby = new Dog();
        dobby.eat(); // Calls the inherited method from Animal
        dobby.legs = 4; // Sets the number of legs for the Dog instance
        System.out.println(dobby.legs); // Outputs the number of legs
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
    class Mammal extends Animal {
        int legs; // Property specific to Mammals
    }

    // Further derived class
    class Dog extends Mammal {
        String breed; // Property specific to Dogs
    }
}
```

### Explanation

- **Base Class (`Animal`)**: 
  - Contains a property `color`.
  - Has methods `eat()` and `breathe()` that define behaviors common to all animals.
  
- **Derived Class (`Mammal`)**: 
  - Inherits from `Animal`.
  - Introduces a new property `legs`, which is specific to mammals.

- **Further Derived Class (`Dog`)**: 
  - Inherits from `Mammal`.
  - Introduces an additional property `breed`, specific to dogs.

- **Main Method**: 
  - Creates an instance of `Dog` named `dobby`.
  - Calls the inherited `eat()` method from the `Animal` class.
  - Sets the number of legs to 4 and prints this value.

This structure illustrates how inheritance enables code reuse.
