import java.util.Scanner;

class Ass40_1
{
public static void main(String a[])
{
	int iRow = 0,iCol = 0;
	Scanner sobj = new Scanner(System.in);
	System.out.println("Please enter number of rows :");
	iRow = sobj.nextInt();
	System.out.println("Please enter number of columns :");
    iCol = sobj.nextInt();
    Pattern obj = new Pattern();
      obj.Pattern(iRow,iCol);	    
}
}

class Pattern 
{
	public void Pattern(int iRow,int iCol)
	{
		for(int i =iRow; i >= 1; i--)
		{
			for(int j = 1; j <= iCol; j++)
			{
				if(i == j)
				{
				    System.out.print("#\t");	
				}
				else
				{
				    System.out.print("*\t");	
				}
			}
			System.out.println(" ");
			
		}
		
		
	}
}