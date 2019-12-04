package finnal;
import java.io.*;

public class Borrower_Save {
	String File_Name;
	Borrower_Save(String File_Name)
	{
		this.File_Name=File_Name; 
	}
	void Save(Borrower[] Data,int number)
	{
		int i;
		File Save=new File(this.File_Name);
		try {
		FileWriter Writer=new FileWriter(Save);
		Writer.write(String.valueOf(number));
		Writer.write("\r\n"); 
		for(i=0;i<number;i++)
		{
			Writer.write(Data[i].Name);
			Writer.write("\r\n"); 
			Writer.write(Data[i].Sex);
			Writer.write("\r\n"); 
			Writer.write(String.valueOf(Data[i].Student_Number));
			Writer.write("\r\n"); 
			Writer.write(String.valueOf(Data[i].Class));
			Writer.write("\r\n"); 
		}
		Writer.close();
		}
		catch(IOException a)
		{
			a.printStackTrace();
		}
	}
}