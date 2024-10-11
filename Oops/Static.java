public class Static {
    public static void main(String args [])
    {
      Student s1 = new Student();
      s1.schoolName = "prec";
      Student s2 = new Student();
      System.out.println(s2.schoolName);
    }
}

class Student{
    int roll;
    String name;
     static  String schoolName;
    void setName(String name)
    {
        this.name = name;
    }

    String getName()
    {
        return this.name;
    }
}

class 
