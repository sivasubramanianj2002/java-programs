
import java.util.Scanner;
public class Divident {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to divide");
        int divident = sc.nextInt();

        System.out.println("enter number to divisor");
        int divisor = sc.nextInt();

        Divident(divident,divisor);
    }

    private static void Divident(int n, int divisor)
    {
        int remainder = n % divisor;
        int quotient = n / divisor;

        System.out.println("Remainder is" + remainder + "Quotient is " + quotient);
    }
}
