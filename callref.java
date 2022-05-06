
class abc
{
int a,b;
void show(abc obj)
{
obj.a++;
obj.b++;

}
}

class callref
{
public static void main(String args[])
{
abc obj=new abc();
obj.a=10;
obj.b=20;
System.out.println("a = "+obj.a);
System.out.println("b = "+obj.b);
obj.show(obj);
System.out.println("a = "+obj.a);
System.out.println("b = "+obj.b);

}
}
