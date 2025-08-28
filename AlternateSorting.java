import java.util.Arrays;

class AlternateSorting{
    public static void main(String [] args)
    {
        int [] arr = {7, 1, 2, 3, 4, 5, 6};
       
    //    int [] res =  alternate(arr);
    //     System.out.println(Arrays.toString(res));
    
         System.out.println(Arrays.toString(newAlternate(arr)));
    
    }

    private static int [] alternate (int [] arr)
    {   
        int [] temp = new int[arr.length];
        
        int i = 0; int j = arr.length-1;
        int index = 0;
        while(i<=j)
        {
            if(index % 2 == 0)
            {
                temp[index++] = arr[j];
                j--;
            }else{
                temp[index++] = arr[i];
                i++;
            }
            
        }
        return temp;
    }
    
        public static void alternateSort(int[] arr) {
            int n = arr.length;
    
            // Step 1: Find max element for encoding
            int maxElem = Integer.MIN_VALUE;
            for (int val : arr) {
                maxElem = Math.max(maxElem, val);
            }
            int me = maxElem + 1;
    
            int start = 0, end = n - 1;
    
            // Step 2: Create a copy to preserve original values (without sorting)
            int[] temp = Arrays.copyOf(arr, n);
    
            // Step 3: Simulate two pointer max-min without sorting
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    // Even index - pick from end
                    arr[i] += (temp[end] % me) * me;
                    end--;
                } else {
                    // Odd index - pick from start
                    arr[i] += (temp[start] % me) * me;
                    start++;
                }
            }
    
            // Step 4: Decode
            for (int i = 0; i < n; i++) {
                arr[i] = arr[i] / me;
            }
        }

       static int[] newAlternate(int[] arr) {
        Arrays.sort(arr);

        int k = 0;
        int left = 0; int right = arr.length-1;
        int [] result = new int [arr.length];
        while(left <= right)
        {
            if(k % 2 == 0)
            {
                result[k++] = arr[left++];
            }
            else{
                result [k++] = arr[right--];
            }
        }

        return result;
    }
}