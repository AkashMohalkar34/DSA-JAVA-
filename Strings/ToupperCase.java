public class ToupperCase {
    public static String upperCase(String str)
    {
       String sb = "";
        char ch = Character.toUpperCase(str.charAt(0));
        sb += ch;
        for(int  i= 0; i < str.length();i++)
        {
            if(str.charAt(i) == ' ' && i <str.length() - 1)
            {
                sb += str.charAt(i);
                i++;
                sb +=Character.toUpperCase(str.charAt(i));

            }
            else

            {
                sb +=str.charAt(i);
            }
        }
        return sb.toString();  
      }
       public static void main(String args [])
    {
        String str =" hi i am shradha";
        System.out.println(upperCase(str));
    }
}
