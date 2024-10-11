public class InterF {
    public static void main(String[] args) {
        SavingA s1 = new SavingA();
        s1.func();
        System.out.println(Bank.c);
        // System.out.println(Bank.func1());
        SavingA.f4();
        Bank.func1();

    }
}

interface Bank{
    int c = 34;
    void func();
    static void func1()
    {
 System.out.println("func1 is calling Bank...");
    }
}
interface RBI
{
    void func();
    static void func1()
    {

    }
}

class SavingA implements RBI,Bank
{
    static int c = 0;
    static void f4()
    {
        System.out.println("f4 calling...");
    }
   public void func()
    {
       System.out.println("Savaing Function calling..."); 
    }
}
