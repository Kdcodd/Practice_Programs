import java.util.*;

class Ass36_1
{
	public static void main(String a[])
	{
		int iRow = 0,iCol = 0;
		Scanner sobj = new Scanner(System.in);
		System.out.println("Please enter the number of of rows : ");
		iRow = sobj.nextInt();
		System.out.println("Please enter the number of of columns : ");
		iCol = sobj.nextInt();
		Pattern obj = new Pattern();
		obj.Pattern(iRow,iCol);
	}
	
}

class Pattern
{
	public void Pattern(int iRow,int iCol)
	{
		char c = 'A';
		for(int i = 1; i < iRow; i++)
		{
			for(int j = 0; j < iCol; j++)
			{
			    System.out.print(c+"\t");
			    c++;	
			}
			System.out.println( );
			c = 'A';
		}
		
	}
}