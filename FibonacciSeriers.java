import java.util.Arrays;

public class FibonacciSeriers {
    public static void main(String [] args)
    {
        int n = 20;
        System.out.println(Arrays.toString(fibonacii(n)));
    }

    static int [] fibonacii(int n)
    {
        int [] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2; i<n; i++)
        {
            arr[i] = arr[i-1] + arr[i-2];
        }

        return arr;
    }
}
