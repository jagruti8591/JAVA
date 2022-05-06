import java.util.*;

class digitmaxjava
{
public static void main(String args[])
{
int n=496;
String s1=n+"";
char ch[]=s1.toCharArray();
Arrays.sort(ch);
System.out.println("Ans = "+ch[ch.length-1]);
}
}
