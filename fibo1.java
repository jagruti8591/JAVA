/*WAP a program to print fibonansi series*/

import java.util.*;
class fibo1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter limit=");
int n=sc.nextInt();
int f1=1,f2=2,f3=f1*f2;
 System.out.print(f1+" "+f2+" ");
  for(int i=2;i<n;i++)
 {
  System.out.print(f3+ " ");
  f1=f2;
  f2=f3;
  f3=f1*f2;
  }
 }
}
