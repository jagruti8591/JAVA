/*WAP to expect 2 no from user & print their addition */

import java.util.*;
class add
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter 1st Number=");
int a=sc.nextInt();
System.out.println("Enter 2nd Number=");
int b=sc.nextInt();
int c=a+b;
System.out.println("Addition is :"+c);


}
}