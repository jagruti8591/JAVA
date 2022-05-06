import java.io.*;

public class File_No_Add
{
  public static void main(String args[])throws IOException
 {
     String fname,dname,line,data;

	 BufferedReader in=new BufferedReader
	                                   (new InputStreamReader(System.in));

	 System.out.println("\nEnter Input File: ");
	 fname = in.readLine();

	 System.out.println("\nEnter Output File: ");
	 dname = in.readLine();

     DataInputStream input =new DataInputStream
                                        (new FileInputStream(fname));

     DataOutputStream output = new DataOutputStream
                                        (new FileOutputStream(dname));

		String n1=input.readLine();

		String n2=input.readLine();

		int a=Integer.parseInt(n1);

		int b=Integer.parseInt(n2);

		int sum=a+b;

        output.writeBytes(Integer.toString(sum));

		System.out.println("\nAddition Done !!");

       input.close();

      output.close();
  }
}

