package finnal;
import java.io.*;

public class RUN {

	public static void main(String[] args) {
		int i,j;
		int Booknumber,Borrowernumber;
		Book Data[]=new Book[1000];
		Borrower B_Data[]=new Borrower[1000];
		
		
		
		
		
		File Book_data=new File("Books");
		if(!Book_data.exists())
			{
			Data[0]=new Book("Math",300,"978-7-03-061207-6","NXY");
			Data[1]=new Book("Java",200,"978-7-5647-0389-9","JCH");
			Data[2]=new Book("Probability_Theory",150,"978-7-04-046386-6","XQZ");
			Booknumber=3;
			System.out.println("ͼ�����ݲ����ڣ��Ѿ���ʼ��������Ĭ������");
			for(i=0;i<3;i++)
			{
				System.out.println("BookNumber:"+i);
				Data[i].Print();
			}
			}
		else{
			Read_Data in=new Read_Data("Books");
			Booknumber=in.Read_Books(Data);
			System.out.println("¼����ϣ�һ��������"+Booknumber+"���鼮��Ϣ");
			for(i=0;i<Booknumber;i++)
			{
				Data[i].Print();
			}
		}
		
		
		
		
		
		
		Borrower Borrower_Data[]=new Borrower[1000];
		File Borrower_data=new File("Borrower");
		if(!Borrower_data.exists())
			{
			B_Data[0]=new Borrower("John","male",20180916,1);
			B_Data[1]=new Borrower("Mike","male",20180917,2);
			B_Data[2]=new Borrower("Ann","female",20180918,1);
			Borrowernumber=3;
			System.out.println("���������ݲ����ڣ��Ѿ���ʼ��������Ĭ������");
			}
		else{
			Borrower_Read in=new Borrower_Read("Borrower");
			Borrowernumber=in.Read_Borrower(B_Data);
			System.out.println("¼����ϣ�һ��������"+Borrowernumber+"����������Ϣ");
			for(i=0;i<Borrowernumber;i++)
			{
				B_Data[i].Print();
			}
		}
		while(true)
		{
			System.out.println("��ӭʹ���鼮�������ϵͳ");
			System.out.println("********************************************");
			System.out.println("");
			break;
		}
		
		
		
		
		
		
		
		
		
		Save_Data Save=new Save_Data("Books");
		Save.Save(Data,Booknumber);
		System.out.println("�鼮��Ϣ����ɹ�");
		
		
		Borrower_Save B_Save=new Borrower_Save("Borrower");
		B_Save.Save(B_Data, Borrowernumber);
		System.out.println("�����߱���ɹ�");
		
		
		new UI();
	}

}
