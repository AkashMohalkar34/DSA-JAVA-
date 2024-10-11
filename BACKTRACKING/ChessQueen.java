public class ChessQueen {

    public static boolean isSafe(char board[][],int row ,int col)
    {
        // vertical 
        for(int i = row - 1 ; i>= 0;i++)
        {
            if(board[i][col] == 'Q')
            {
                return false;
            }
        }
        // left diagonal upward
        for(int i = row - 1, j = col - 1;i>= 0 && j>= 0;i--,j--)
          {
            if(board[i][j] == 'Q')
            {
                return false;
            }
          }
          // right diagonal upward
          for(int i = row - 1,j = col + 1;i>= 0 && j<board.length;i--,j++)
          {
            if(board[i][j] == 'Q')
            {
                return false;
            }
          }

          return true;
    }
    public static void printQueen(char board[][] , int row)
    {
        // base
        if(row == board.length )
        {
            count++;
           // printChess(board);
            return;
        }
        // recursion
        for(int j = 0 ; j<board.length;j++)
        {
            if(isSafe(board,row,j) == true)
            {
                board[row][j] = 'Q';
                printQueen(board,row+1); // recursion
                board[row][j] = 'X'; // backtracking 
            }
           
        }
}
     public static void printChess(char board[][])
     {
        System.out.println("-------chess board-----------");
        for(int i = 0; i<board.length;i++)
        {
            for(int j = 0; j< board.length;j++)
            {
                System.out.print(board[i][j] + "   ");
            }
            System.out.println();
        }
     }

      static int count = 0;
    public static void main(String args [])
    {
        int n =24;
        char board [][] = new char[n][n];
        // initialization
        for(int i = 0; i<board.length;i++)
        {
            for(int j = 0;j<board.length;j++)
            {
                board[i][j] = 'x';
            }
        }
        printQueen(board,0);
        System.out.println(count);
    }
}
