public class DiogonalMatSum {
    public static int diogonalSum(int mat [][])
    {
        int sum = 0;
       
            /*
              for(int i = 0; i < mat.length;i++)
            {
               // TIME COMPLEXITY FOR THIS SOLUTION IS 0(N^2);
            for(int j = 0; j < mat[0].length;j++)
             {
                if(i == j)
                {
                    sum += mat[i][j];
                }
                else if(i + j == mat.length - 1)
                {
                    sum += mat[i][j];
                }
             }   
               }
             */
           for(int i = 0; i < mat.length;i++)
           {
            // primary diogonal
            sum += mat[i][i];

            // secondary diogonal
            if(i != mat.length - 1- i)
            {
                sum += mat[i][mat.length - 1 - i];
            }
           }
      

        return sum;
    }
    public static void main(String args [])
    {
        int matrix [] []= {{1,2,3,4},
                            {5,6,7,8},
                             {9,10,11,12},
                            {13,14,15,16}};

       int sum = diogonalSum(matrix);
       System.out.println("The Sum is :" + sum);                    
    }
}
