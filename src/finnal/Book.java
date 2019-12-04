package finnal;

public class Book {
	String Name;//书名
	int Surplus;//剩余量（在馆本数）
	String ISBN;//书好
	String Writer_Name;//作者名
	Book(){
		this.ISBN="no ISBN";
		this.Name="no name";
		this.Surplus=0;
		this.Writer_Name="no name";
	}
	Book(String Name,int Surplus,String ISBN,String Writer_Name){
		this.ISBN=ISBN;
		this.Name=Name;
		this.Surplus=Surplus;
		this.Writer_Name=Writer_Name;
	}
	void Print()
	{
		System.out.println("*****************************************************************************");
		System.out.println("Name : "+this.Name);
		System.out.println("Surplus : "+this.Surplus);
		System.out.println("ISBN : "+this.ISBN);
		System.out.println("Writer_Name : "+this.Writer_Name);
		System.out.println("*****************************************************************************");
	}
}