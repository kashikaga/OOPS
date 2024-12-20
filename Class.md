
# Class in Object-Oriented Programming

A **Class** is a group of objects that share common properties. It serves as a template or blueprint from which objects are created. In short, a class is the specification or template of an object.

## Real-World Example: Circle

Consider a real-world example of a Circle. A Circle class would define the properties and behaviors associated with circles. For instance, it might have member variables such as `x`, `y`, and `radius`, and methods like `area()` and `fillColor()`. 

### Diagram Representation

Below is a conceptual diagram representing a Circle class, which acts as a template to create multiple Circle objects:

```
[Circle Class]
    - x: Integer
    - y: Integer
    - radius: Integer
    + area(): Double
    + fillColor(): void
```

## Implementation with Example - Creating Student Class

Let's demonstrate how to create a class in Java with an example of a `Student` class.

### Example: Student Class

```
package net.javaguides.corejava.oops;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Student {
    private String name = "Ramesh";
    private String college = "ABC";

    public Student() {
        super();
    }

    public Student(String name, String college) {
        super();
        this.name = name;
        this.college = college;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
```

### Explanation of the Student Class

- **Member Variables**: The `Student` class has two member variables, `name` and `college`, both initialized with default values.
- **Constructors**: 
  - A default constructor initializes the object without parameters.
  - A parameterized constructor allows initialization with specific values for `name` and `college`.
- **Getter and Setter Methods**: These methods provide access to the private member variables, allowing you to retrieve and modify their values.
