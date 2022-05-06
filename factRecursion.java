/*WAP to print factorial of given no using Recursion */

class factRecursion
{
public static void main(String args[])
{
int n=5;
int r=fact(n);
System.out.println("ans="+r);
}
public static int fact(int n)
{
 if (n==1)
   return 1;
 else
  return n*fact(n-1);

}
}