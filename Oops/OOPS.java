public class OOPS{
    public static void main(String args [])
    {
           pen p1 = new pen();
           p1.setColor("red");
           System.out.println(p1.color);
    }
}

class pen 
{
    String color;
    int tip;
    void setColor(String newColor)
    {
        color = newColor;
    }
    void setTip(int newtip)
    {
        tip = newtip;
    }
}