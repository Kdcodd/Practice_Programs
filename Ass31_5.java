import java.util.*;

class Ass31_5
{
    public static void main(String a[])
    {
    	Scanner sobj = new Scanner(System.in);
    	System.out.println("Please enter the string");
    	String str = sobj.nextLine();
    	Reverse robj = new Reverse();
    	robj.ReverseString(str);
    }	
}

class Reverse
{
	 public void ReverseString(String s)
	 {
	     char Arr[] = s.toCharArray(); 
	     int iCnt = 0, iStart = 0, iEnd = Arr.length-1;
	     char Temp = '\0';
	 
	     	while(iStart < iEnd)
	     	{
	     		Temp = Arr[iStart];
	     		Arr[iStart] = Arr[iEnd];
	     		Arr[iEnd] = Temp;
	     	    iStart++;
	     	    iEnd--;	
	     	}
	        for(iCnt = 0 ; iCnt < Arr.length; iCnt++)
	        {
	            System.out.print(Arr[iCnt]);	
	        }    	
	    }
}