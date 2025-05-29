
import java.util.Arrays;

public class CombinationSum {
    public static int[] findPairWithSum(int[] arr, int n, int x) {
        // Create a copy of the array and sort it
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        // Two-pointer technique
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int sum = sortedArr[left] + sortedArr[right];
            if (sum == x) {
                // Find the original indices of the pair
                int index1 = -1, index2 = -1;
                for (int i = 0; i < n; i++) {
                    if (arr[i] == sortedArr[left] && index1 == -1) index1 = i;
                    if (arr[i] == sortedArr[right] && index2 == -1) index2 = i;
                }
                return new int[]{index1, index2}; // Return indices of the pair
            } else if (sum < x) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1}; // No pair found
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int n = arr.length;
        int x = 16;
        int[] result = findPairWithSum(arr, n, x);
        if (result[0] != -1) {
            System.out.println("Pair found at indices: " + result[0] + ", " + result[1]);
            System.out.println("Values: " + arr[result[0]] + ", " + arr[result[1]]);
        } else {
            System.out.println("No pair found");
        }
        // Output: Pair found at indices: 3, 4
        //         Values: 6, 10
    }
}

