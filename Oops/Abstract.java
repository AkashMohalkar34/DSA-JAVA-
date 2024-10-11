public class Abstract {
    public static void main(String args [])
     
    {
        // Chiken c = new Chiken();
        // c.walk();
        Mustang s = new Mustang();
    }


}

abstract class Animal{
    String color;
    Animal()
    {
       System.out.println("Animal constructor called");
    }
    void eat()
    {
        System.out.println("eating");
    }
    
    abstract void walk();
}

class Horse extends Animal{

    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor()
    {
        color = "brown color";
    }
    void walk()
    {
        System.out.println("Horse Walking on four legs...");
    }
}
class Mustang extends Horse
{
    Mustang()
    {
        System.out.println("Mustang constructor called");
    }
}
class Chiken extends Animal
{
    void changeColor()
    {
        color = "red";
    }
    void walk()
    {
        System.out.println("Chiken Walking on Two legs..");
    }
}