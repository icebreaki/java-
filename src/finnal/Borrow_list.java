package finnal;
class Borrow{
	int Student_Number;
	int Borrow_Time;
	String Book_Name;
	Borrow(int Student_number,int Borrow_time,String Book_name)
	{
		this.Book_Name=Book_name;
		this.Borrow_Time=Borrow_time;
		this.Book_Name=Book_name;
	}
}
public class Borrow_list {
Borrow Book_Borrow[];
int lenth;
Borrow_list(Borrow list[],int lenth)
{
	int i;
	this.Book_Borrow=new Borrow[1000];
	this.lenth=lenth;
	for(i=0;i<lenth;i++) {
		this.Book_Borrow[i]=list[i];
	}
}
void add(int Student_number,int Borrow_time,String Book_name)
{
	this.Book_Borrow[lenth]=new Borrow(Student_number,Borrow_time,Book_name);
	this.lenth++;
}
void Return_Book(int Student_Number,String Book_Name)
{
	int i=0;
	while(!(this.Book_Borrow[i].Book_Name==Book_Name&&this.Book_Borrow[i].Student_Number==Student_Number))
	{
		i++;
		if(i==lenth-1)
		{
		System.out.println("借书记录不存在");
		return;
		}
	}
	while(i<lenth)
	{
		this.Book_Borrow[i]=this.Book_Borrow[i+1];
		i++;
	}
	lenth--;
}
}
