class abc
{
final void show()
{
System.out.println("In abc");
}
}
class pqr extends abc
{
void show()
{
System.out.println("In pqr");
}
}

class finalM
{
public static void main(String args[])
{
pqr obj=new pqr();
obj.show();
}
}