import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character");
        char c = sc.next().charAt(0);
        System.out.println(vowelOrConsonant(c));

    }

    private static String vowelOrConsonant(char ch)
    {
        char [] arr = {'a', 'e', 'i', 'o', 'u'};

        for(char c : arr)
        {
            if(ch == c)
            {
                return "vowel";
            }
        }
        return "consonant";
    }
}
