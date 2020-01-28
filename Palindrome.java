import java.util.*;
class Palindrome{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
String a=sc.next();
int l=a.length();
int i,j,flag=0;
for(i=0,j=l-1;i<l/2;i++,j--)
{
if(a.charAt(i)!=a.charAt(j))
{flag=1;
}
}
if(flag==0)
System.out.println("It is apalindrome ");
else
System.out.println("Not a palindrome");
}
}