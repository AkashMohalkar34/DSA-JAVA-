public class StaircaseSort {

    public static boolean staircaseS(int mat[][],int key)
    {
        /*
        // THIS IS STARTING POINT OF FOR 4 * 4 MATRIX IS ( 0 , 4);
          int row = 0;
        int col = mat[0].length - 1;

        while(col < mat[0].length  && row >= 0)
        {
            if(mat[row][col] == key)
            {
                System.out.println("Key found at " +"(" + row +"," +col +")");
                return true;
            }
               // else if(key < mat[row][col])
            // {
            //     col --;
            // }
            // else
            // {
            //     row ++;
            // }
        }
        System.out.println("Key not found");
        return false;

    }

         */
      
   // starting from bottom.(n - 1 , 0)..... 
     int row = mat.length - 1;
        int col = 0;
        while(col < mat[0].length  && row >= 0)
        {
            if(mat[row][col] == key)
            {
                System.out.println("Key found at " +"(" + row +"," +col +")");
                return true;
            }


           else if(key < mat[row][col])
           {
               row --;
           }
           else
           {
            col ++;

           }
            // else if(key < mat[row][col])
            // {
            //     col --;
            // }
            // else
            // {
            //     row ++;
            // }
        }
        System.out.println("Key not found");
        return false;

    }
    public static void main(String args [])
    {
        int mat [][] = {{10,20,30,40},
                         {15,25,35,45},
                         {27,29,37,48},
                         {32,33,39,50}};
         staircaseS(mat, 33);
    }
}
