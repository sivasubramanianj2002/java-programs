public class validAnagram {
    public static void main(String [] args)
    {
        System.out.println(anagram("som","vels"));
    }

    private static boolean anagram(String s, String t)
    {
        char [] ch = s.toCharArray();
        char [] ch2 = t.toCharArray();
        int [] index = new int[26];

        for(char c : ch)
        {
            index[c - 'a']++;
        }

        for(char c : ch2)
        {
            index [c - 'a']--;
        }

        for(int i = 0; i<index.length; i++)
        {
            if(index[i] != 0)
            {
                return false;
            }
        }

        return true;
    }
}
