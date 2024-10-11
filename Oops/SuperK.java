public class SuperK {
   public static void main(String args [])
   {
    Horse h1 = new Horse(4);
    System.out.println(h1.color);
   } 
}
class Animal
{
    String color;
      Animal()
      {
        
        System.out.println("Animal Constructor Calling...");
      }
}

class Horse extends Animal
{
  Horse(double d1)
  {
    super.color = "brown";
    System.out.println("Horse Constructor Calling...");
  }
}

