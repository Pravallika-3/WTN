import java.util.*;
class matrix
{
public static void main(String[] args)
{
int i,j;
int[] a=new int[9];
int max=0;
for(i=0;i<3*3;i++)
{a[i]=Integer.parseInt(args[i]);
}
for(i=0;i<3*3;i++)
{

System.out.print(a[i]+" ");
if(max<a[i])
{
max=a[i];
}
if((i+1)%3==0&&i!=0)
{
System.out.println(" ");
}
}
System.out.println("The biggest number is:"+max);
}
}
