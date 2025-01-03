public class Constructor{
    public static void main(String[] args) {
        St s1= new St();
      // System.out.println(s1.name);
    }
}

class St {
    String name;
    int roll;

    St(){
        System.out.println("constructor is called..");
    }
}