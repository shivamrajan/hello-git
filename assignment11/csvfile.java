import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
class csvfile 
{

    public static void main(String[] args) throws IOException
	{      

        String fileInput = "Users//apple//iCloudDrive//Desktop//hlo.txt";
        FileWriter f1=new FileWriter(fileInput);
        String str=("shivam,ram,rahul");
        f1.write(str);
		f1.close();
		FileReader f2=new FileReader(fileInput);
        int ch;
        while ((ch = f2.read()) != -1) 
		{
            System.out.print((char)ch);
		}

        f2.close();
           
    }
}