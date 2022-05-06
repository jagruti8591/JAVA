/*WAP a program to print diff betwnn max min no*/

import java.util.*;
class diff
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter how many no=");
int n=sc.nextInt();
int a[]=new int[n];
for(int  i=0;i<n;i++)
{
System.out.print("Enter "+(i+1)+" numbers :");
a[i]=sc.nextInt();
}
Arrays.sort(a);
int max=a[a.length-1];
int min=a[0];
System.out.print("ans="+(max-min));
}
}