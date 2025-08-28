public class WordSearch1 {
    public static void main(String[] args) {
       char[][] matrix = { {'h', 'o', 'l', 'z'}, {'a', 'l', 'o', 'o'}, {'a', 'b', 'c', 'h'}, {'o', 'k', 'j', 'o'} };
      System.out.println(wordSearch(matrix, "zoho"));
    }

    static boolean wordSearch(char [][] matrix, String word)
    {
        int rows = matrix.length;
        int col = matrix[0].length;
        int n = word.length();
        char [] words = word.toCharArray();

        for(int i = 0; i<rows; i++)
        {
            for(int j = 0; j<col; j++)
            {
                if(matrix[i][j] == words[0])
                {
                    //check horizontally -> 
                    if(j+n <= col)
                    {
                        int k = 0;
                        for(k = 0; k<n; k++)
                        {
                            if(matrix[i][j+k] != words[k])
                            {
                                break;
                            }
                        }
                        return k == n;
                    }

                    //check vertically 
                    if(i+n <= rows)
                    {
                        int k = 0;
                        for(k = 0; k<n; k++)
                        {
                            if(matrix[i + k ][j] != words[k])
                            {
                                break;
                            }
                        }
                        return k == n;
                    }
                }

            }
        }

        return false;
    }
}
