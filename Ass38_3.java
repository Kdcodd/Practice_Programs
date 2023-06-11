import java.util.*;

class Ass38_2
{
	public static void main(String a[])
	{
		int iRow = 0,iCol = 0;
	    Scanner sobj = new Scanner(System.in);
	    System.out.println("Please enter number of rows :");
	    iRow = sobj.nextInt();
	    System.out.println("Please enter number of column :");
	    iCol = sobj.nextInt();
	    Pattern obj = new Pattern();
	    obj.Pattern(iRow,iCol);
	}
	
}

class Pattern 
{
	public void Pattern(int iRow,int iCol)
	{
		
		for(int i = 1; i <= iRow; i++)
		{
			int iTemp = iCol;
			for(int j = 1; j <= iCol; j++)
		    {
		        System.out.print(iTemp+"\t");
		        iTemp--;	
		    }
		    System.out.println();
		}		
	}
	
}