import java.util.*;

class Ass37_3
{
	public static void main(String a[])
	{
	    int iRow = 0,iCol = 0;
	    String str;
        Scanner sobj = new Scanner(System.in);		
	    System.out.println("please enter string :");
	    str = sobj.nextLine();
	    Pattern obj = new Pattern();
	    obj.Pattern(str);
	}
	
}

class Pattern
{
     public void Pattern(String s)
     {
     	for(int i = 0; i <= s.length() - 1 ; i++)
     	{
     		for(int j = 0; j <= i; j++)
     		{
                 System.out.print(s.charAt(j)+"\t");     		    	
     		}
     		System.out.println( );
                   		
     	} 
     	
     	
     	
     }	
	
}         