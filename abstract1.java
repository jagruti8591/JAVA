abstract class first
{
void add(int a,int b)
{
int c=a+b;
System.out.println("add ="+c);
}
abstract void sub(int a,int b);
}
class second extends first
{
public void sub(int a,int b)
{
int c=a-b;
System.out.println("sub ="+c);
}
}
class abstract1
{
public static void main(String args[])
{
second obj=new second();
obj.add(10,20);
obj.sub(20,10);
}
}