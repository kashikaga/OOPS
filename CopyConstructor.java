public class CopyConstructor {
    public static void main(String args[]) {
        Student1 s1 = new Student1();
        s1.name = "Kashika";
        s1.roll = 456;
        s1.password1 = "abcde";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        // Using Student1 for both instances
        Student1 s2 = new Student1(s1);
        s2.password1 = "xyz";
        s1.marks[2] = 100;

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student1 {
    String name;
    int roll;
    String password1;
    int marks[];

    // Copy constructor with deep copy for marks array
    Student1(Student1 s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;

        // Deep copy
        for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student1() {
        marks = new int[3];
        System.out.println("Constructor is called...");
    }

    Student1(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student1(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}
