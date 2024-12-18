
# Object in Object-Oriented Programming

An **Object** is a real-time entity that possesses both state and behavior. In Java, an object is an instance of a class, encapsulating instance variables (which represent the state) and methods (which represent the behavior). Objects can be created using the `new` keyword in Java.

## Definitions of an Object

Here are various definitions of an object:

1. An object is a **real-world entity**.
2. An object is a **runtime entity**.
3. An object is an entity that has **state and behavior**.
4. An object is an **instance of a class**.

## Real-World Examples of Objects

Objects can be physical or logical (tangible and intangible). Some examples include:

- **Dogs**: have states (name, color, breed, hunger) and behaviors (barking, fetching, wagging tail).
- Other examples: Chair, Bike, Marker, Pen, Table, Car, Book, Apple, Bag.

## Declaring, Creating, and Initializing an Object in Java

A class serves as a blueprint for creating objects. Below is an example of how to declare, create, and initialize a `Student` object in Java.

### Example: Student Class

```
package net.javaguides.corejava.oops;

public class Student {
    private String name;
    private String college;

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

    public static void main(String[] args) {
        Student student = new Student("Ramesh", "BVB");
        Student student2 = new Student("Prakash", "GEC");
        Student student3 = new Student("Pramod", "IIT");
    }
}
```

### Breakdown of Object Creation

From the above program, the `Student` objects are created as follows:

- `Student student = new Student("Ramesh", "BVB");`
- `Student student2 = new Student("Prakash", "GEC");`
- `Student student3 = new Student("Pramod", "IIT");`

Each statement consists of three parts:

1. **Declaration**: The statement `Student student;` associates a variable name with the object type.
2. **Instantiation**: The `new` keyword creates the object.
3. **Initialization**: The constructor is called to initialize the new object.

### Declaring a Variable to Refer to an Object

The general syntax for declaring a variable is:

```
type name;
```

In our case:

```
Student student;
Student student2;
Student student3;
```

### Instantiating a Class

The `new` operator instantiates a class by allocating memory for a new object and returning a reference to that memory. For example:

```
Student student = new Student("Ramesh", "BVB");
```

### Initializing an Object

The initialization occurs when the `new` keyword is followed by calling the constructor:

```
Student student = new Student("Ramesh", "BVB");
```

This will invoke the following constructor in the `Student` class:

```
public class Student {
    private String name;
    private String college;

    public Student(String name, String college) {
        super();
        this.name = name;
        this.college = college;
    }
}

