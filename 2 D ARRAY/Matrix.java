import java.util.Scanner;

public class Matrix 

{
    public static boolean search(int a[] [],int key)
    {
        for(int i = 0; i < a.length;i++)
        {
            for(int j = 0; j < a[0].length;j++)
            {
                if(a[i][j] == key)
                {
                    System.out.println("Key is Found :" + "(" + i +","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key nou found ");
        return false;
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        int matrix [][] = new int [3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0; i < n;i++)
        {
            for(int j = 0; j< m;j++)
            {
                 matrix [i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n;i++)
        {
            for(int j = 0; j< m;j++)
            {
                System.out.print(matrix [i][j]+ "  ");
            }
            System.out.println();
        }

        search(matrix,5);
    }
}