import java.util.ArrayList;
import java.util.List;

public class SortVowels {
    public static void main(String [] args)
    {
        String s = "lEetcOde";
        System.out.print(sortVowels(s));
    }
    public static String sortVowels(String s) {
      char [] arr = s.toCharArray();
        List<Character> list = new ArrayList<>();
        
        for(char vowel : arr)
        {
            if(isVowel(vowel))
            {
                list.add(vowel);
            }
        }
        list.sort((a,b) -> a - b);
      
        String ans = "";
        for(char vowel : arr)
        {
        
            if(isVowel(vowel))
            {
               char ch = list.get(0);
               ans = ans + ch;
               list.remove(0);
            }
            else{
                 ans = ans + vowel;
            }
        }

        return s;
    }

    public static boolean isVowel(char s) {

    return s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u' ||
           s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U';
    }
}
