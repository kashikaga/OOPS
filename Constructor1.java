public class Constructor1{
    //constructor overloading
    public static void main(String[] args) {
        St1 s1= new St1();
        St1 s2= new St1("kashika");
        St1 s3= new St1(10);
    }
}

class St1 {
    String name;
    int roll;

    St1(){
        System.out.println("constructor is called..");
    }
    St1(String name){
        this.name=name;
    }
    St1(int roll){
        this.roll=roll;
    }
}