public class findUnique {
    public static void main(String[] args)
    {
      System.out.println(findUnique("zoho"));
    }

    private static String findUnique(String s)
    {
        char [] arr = s.toCharArray();
        int [] index = new int[26];
        for(char c : arr)
        {
            index[c - 'a']++;
        }

        String ans = "";
        for(char c : arr)
        {
            if(index[c - 'a'] == 1)
            {
                 ans = ans + c;
            }
        }

        return ans;
      
    }
}
