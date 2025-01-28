
# Understanding the `static` Keyword in Java

In Java, the `static` keyword is used to share the same variable, method, or block among all instances of a given class. It can be applied to **properties**, **functions**, **blocks**, and **nested classes**.

## Properties
When a variable is declared as `static`, it belongs to the class rather than any individual instance. All instances share the same static property.

```java
class Student {
    String name; // Instance variable
    int roll;    // Instance variable

    static String schoolName; // Static variable

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
```

### Example: Static Variable Usage

```java
public class OOPS {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.schoolName = "JVM"; // Shared among all instances

        Student s2 = new Student();
        System.out.println(s2.schoolName); // Outputs: JVM

        Student s3 = new Student();
        s3.schoolName = "ABPS";
        System.out.println(s1.schoolName); // Outputs: ABPS (shared property updated)
    }
}
```

---

## Functions
Static methods belong to the class rather than instances. They can be called without creating an object of the class. They can only access static variables directly.

---

## Static Blocks
Static blocks are used to initialize static variables. They are executed when the class is loaded into memory, even before any object is created.

### Example: Static Block

```java
class StaticBlockExample {
    static int a;
    static int b;

    static {
        a = 10;
        b = 20;
        System.out.println("Static block executed: a + b = " + (a + b));
    }

    public static void main(String[] args) {
        // No need to create an instance to execute the static block
        System.out.println("Main method executed.");
    }
}
```

Output:
```
Static block executed: a + b = 30
Main method executed.
```

---

## Nested Classes
Static classes in Java can be nested within other classes. They can only access the static members of their enclosing class.

### Example: Static Nested Classes

```java
class A {
    static class B {
        void display() {
            System.out.println("Static nested class B");
        }
    }

    class C {
        void display() {
            System.out.println("Inner class C");
        }
    }
}

public class NestedClassExample {
    public static void main(String[] args) {
        // Accessing the static nested class
        A.B objB = new A.B();
        objB.display();

        // Accessing the inner class
        A objA = new A();
        A.C objC = objA.new C();
        objC.display();
    }
}
```

Output:
```
Static nested class B
Inner class C
```

---

## Summary of Static Keyword Usage
- **Properties**: Shared among all instances of a class.
- **Functions**: Belong to the class, not instances.
- **Blocks**: Execute during class loading, used to initialize static variables.
- **Nested Classes**: Can be declared static, allowing them to access only the static members of their enclosing class.
