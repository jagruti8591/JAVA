/*WAP a program to print fibonansi series*/

import java.util.*;
class fiboprime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter limit=");
int n=sc.nextInt();
int i,f1=0,f2=1,f3=0,j,k=0;
System.out.println("fibonacci series of prime no is: ");
  for(i=1;i<=n;i++)
 {
  f3=f1+f2;
  if(f3>n)
   break;
  else
   for(j=1;j<=f3;j++)
   {
    if(f3%j==0)
     k++;
   }
 if(k==2)
  System.out.print(f3+ " ");
  f1=f2;
  f2=f3;
  k=0;
  }
 }
}
