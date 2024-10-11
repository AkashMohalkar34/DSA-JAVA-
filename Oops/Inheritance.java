public class Inheritance {
    public static void main(String args [])
    {
        //   Fish f = new Fish();
        //   f.swim();

        Student1 s1 = new Student1();
        s1.roll();
    }
}

// Single Inheritance
class Animal
{
    void eat()
     {
        System.out.println("eating");

     }
     void breath()
     {
        System.out.print("breathing..");
     }
}

class Fish extends Animal
{
    int fins;

    void swim()
    {
        System.out.println("Swims");
    }
}

// multilevel Inhertitance
class Parent
{
    void name()
    {
        System.out.println("name");
    }
    void AdharId()
    {
        System.out.println("Adhar NUmber");

    }
}
class Student extends Parent
{
    void roll()
    {
        System.out.println("Roll");
    }

}
class Student1 extends Student{
    void total()
    {
        System.out.println("total");
    }
}