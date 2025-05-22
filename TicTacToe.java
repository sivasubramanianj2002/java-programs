// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    private static int n;
    private static char [][] board;
    private static char currentPlayer;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter to print board");
        n = sc.nextInt();
        board = new char [n][n];
        initiliazeBoard();
        currentPlayer = 'X';
        int moves = 0;
        boolean gameWon = false;
        
        //loop to run 
        while(moves < n*n && !gameWon)
        {
            printBoard();
            System.out.printf("Now it is %c Turn ", currentPlayer);
            
            int row = sc.nextInt();
            int col = sc.nextInt();
            
            if(isValidMove(row,col))
            {
             board[row][col] = currentPlayer;
             moves ++;
             if(checkWin(row,col))
             {
                 gameWon = true;
                 printBoard();
                 System.out.printf("Game won by %c", currentPlayer);
             }else{
                 currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
             }
            }else{
                System.out.println("Invalid move try again");
            }
        }
        
        if(!gameWon){
            System.out.println("Game is draw");
        }
        
    }
    
    private static void initiliazeBoard()
    {
        for(int i =0; i<n ;i++)
        {
            for(int j =0; j<n ; j++)
            {
               board[i][j] = '-';
            }
        }
    }
    
    private static void printBoard()
    {
        for(int i =0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static boolean isValidMove(int row , int col)
    {
        if(row >= 0 && col >= 0 && row < n && col < n && board[row][col] == '-')
        {
            return true;
        }
        return false;
    }
    
    private static boolean checkWin(int row, int col)
    {
        return checkRow(row) || checkCol(col) || checkDiagonal();
    }
    
    private static boolean checkRow(int row)
    {
        for(int col = 0; col < n ; col++)
        {
           if( board[row][col] != currentPlayer)
           {
               return false;
           }
          
        }
         return true;
    }
    
    private static boolean checkCol(int col)
    {
        for(int row = 0; row < n ; row ++)
        {
            if(board[row][col] != currentPlayer)
            {
                return false;
            }
        }
        return true;
        
    }
    
    private static boolean checkDiagonal()
    {
        boolean diag1 = true; boolean diag2 = true;
        for(int i = 0 ; i < n ; i++)
        {
            if(board[i][i] != currentPlayer)
            {
               diag1 = false;
            }
            
            if(board[i][n - i - 1] != currentPlayer)
            {
                diag2 = false;
            }
        }
        
       return diag1 || diag2;
    }
}
