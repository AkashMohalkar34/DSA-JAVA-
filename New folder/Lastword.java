public class Lastword{

     static StringBuilder s = new StringBuilder(" ");

    public static int findLen(StringBuilder str){

        int count = 0;
        for(int i = str.length() - 1; i >= 0; i--)
           {
              if(str.charAt(i) == ' '){
                 break;
              }
              s.append(str.charAt(i));

           }

           System.out.println("Print the Word : ");
           for(int i = s.length()-1; i >= 0;i--){
               System.out.print(s.charAt(i));
           }
           System.out.println();
           return s.length() - 1;
    }
    public static void main(String args[]){
        StringBuilder str = new StringBuilder("Hello World");
        int k = findLen(str);
        System.out.println("Length of the String " + k);
        // System.out.println(s);

    }
}