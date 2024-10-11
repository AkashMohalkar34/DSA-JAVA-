public class Substring {
    public static String substring(String str, int si, int ei)
    {
        String substr = "";
        for(int i = si ; i< ei ;i++)
        {
            substr += str.charAt(i);
            
        }
        return substr;
    }
    public static void main(String args [])
    {
        String s1 = "hello World";
       // System.out.println(substring(s1,0,5));
       System.out.println(s1.substring(0,6));
    }
}
