// Online Java Compiler
// Use this editor to write, compile and run your Java code online
1 
1 1 
1 2 1 
1 3 3 1 
1 4 6 4 1 
class Main {
    public static void main(String[] args) {
        int n  = 5;
        int [][] mat = new int [n][n];
        for(int i = 0; i < n; i++){
            mat[i][0] = 1;
            mat[i][i] = 1;
            for(int j = 1; j < i; j++){
                mat[i][j] = mat[i - 1][j - 1] + mat[i -1][j];
            }
        }
        
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

