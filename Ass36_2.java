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
		char cValue1 = 'A';
		char cValue2 = 'a';
		for(int i = 0; i < iRow; i++)
		{
			for(int j = 0; j < iCol; j++)
			{
			    if(i % 2 == 0)
			    {
			    System.out.print(cValue1+"\t");
			    cValue1++;
			    }
			  
			    else
			    {
			    	System.out.print(cValue2+"\t");
			         cValue2++;
			    }	
			}
			System.out.println( );
			cValue1 = 'A';
			cValue2 = 'a';
		}
		
	}
}