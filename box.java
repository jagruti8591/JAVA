
import java.util.*;
class box
{
int width,depth,height;
void get()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter height = ");
height=sc.nextInt();
System.out.println("Enter width = ");
width=sc.nextInt();
System.out.println("Enter depth = ");
depth=sc.nextInt();
}
int area()
{
int v=height*width*depth;
return v;
}
}
class textbox
{
public static void main(String args[])
{
box b1=new box();
b1.get();
int ans=b1.area();
System.out.println("Volume = "+ans);
}
}