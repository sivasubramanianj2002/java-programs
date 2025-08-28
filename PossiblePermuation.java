import java.util.HashMap;
import java.util.Map;

public class PossiblePermuation {
    public static void main(String[] args) {
        String s = "race Car";
        System.out.println(perumutation(s));
    }

    public static boolean perumutation(String s)
    {
        Map<Character,Integer>map = new HashMap<>();
        String str = s.toLowerCase();

        for(char c : str.toCharArray())
        {
            if(c == ' ')
            {
                continue;
            }
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        int oddCount = 0;
        for(int count : map.values())
        {
            if(count % 2 != 0)
            {
                oddCount++;
            }
        }
        return oddCount<=1;
    }
}
