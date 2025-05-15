// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class PrimeNumbers {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter no to find prime ");
       int n = input.nextInt();
       
       System.out.print("prime numbers are from 1 -" + n + "are ");
       for(int i =2; i<=n; i++)
       {
           if(isPrime(i) && i % 7==0)
           {
               System.out.print(i+ " ");
           }
           
       }
       input.close();
    }
    public static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        
        for(int i =2 ; i<=n/2 ; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
