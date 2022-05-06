class grandpa
{
void show()
{
System.out.print("I am grandma");
}
}
class father extendsgrandpa
{
void show()
{
System.out.print("I am father");
}
}
class child extends father
{
void show()
{
System.out.print("I am child");
}
}
class dynamicDis
{
public static void main(String args[])
{
grandpa ref;
ref=new grandpa();
ref.show();
ref=new father();
ref.show();
ref=new child();
ref.show();
}
}
