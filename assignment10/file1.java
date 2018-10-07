import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
class file1 
{
	public static void main(String args[]) throws IOException
	{      

        String fileInput = "Users//Shivam//Desktop//helloworld.txt";
        String fileoutput = "Users//Shivam//Desktop//helloworld1.txt";
  
            FileReader f1=new FileReader(fileInput);
            FileWriter f2=new FileWriter(fileoutput);
            
            int c;
            while((c=f1.read())!=-1) 
			{
                f2.write(c);
            }
	        f2.close();
            FileReader f3=new FileReader(fileoutput);
            int ch;
            while ((ch = f3.read()) != -1) 
			{
                System.out.print((char)ch);
			}

            f1.close();
            f3.close();
           
     }
}