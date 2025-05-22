// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    private static boolean isPrime(int n)
    {
        if(n < 2)
        {
            return false;
        }
        
        for(int i =2 ; i * i <= n ; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        
        return true;
    }
    private static int findNearestPrime(int n)
    {
        int lower = n;
        int higher = n;
        
        while(true)
        {
            if(isPrime(lower))
            {
                return lower;
            }
            if(isPrime(higher))
            {
                return higher;
            }
            
            lower --;
            higher ++ ;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int nearestPrime = findNearestPrime(n);
        System.out.println("Nearest prime to " + n + " is " + nearestPrime);

        scanner.close();
    }
}
