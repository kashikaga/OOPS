
# Method Overloading in Java

**Method Overloading** is a feature in Java where multiple methods can have the same name but differ in their parameters. The difference can be in:
1. **The number of parameters.**
2. **The type of parameters.**

This is an example of **compile-time polymorphism**, as the method to execute is determined at compile time.

## Example Code:

```java
public class OOPS {
    public static void main(String args[]) {
        Calculator calc = new Calculator();

        // Method calls with different parameters
        System.out.println(calc.add(10, 20));             // Calls method with two integers
        System.out.println(calc.add(10.5, 20.5));         // Calls method with two doubles
        System.out.println(calc.add(10, 20, 30));         // Calls method with three integers
    }
}

// Class with overloaded methods
class Calculator {
    // Method with two integer parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with two double parameters
    double add(double a, double b) {
        return a + b;
    }

    // Method with three integer parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

## Explanation:

1. **Method with Different Number of Parameters**:
   - `add(int a, int b)` is called when two integers are passed.
   - `add(int a, int b, int c)` is called when three integers are passed.

2. **Method with Different Parameter Types**:
   - `add(double a, double b)` is called when two doubles are passed.

## Output:
```
30
31.0
60
```

This demonstrates how **method overloading** allows multiple functions with the same name but different parameters to coexist in a class.
```
