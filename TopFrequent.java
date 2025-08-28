import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class TopFrequent {
    public static void main(String [] args)
    {
        int [] arr = {3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3};
        frequentElement(arr);
    }

    static void frequentElement(int [] arr)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: arr)
        {
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        //using min-heap
            PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(
                (a,b) -> a.getValue().compareTo(b.getValue()));

            for(Map.Entry<Integer,Integer> entry : map.entrySet())
            {
                pq.offer(entry);
                if(pq.size()>3)
                {
                    pq.poll();
                }
            }

            for(Map.Entry<Integer,Integer> e : pq)
            {
                System.out.println(e.getKey());
            }

        // List<Map.Entry<Integer,Integer>> entry = new ArrayList<>(map.entrySet());

        // entry.sort((a,b)-> b.getValue().compareTo(a.getValue()));

        // for(int i= 0; i<3; i++)
        // {
        //     System.out.println(entry.get(i).getKey());
        // }
        
    }
}
