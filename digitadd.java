class digitadd
{
public static void main(String args[])
{
int a[]={12,23,78,21};
int max=0,item=0,sum=0;
for(int i=0;i<a.length;i++)
{
    int n=a[i];
    while(n>0)
 {
    int digit=n%10;
    sum=sum+digit;
    n=n/10;
 }

}
System.out.println("Ans is "+sum);
}
}