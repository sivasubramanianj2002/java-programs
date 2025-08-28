import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        String str = "(2+{3}";

        System.out.println(checkBalanced(str));
    }

    public static boolean checkBalanced(String s)
    {
        Stack<Character>st = new Stack<>();

        for(char c : s.toCharArray())
        {
            if(c== '{' || c == '[' || c == '(')
            {
                st.push(c);
            }
            else if(c == ')' || c == '}' || c == ']')
            {
                if(!st.isEmpty())
                {
                    char top = st.pop();
                    if( c == '}' && top != '{' || c == '[' && top != ']' || c == '(' && top != ')')
                    {
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}
