public class Constructor1{
    public static void main(String[] args) {
        St1 s1= new St1();
      // System.out.println(s1.name);
    }
}

class St1 {
    String name;
    int roll;

    St1(){
        System.out.println("constructor is called..");
    }
}