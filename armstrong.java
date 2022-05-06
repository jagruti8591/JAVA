/*WAP a program to accept a number from user & identify it is armstrong or not*/

import java.util.*;
class armstrong
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter no= ");
int n=sc.nextInt();
String s1=n+"";
int digit=s1.length();
int sum=0,temp=n;
while(n>0)
{
int rem=n%10;
sum+=Math.pow(rem,digit);
n=n/10;
}
if(sum==temp)
   System.out.println("Number is Armstrong");
else
   System.out.print("Number is not Armstrong");
}
}