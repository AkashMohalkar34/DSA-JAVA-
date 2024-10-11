public class StringCompare {
    public static void main(String args [])
    {
        String s1 ="akash";
        String s2 ="akash";
        String s3 = new String("akash");
        if(s1 == s2)
        {
            System.out.println("String are equal");
        }
        else
        {
            System.out.println("String are not Equal");
        }

        if(s1 == s3)
        {
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are not equal");
        }

        if(s1.equals(s3))
        {
            System.out.println("String are equal");
        }
        else
        {
            System.out.println("string are not equal");
        }
    }
}
