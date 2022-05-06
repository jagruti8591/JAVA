class abc
{
abc()
{
System.out.println("In default");
}
abc(int a)
{
System.out.println("a="+a);
}
abc(int a,int b)
{
int c=a+b;
System.out.println("c="+c);
}
}
class construt
{
public static void main(String args[])
{
abc obj1=new abc();
abc obj2=new abc(10);
abc obj3=new abc(10,20);
}
}
