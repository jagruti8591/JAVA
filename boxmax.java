
import java.util.*;
class box
{
int width,depth,height;
void get()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter height = ");
height=sc.nextInt();
System.out.print("Enter width = ");
width=sc.nextInt();
System.out.print("Enter depth = ");
depth=sc.nextInt();
}
int area()
{
int v=height*width*depth;
return v;
}
}
class boxmax
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter total boxes = ");
int n=sc.nextInt();
int max=0;
box b[]=new box[n];
for(int i=0;i<n;i++)
{
b[i]=new box();
b[i].get();
int v=b[i].area();
System.out.println("Area = "+v);
if(v>max)
max=v;
}
System.out.println("Max volume= "+max);

}
}