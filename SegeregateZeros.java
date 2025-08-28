import java.util.Arrays;

public class SegeregateZeros {
    public static void main (String [] args)
    {
        int [] arr = {1,0,0,1,0,1,0,1,1,1,1,1,1,0,0,1,1,0,1,0,0};
        System.out.println(Arrays.toString(split(arr)));
    }

    static int [] split(int [] arr)
    {
        int left = 0;
        int right = arr.length-1;

        while(left < right)
        {
            if(arr[left] == 1 && arr[right] == 0)
            {
                swap(arr,left,right);
            }
            else if (arr[left] == 0)
            {
                left++;
            }
            else if(arr[right] == 1)
            {
                right --;
            }
        }
        return arr;

    }

    static int [] swap(int [] arr, int left, int right)
    {
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
        right--;
        left++;

        return arr;
    }
}
