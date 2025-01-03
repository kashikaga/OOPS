public class Constructor{
    public static void main(String[] args) {
        St s1= new St("Kashika");
       System.out.println(s1.name);
    }
}

class St {
    String name;
    int roll;

    St(String name){
       this.name=name;
    }
}