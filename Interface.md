
# Interfaces in Java

## Key Points about Interfaces
1. **Blueprint of a Class**: An interface defines the structure that a class must follow.
2. **Supports Multiple Inheritance**: A class can implement multiple interfaces.
3. **Achieves Total Abstraction**: Interfaces enforce 100% abstraction.
4. **Declaration**: Defined using the `interface` keyword.
5. **Method Characteristics**:
   - All methods are `public`, `abstract`, and **without implementation**.
6. **Variable Characteristics**:
   - Variables in interfaces are `public`, `static`, and `final`.

---

## Code Example: Interface in Java

### Example 1: Chess Game

```java
public class OOPS {
    public static void main(String args[]) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal (in all 4 directions)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal - (by one step)");
    }
}
```

### Example Output:
```
up, down, left, right, diagonal (in all 4 directions)
```

---

### Example 2: Multiple Inheritance with Interfaces

```java
interface Herbivore {
    // Properties related to herbivores
}

interface Carnivore {
    // Properties related to carnivores
}

class Bear implements Herbivore, Carnivore {
    // Bear inherits properties from both Herbivore and Carnivore
}
```

## Explanation
- **Multiple Inheritance**: `Bear` implements both `Herbivore` and `Carnivore`. This allows a class to inherit properties and behaviors from multiple sources without the diamond problem.
- **Interface Implementation**: 
  - A class must provide implementations for all abstract methods in the interfaces it implements.
  - For example, `Queen`, `Rook`, and `King` all implement the `moves()` method of the `ChessPlayer` interface.

---
