public class AsciValue {
    
    public static void main(String [] args)
    {
      toArr();
    }

    private static void  lowerCaseAsci()
    {
        for(char c = 'a' ; c <= 'z' ; c++)
        {
            System.out.println("asci value of " + c +"is" + (int)(c));
        }
    }

    private static void UpperCase()
    {
        for(char c = 'A' ; c <= 'Z'; c++)
        {
            System.out.println("Asci value for" + c + " is" + (int)(c));
        }
    }

    private static int toAsci(char s)
    {
        int asci = s - 'a';
        return asci;
    }

    private static void toArr()
    {
        char [] Character = new char[52];
        int index =0;
        for(char c = 'a'; c <= 'z' ; c++)
        {
            Character[index++] = c;
        }

        for(char c: Character)
        {
            System.out.println("Asci value of " + c+ " is" + (int)(c));
        }
    }
}
