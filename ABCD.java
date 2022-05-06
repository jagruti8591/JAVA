
import java.util.*;
class A
{
int x=10;
}
class B extends A
{
int y=20;
}
class ABCD
{
public static void main(String args[])
{
B obj=new B();
System.out.println("x= "+obj.x);
System.out.println("y= "+obj.y);
}
}
