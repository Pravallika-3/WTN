import java.util.*;
class P2{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
if(a==0)
{
System.out.println(a+" is either negative or postive number");
} 
else if(a>0)
{
System.out.println(a +" is a positive number");
}
else 
{
System.out.println(a +"is a negative number");
}
}
}