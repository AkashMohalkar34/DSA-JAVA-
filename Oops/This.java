public class This {
    public static void main(String[] args) {
        pen s = new pen();
        s.setName("Akash");
       System.out.println(s.getName());
       s.setRoll(23);
       System.out.println(s.getRoll());

    }
}
class pen 
{
    private String name ;
    private int roll;

   public String getName()
    {
        return this.name;
    }
    int getRoll()
    {
        return this.roll;
    }

    void  setName(String name)
    {
        this.name = name;
    }
    void setRoll(int roll)
    {
        this.roll = roll;
    }
}