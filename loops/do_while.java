public class do_while {
    
    public static void main(String args [])
    {
        int counter = 1;
        do{
            System.out.println("Hello world");
            if(counter == 2)
            {
                break;
            }
            System.out.println("Hello world");
            counter++;
        }while(counter < 10);
    }
}
