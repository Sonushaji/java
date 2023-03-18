import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io,*;
import java.io.IOexception;
class file
{
 public static void main (String args[])throws IOException
 {
   try
   {
    FileWriter f3=new FileWriter("file4.txt");
    FileWriter f1=new FileWriter("file3.txt");
    BufferedReader fr1=new BufferedReader(f1);
    String l1=fr1.readLine();
    while(l1!=null)
    {
        f3.write(l1);
        f3.write("\n");
        l1=fr1.readLine();
    }

   }
   FileReader f2=new FileReader("file2.txt");
   BufferReader fr2=new BufferedReader(f2);
   String l1=fr2.readLine();
   f3.Write(l2);
   f3.write ("\n");
   


 }

}
