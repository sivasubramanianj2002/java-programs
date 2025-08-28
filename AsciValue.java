public class AsciValue {
    
    public static void main(String [] args)
    {
     System.out.print(toArr());
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

    private static char [] toArr()
    {
        char [] Character = new char[26];
        int index =0;
        for(char c = 'a'; c <= 'z' ; c++)
        {
            Character[index++] = c;
        }

        for(char c: Character)
        {
            System.out.println("Asci value of " + c+ " is" + (int)(c));
        }

        return Character;
    }
}
