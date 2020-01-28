import java.util.*;
class Sum{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=Integer.parseInt(args[0]);
int res=0,sum=0;
while(a>0)
{
res=a%10;
sum=sum+res;
a=a/10;
}
System.out.println(sum);
}
}