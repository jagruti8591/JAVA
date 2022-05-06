import java.io.*;
import java.util.*;

class File_Transfer_Using_Buffer
{
  static int rate=5000,len;

  public static void main(String args[])throws Exception
  {

	byte[] buf = new byte[rate];

	Scanner sc=new Scanner(System.in);

     System.out.println("\nEnter source file ");
	 String fname = sc.nextLine();

	 System.out.println("\nEnter Destin'n file");
	 String dname = sc.nextLine();

     FileInputStream fin=new FileInputStream(fname);

	 FileOutputStream fout=new FileOutputStream(dname);

	 long startTime = System.currentTimeMillis();

	 while ((len = fin.read(buf)) > 0)
	 {
		fout.write(buf, 0, len);
	 }

	 long endTime=System.currentTimeMillis();

	 long totalTime = endTime - startTime;

	 System.out.println("\nTotal Time:"+totalTime);

     fin.close();

	 fout.close();

	 System.out.println("\nFile R/W Done!!!\n");
   }
}

