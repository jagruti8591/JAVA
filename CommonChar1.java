 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class CommonChar1{
public static String commonChars(String str1, String str2) {
if (str1.length() > 0 & str2.length() > 0) {
List<Character> s1 = new ArrayList<>();
List<Character> s2 = new ArrayList<>();
 
for (int i = 0; i < str1.length(); i++) {
s1.add(str1.charAt(i));
}
for (int i = 0; i < str2.length(); i++) {
s2.add(str2.charAt(i));
}
// Finding intersection of both lists
s1.retainAll(s2);
			StringBuilder sb = new StringBuilder();
 
			for (Character c : s1) {
				sb.append(c);
			}
 
			return sb.toString();
 
		} else
			return "";
	}
 
	public static void main(String[] args) {
 
		// User input for the string to know length
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first string");
 
		String string1 = sc.nextLine();
 
		System.out.println("Please enter the second string");
 
		String string2 = sc.nextLine();
 
		sc.close();
 
		System.out.println("Output is :" + commonChars(string1, string2));
	}
 
}
 
 