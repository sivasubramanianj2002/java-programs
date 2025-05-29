public class MaximumOfFour {
    public static void main(String [] args)
    {
        System.out.println(amongFour(25,76,99,0));
    }

    private static int amongFour(int n1,int n2, int n3,int n4)
    {
        int max1 = 0;
        int max2 = 0;
        int max = 0;
        if(n1 > n2)
        {
            max1 = n1;
        }else{
            max1 = n2;
        }

        if(n3 > n4)
        {
            max2 = n3;
        }else{
            max2 = n4;
        }

        if(max1 > max2)
        {
            return max = max1;
        }else{
            return max = max2;
        }
    }
    
}
