public class Access {
    public static void main(String args [])
    {
       BankAccout a = new BankAccout();
       a.username ="Akash";
       System.out.println(a.username);
   //     a.password = 23; // get an erroe becausethey are private     within the class.

   a.setPass(23);
   a.display();;
  
    } 
}

class BankAccout{
    String username;
    private int password ;
    void setPass(int pass)
    {
        password = pass;
    }

    void display()
    {
        System.out.println(password);
    }
}