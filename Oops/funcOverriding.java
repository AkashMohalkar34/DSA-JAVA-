public class funcOverriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();

    }
}

class Animal
{
    void eat()
    {
        System.out.println("Eat anything");
    }

    void eat(String a)
    {
        System.out.println(a);

    }
}
class Deer extends Animal
{
    void eat()
    {
        System.out.println("Eating Everything...");
    }
}