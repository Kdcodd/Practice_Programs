import java.util.*;

class Ass40_5
{
	public static void main(String ap[])
	{
		int iRow = 0,iCol = 0;
		Scanner sobj = new Scanner(System.in);
		System.out.println("Please enter the number of rows");
		iRow = sobj.nextInt();
		System.out.println("Please enter the number of columns");
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
    		for(int j = 0; j <= iCol; j++)
    		{
    			int iTemp = j + 1;
    			if(i == 1)
    			{
    				System.out.print(iTemp+"\t");
    			}
    			else if(j == 0)
    			{
    				System.out.print(iTemp+"\t");
    			}
    			else if(j == 4)
    			{
    				System.out.print(iTemp+"\t");
    			}
    			else if(i == j + 1)
    			{
    				System.out.print(i+"\t");
    			}
    			else
    		    {
    		          System.out.print("\t");	
    		    }
    		   
    		}
    		System.out.println(" ");
    		
    	}
    	
    	
    }



}