//Largest subarrray using sliding window

class Main {
    public static void main(String[] args) {
        int [] arr = {2,1,4,5,2,3};
        int k = 3;
        int windowSum = 0;
        for(int i =0; i<k; i++)
        {
            windowSum = windowSum + arr[i];
        }
        int maxSum = windowSum;
        int l =0;
        int r = k;
        while(r < arr.length)
        {
            windowSum = windowSum - arr[l] + arr[r];
            maxSum = Math.max(windowSum, maxSum);
            l++;
            r++;
        }
        System.out.println(maxSum);
    }
}
