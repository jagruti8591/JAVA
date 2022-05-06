/*WAP to find total uppercase,lowercase,symbol & number present in string
IP= ProgrAm@123
UC=2	LC=5	s=1	no=3*/

class find
{
public static void main(String args[])
{
String s1="ProgrAm@123#";
int u=0,l=0,n=0,s=0;
for(int i=0;i<s1.length();i++)
{
char ch=s1.charAt(i);

if(ch>='A'&&ch<='Z')
	u++;
else if(ch>='a'&&ch<='z')
	l++;
else if(ch>='0'&&ch<='9')
	n++;
else
	s++;
}
System.out.println("No. of Uppercase: "+u);
System.out.println("No. of Lowercase: "+l);
System.out.println("No. of Numbers: "+n);
System.out.println("No. of Symbols: "+s);
}
}