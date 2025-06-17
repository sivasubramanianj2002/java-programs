import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

class UnionArrays{
    public static void main (String [] args)
   {
    int [] arr1 = {2,4,5,6,7,9,13};
    int [] arr2 = {2,3,4,5,6,7,8,9,11,15};
       int[] result = unionArrays(arr1, arr2);
       int [] result2 = unionArrayList(arr1, arr2);
        System.out.println(Arrays.toString(result2));

   }
   private static int [] unionArrays (int [] arr1, int [] arr2)
   {    
      Set<Integer> s = new HashSet<>();

     for(int num: arr1)
     {
        s.add(num);
     }

     for(int num:arr2)
     {
        s.add(num);
     }

     int [] ans = new int[s.size()];

     int count = 0;
     for(int n :s)
     {
        ans[count++] = n;
     }

     return ans;
   }

   private static int [] unionArrayList(int [] arr1, int[] arr2)
   {
      ArrayList <Integer> arr = new ArrayList<>();
      int n1 = arr1.length;
      int n2 = arr2.length;
      int i =0;
      int j = 0;
      while(i<n1 && j<n2)
      {
         if(arr1[i] < arr2[j])
         {
            addToList(arr, arr1[i]);
            i++;
         }else{
            addToList(arr, arr2[j]);
            j++;
         }
      }

      while (i < n1) {
         addToList(arr, arr1[i++]);
     }

     while (j < n2) {
      addToList(arr, arr2[j++]);
     }
     int[] result = new int[arr.size()];
     for (int k = 0; k < arr.size(); k++) {
         result[k] = arr.get(k);
     }
      return result;

   }

   private static void addToList(ArrayList <Integer> arr, int value)
   {
      if(arr.isEmpty() || arr.get(arr.size()-1) != value)
      {
         arr.add(value);
      }
   }
}
