//Reverse words in java 
class Main {
    public static void main(String[] args) {
    String str = "Thug Life";
    
    char [] arr = str.toCharArray();
    
    reverse(arr, 0, arr.length-1);
    
    //step 2 here we get reveresed of string now make it normal
    
    int start =0;
    for(int i =0; i<=arr.length; i++)
    {
        if(i == arr.length || arr[i] == ' ')
        {
            reverse(arr, start, i-1);
            start = i+1;
        }
    }
    
    for(char c: arr){
        System.out.print(c);
    }
    }
    
    public static void reverse(char [] arr , int start, int end)
    {
        while(start<end)
        {
            char temp  = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }
}
