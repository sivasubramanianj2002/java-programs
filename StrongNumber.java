// User function Template for Java

class Solution {
    int isPerfect(int N) {
       int num = N;
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            sum += fact(rem);  // Add factorial of each digit to sum
            num = num / 10;
        }

        return (sum == N) ? 1 : 0; // Return 1 if it's a strong number, else 0
    }

    int fact(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
    
}
