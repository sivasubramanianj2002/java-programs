import java.util.*;
public class Duplicates {
    public static void main(String[] args) {
        String s = "NAaven";

        // System.out.println(duplicateString(s));
        int [] arr = {0,0,1,1,1,2,2,3,3,4};
        int [] result = duplicateInteger(arr);
        for(int num : result)
        {
            System.out.print(num + "");
        }
    }

    public static String duplicateString(String s)
    {
        boolean [] arr = new boolean [256];
        StringBuilder str = new StringBuilder();

        for(int i = 0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(!arr[c])
            {
                arr[c] = true;
                str.append(c);
            }
        }
        return str.toString();
    }

    public static int [] duplicateInteger(int [] arr)
    {
        List<Integer>list = new ArrayList<>();
    
        for(int num : arr)
        {
            if(list.isEmpty() || list.get(list.size()-1) != num)
            {
                list.add(num);
            }
        }
             int [] ans = new int[list.size()];

            for(int i = 0; i<list.size(); i++)
            {
                ans[i] = list.get(i);
            }
          return ans;
    }
}
