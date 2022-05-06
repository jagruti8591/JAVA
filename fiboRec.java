/*WAP a program to print fibonansi series*/

import java.util.*;
class fiboRec
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter limit=");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
int value = fibo(i);
System.out.print(value+" ");
}
}
public static int fibo(int pos)
{
if (pos==1||pos==2)
return 1;
else
return fibo(pos-1)+fibo(pos-2);
}
}

