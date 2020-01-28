import java.util.*;
class Prime{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
int a=Integer.parseInt(args[0]);
if(a==0||a==1)
{
System.out.println(a+" is neither prime nor composite");
}
else
{
int i,c=0;
for(i=2;i<a/2;i++)
{
if(a%i==0)
c++;
}
if(c>1)
System.out.println("It is a prime number");
else
System.out.println("It is not a prime number");
} 
}
}