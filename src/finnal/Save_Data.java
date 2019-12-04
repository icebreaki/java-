package finnal;
import java.io.*;

public class Save_Data {
	String File_Name;
	Save_Data(String File_Name)
	{
		this.File_Name=File_Name; 
	}
	void Save(Book[] Data,int number)
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
			Writer.write(String.valueOf(Data[i].Surplus));
			Writer.write("\r\n"); 
			Writer.write(Data[i].ISBN);
			Writer.write("\r\n"); 
			Writer.write(Data[i].Writer_Name);
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
