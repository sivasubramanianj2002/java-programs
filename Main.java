public class Main {
    public static void main (String [] args)
    {
        int [] arr = {2,4,241,2,4};
        System.out.print(findUniqueElements(arr));
    }

    private static int findUniqueElements(int [] arr)
    {
        int result = 0;

        for(int num : arr)
        {
            result = result ^ arr;
        }

        return result;
    }
}
