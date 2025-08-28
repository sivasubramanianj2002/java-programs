import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharacters {
    public static void main(String[] args) {
            String s = "geeksforgeeks";
            System.out.println(sortByFreq(s));
        
    }

    public static String sortByFreq(String s)
    {
        // List<List<Integer>> vp = new ArrayList<>();
        
        // for(int i = 0; i<=s.length()-1; i++)
        // {
        //     List<Integer>temp = new ArrayList<>();
        //     temp.add(freqCount(s, s.charAt(i)));
        //     temp.add((int)s.charAt(i));
        // }

        // Collection.sort(vp, new Comparator<List<Integer>>() {
        //     public int compare(List<Integer>a , List<Integer>b)
        //     {
        //         return a.get(0) - b.get(0);
        //     }
            
        // });

        // StringBuilder str = new StringBuilder();
        // for(List<Integer>entry : vp)
        // {
        //     str.append(entry.get(1));
        // }

        // return str.toString();

    HashMap<Character,Integer>map = new HashMap<>();

    for(char c : s.toCharArray())
     {
        map.put(c,map.getOrDefault(c, 0)+1);
    }
    
    PriorityQueue<Map.Entry<Character,Integer>>pq = new PriorityQueue<>(
        (a,b) -> b.getValue() - a.getValue()
    );

    pq.addAll(map.entrySet());

    StringBuilder str = new StringBuilder();

    while(!pq.isEmpty())
    {
        Map.Entry<Character,Integer>entry = pq.poll();
        for(int i =0; i<entry.getValue(); i++)
        {
            str.append(entry.getKey());
        }
    }

    return str.toString();
}

    // static int freqCount(String s, char c)
    // {
    //     int n = s.length();
    //     int count = 0;
    //     for(int i = 0; i<n; i++)
    //     {
    //         if(s.charAt(i) == c)
    //         {
    //             ++count;
    //         }
    //     }

    //     return count;
    // }
    //with collections 

}
