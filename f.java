
class frequency
{
public static void main(String args[])
{
String s1=" rajasoftwarelabs";
s1=s1.toLowerCase();
int total=0;

for(int i=0;i<s1.length();i++)
{
char ch=s1.charAt(i);

if(ch=='b'||ch=='f'||ch=='j'||ch=='p'||ch=='v')
	total++;
}
System.out.println("Total frequency: "+total);
}
}
