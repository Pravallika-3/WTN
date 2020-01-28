import java.util.*;
class matrixrev
{
public static void main(String[] args)
{
int i;
int n=Integer.parseInt(args[0]);
int[] a=new int[(n*n)+1];
int[] b=new int[(n*n)+1];
int j=n*n;
int max=0;
for(i=1;i<=n*n;i++)
{//System.out.print(Integer.parseInt(args[i]));
a[i]=Integer.parseInt(args[i]);
//System.out.println(a[i]);
}
for(i=1;i<=n*n;i++)
{
b[j]=a[i];
j=j-1;
}

for(i=1;i<=n*n;i++)
{

System.out.print(b[i]+" ");

if((i)%n==0)
{
System.out.println(" ");
}
}


}
}
