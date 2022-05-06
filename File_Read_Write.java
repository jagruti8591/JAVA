import java.io.*;
import java.util.*;

class File_Read_Write
{
  public static void main(String args[])throws Exception
  {
	  Scanner sc=new Scanner(System.in);

	 System.out.println("\nEnter source file name: ");
	 String fname = sc.nextLine();

	 System.out.println("\nEnter Destination file name: ");
	 String dname = sc.nextLine();

     FileInputStream fin=new FileInputStream(fname);

     FileOutputStream fout=new FileOutputStream(dname);

 	 long startTime = System.currentTimeMillis();

	 int  ch=fin.read();//read file char

	 while(ch!=-1)//end of file
	 {
	   fout.write((char)ch);
	   ch=fin.read();
	 }

	 long endTime   = System.currentTimeMillis();

 	long totalTime = endTime - startTime;
	System.out.println("\nTotal Time in Milli. : " +totalTime);

     fin.close();
	 fout.close();
	System.out.println("\nFile Reading Writing Successfully !!!\n");
  }
}




