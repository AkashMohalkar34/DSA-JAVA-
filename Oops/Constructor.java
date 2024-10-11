public class Constructor
{
  public static void main(String args [])
{
     Student s1 = new Student();
     
}
 }

public class Student
{
     String name;
   int roll;
   Student()
 {
     System.out.println("constructor is called ");
 }
 Student(String name){
   this.name = name;
 }
 
 Student(int roll)
 {
   this.roll = roll;
 }

}

 