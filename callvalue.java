
class abc
{
void show(int p,int q)
{
p++;
q++;
System.out.println("p = "+p);
System.out.println("q = "+q);
}
}

class callvalue
{
public static void main(String args[])
{
int a=10,b=20;
System.out.println("a = "+a);
System.out.println("b = "+b);
abc obj=new abc();
obj.show(a,b);
System.out.println("a = "+a);
System.out.println("b = "+b);

}
}
