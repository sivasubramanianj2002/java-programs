public class SwapNumbers {
    public static void main(String [] args)
    {
        SwapTwoNum(12,31);
    }

    private static void SwapTwoNum(int n1, int n2)
    {
        int temp = 0;
        temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("First is " + n1 + "Second is " + n2);
    }
    
    //swap with xor operator

    private static void swapXor (int n1 , int n2)
    {
         n1 = n1 ^ n2;
        n2 = n1  ^ n2;
        n1 = n1 ^ n2;
    }
}
