package finnal;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Borrower_Read {
	String File_Name;//初始化文件名
	char[] input;
	String input2;
	String[] input3;
	Borrower_Read(String File_Name)
	{
		this.File_Name=File_Name; 
	}
	int Read_Borrower(Borrower Borrower_Data[])
	{
		int i;
		try {
		this.input=new char[100000];
		File input=new File(File_Name);
		FileReader reader=new FileReader(input);
		reader.read(this.input);
		reader.close();
		}
		catch(IOException a)
		{
			a.printStackTrace();
		}
		this.input2=new String(this.input);
		this.input3=this.input2.split("\n");
		for(i=0;i<input3.length;i++)
		{
			input3[i]=input3[i].substring(0,input3[i].length()-1);
		}
		int number=Integer.valueOf(this.input3[0]);
		for(i=0;i<number;i++)
		{
			Borrower_Data[i]=new Borrower();
			Borrower_Data[i].Name=this.input3[4*i+1];
			Borrower_Data[i].Sex=this.input3[4*i+2];
			Borrower_Data[i].Student_Number=Integer.parseInt(this.input3[4*i+3]);
			Borrower_Data[i].Class=Integer.parseInt(this.input3[4*i+4]);
		}
		return number;
	}
}
