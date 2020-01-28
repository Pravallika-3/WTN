import java.util.*;
class Compile
{
public static void main(String[] args)
{int c=0;
int n=Integer.parseInt(args[0]);
try
{
int i;

int[] a=new int[n];
for(i=1;i<=n;i++)
{
a[i]=Integer.parseInt(args[i]);
c++;
}
}
catch(Exception e)
{
System.out.println("please enter remaining "+(n-c)+" values");
}
}
}