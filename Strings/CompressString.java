public class CompressString {
  public static String compressS(String str)
  {
      String newStr ="";
      for(int i = 0; i< str.length();i++)
      {
        Integer count = 1;
        while (i < str.length() - 1 && str.charAt(i) == str.charAt(i+1)) 
        {
            count = count + 1;
            i++;
        }
        newStr += str.charAt(i);
        if(count > 1)
        {
            newStr += count.toString();
        }
      }
      return newStr;
  }
    
    public static void main(String[] args) {
        String str = "aaaaa";
         System.out.println(compressS(str));
    }
}