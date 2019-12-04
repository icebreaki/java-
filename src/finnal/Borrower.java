package finnal;

public class Borrower {
	String Name;//借书者姓名
	String Sex;//性别
	int Student_Number;//学号
	int Class;//班级
	Borrower(){
		this.Name="no name";
		this.Student_Number=0;
		this.Sex="unknown";
		this.Class=0;
	}
	Borrower(String Name,String Sex,int Student_Number,int Class){
		this.Name=Name;
		this.Student_Number=Student_Number;
		this.Sex=Sex;
		this.Class=Class;
	}
	void Print()
	{
		System.out.println("*****************************************************************************");
		System.out.println("Name : "+this.Name);
		System.out.println("Sex : "+this.Sex);
		System.out.println("Student_number : "+this.Student_Number);
		System.out.println("Class: : "+this.Class);
		System.out.println("*****************************************************************************");
	}
	void Borrow(Borrow_list List,String Book_Name,int Borrow_time)
	{
		List.add(this.Student_Number,Borrow_time,Book_Name);
	}
}


