public class ReverseWords {
    public static void main(String[] args) {
        String s = "the sky is blue";
        char [] ch = s.toCharArray();
        int len = s.length();
        reverse(ch,0,len-1);
        
        int start = 0;
        for(int i = 0; i<=len; i++)
        {
            if(i == len || ch[i] == ' ')
            {
                reverse(ch, start, i-1);
                start = i+1;
            }
        }

        System.out.println(new String(ch));
    }

    public static void reverse(char [] ch,int start, int end)
    {
        while(start < end)
        {
        char temp = ch[start];
        ch[start++] = ch[end];
        ch[end--] = temp;
        }
    }


}
