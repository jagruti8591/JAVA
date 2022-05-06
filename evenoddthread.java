/*============================using THREAD class====================================
class disp extends Thread
{
int id;

public void run()
{
if(id==1)
{
for(int i=1;i<=100;i++)
{
if(i%2==0)
	System.out.println("Even: "+i);
}
}

else if(id==2)
{
for(int i=100;i<=200;i++)
{
if(i%2==1)
	System.out.println("\t\tOdd: "+i);
}
}}}

class evenoddthread
{
public static void main(String args[])
{
disp d1=new disp();
disp d2=new disp();
d1.id=1;
d2.id=2;
d1.start();
d2.start();
}
}*/

//========================using RUNNABLE interface=========================
class disp implements Runnable
{
int id;

public void run()
{
if(id==1)
{
for(int i=1;i<=100;i++)
{
if(i%2==0)
	System.out.println("Even: "+i);
}
}

else if(id==2)
{
for(int i=100;i<=200;i++)
{
if(i%2==1)
	System.out.println("\t\tOdd: "+i);
}
}}}

class evenoddthread
{
public static void main(String args[])
{
disp d1=new disp();
disp d2=new disp();
d1.id=1;
d2.id=2;

Thread t1=new Thread(d1);
Thread t2=new Thread(d2);
t1.start();
t2.start();
}
}
