package finnal;

public class Book {
	String Name;//����
	int Surplus;//ʣ�������ڹݱ�����
	String ISBN;//���
	String Writer_Name;//������
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