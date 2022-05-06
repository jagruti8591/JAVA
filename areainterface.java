import java.util.*;
interface area
{
 void calculate(int a,int b);
}
class rect implements area
{
 public void calculate(int w,int h)
 {
  int ans=w*h;
  System.out.println("Area of Rectangle =" +ans);
 }
}
class circle implements area
{
 public void calculate(int r,int r1)
 {
  float pi=3.14f;
  float ans=pi*r*r1;
  System.out.println("Area of circle=" +ans);
 }
}
class areainterface
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter height =");
  int h=sc.nextInt();
  System.out.print("Enter width =");
  int w=sc.nextInt();
  rect obj1=new rect();
  obj1.calculate(w,h);
  System.out.print("Enter radius =");
  int r=sc.nextInt();
  circle c1=new circle();
  c1.calculate(r,r);
 }
}