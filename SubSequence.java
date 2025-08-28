public class SubSequence {
    public static void main(String[] args) {
        String a = "zoho";
        String b = "india";
        System.out.println(subSequence(a, b));
    }

    public static boolean subSequence(String a, String b)
    {
        int i = 0; 
        int j = 0;
        char [] arr1 = a.toCharArray();
        char [] arr2 = b.toCharArray();
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i] == arr2[j])
            {
                i++;
            }
            j++;
        }
        return i == arr1.length;
        
    }
}
