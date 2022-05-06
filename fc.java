final class abc
{
int x=10;
}
class xyz extends abc
{
int y=20;
}
class fc
{
public static void main(String args[])
{
xyz obj=new xyz();
System.out.println(obj.x);
System.out.println(obj.y);
}
}