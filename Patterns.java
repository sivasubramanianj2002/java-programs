public class Patterns {
    public static void main (String [] args)
    {
        Triangle(15);
    }

    private static void Triangle(int n)
    {
        for(int i =1 ; i<=n; i++)
        {
            for(int j = 1; j<=(n*2)-1; j++)
            {
                if(i+j<=n)
                {
                    System.out.print(" ");
                }
                else if(j-i>=n)
                {
                    System.out.print(" ");
                }else{
                     System.out.print("*");
                }
            }
             System.out.println();
        }
    }
}
