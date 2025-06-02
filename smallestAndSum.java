// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
       int num = 20;
       System.out.println(sumOfNatural(num));
    }   
    
    private static int sumOfNatural(int num)
    {
        int result  =0;
        result = num*(num+1)/2;
        return (findResult(result));
    }
    
    private static int findResult( int num)
    {
        int smallest = 9;
        
        while(num > 0)
        {
            int digit = num % 10;
            if(digit < smallest)
            {
                smallest = digit;
            }
            num = num / 10;
        }
        return smallest;
    }
}
