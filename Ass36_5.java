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
		int iTemp = 1;
		for(int i = 0; i < iRow; i++)
		{
			for(int j = 0; j < iCol; j++)
			{
			    System.out.print(iTemp+"\t");
			    iTemp++;	
			}
			System.out.println( );
			
		}
		
	}
}