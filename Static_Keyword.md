Static keyword in Java is used to share the same variable or method of a given class
-Properties
-Functions
-Blocks
-Nested Classes


block
main{
{
int a=b+c;
system.out.println(a);
}
}

nested classes
class A{
Class B{
}
class C{
}
}

Student
properties - name, roll_no.
functions - marks(), percedntage()

public class OOPS{
public static void main(String args[]){
Student s1=new Student();
s1.schoolName ="jvm";

Student s2=new Student();
System.out.println(s2.schoolName);

Student s3=new Student();
s3.schoolName="ABPS";
}
}
class Student{
String name;
int roll;

static String schoolName;

void setName(String name){
this.name=name;
}

String getName(){
return this.name;
}
}
