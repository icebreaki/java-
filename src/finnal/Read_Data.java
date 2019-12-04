package finnal;
import java.io.*;

public class Read_Data {
	String File_Name;//初始化文件名
	char[] input;
	String input2;
	String[] input3;
	Read_Data(String File_Name)
	{
		this.File_Name=File_Name; 
	}
	int Read_Books(Book Book_Data[])
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
		Book_Data[i]=new Book();
		Book_Data[i].Name=this.input3[4*i+1];
		Book_Data[i].Surplus=Integer.parseInt(this.input3[4*i+2]);
		Book_Data[i].ISBN=this.input3[4*i+3];
		Book_Data[i].Writer_Name=this.input3[4*i+4];
	}
	return number;
	}
}
