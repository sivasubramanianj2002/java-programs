public class Conversion {
    public static void main(String [] args)
    {
        System.out.println(octal(26));
         System.out.println(hexaDecimal(26));
    }

    private static String binary(int n)
    {
     
        int temp = n;
        String binary = "";
        while(temp > 0)
        {
            int rem = temp % 2;
            binary = rem + binary;
            temp = temp / 2;
        }

        return binary;
    }

    private static String octal(int n)
    {
        int temp = n;
        String Octal = "";

        while(temp > 0)
        {
            int rem = temp % 8;
            Octal = rem + Octal;
            temp = temp / 8;
        }
        return Octal;
    }

     private static String hexaDecimal(int n)
    {
        int temp = n;
        String hexaDecimal = "";

        while(temp > 0)
        {
            int rem = temp % 16;
            hexaDecimal = rem + hexaDecimal;
            temp = temp / 16;
        }
        return hexaDecimal;
    }
}
