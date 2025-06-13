
public class Snake{
public static void main(String[] args)
{
int count = 1;
int n = 4;

for(int i =1;i<=n;i++)
{
for(int j = 1; j<=n;j++)
{
System.out.print(count + " ");
if(i % 2 !=0 && j!=n)
{
count = count+1;
}
if(i%2 ==0 && j!=n)
{
    count = count -1;
}
}
count = count + n;
System.out.println();
}
}
}


