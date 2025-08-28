import java.util.*;

public class SumOfTwoPrime {
    public static void main(String [] args)
    {
        int n = 4;
        System.out.println(check(n));
    }

    static boolean check(int n)
    {
        List<Integer> list = getPrimes(n);

        int left = 0; int right = list.size()-1;
        while(left <= right)
        {
            int sum = list.get(left) + list.get(right);

              if (sum == n) {
            return true;   
        } else if (sum < n) {
            left++;        
        } else {
            right--;      
        }
        }

        return false;
    }

    public static List<Integer> getPrimes(int n)
    {

        List<Integer>arr = new ArrayList<>();

        for(int i = 2; i<=n; i++)
        {
            if(isPrime(i))
            {
                arr.add(i);
            }
        }
        return arr;

    }
    static boolean isPrime(int n)
    {
        if(n<=1) return false;
        if(n==2) return true;
        if(n % 2 == 0) return false;

        for(int i = 3; i * i <= n; i = i+2)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
         return true;
    }
}
