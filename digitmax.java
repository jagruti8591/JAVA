class digitmax
{
public static void main(String args[])
{
int n=496;
int max=0;
while(n>0)
{
int digit =n%10;
if(digit>max)
{
max=digit;
}
n=n/10;
}
System.out.println("ans= "+max);
}
}