import java.util.*;
class Factorial
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
int fact=1;
do
{
fact=fact*n;
n=n-1;
}while(n>1);

System.out.println(fact);
}
}