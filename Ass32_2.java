import java.util.*;

class Ass32_2
{
    public static void main(String a[])
    {
        Display obj = new Display(5);   	
        obj.Accept();
    	obj.DisplayDivByFive();
    }	
	
}

class Display
{
	public int iSize;
	public int Arr[];
	
	Display(int iLength)
	{
		iSize = iLength;
		Arr = new int[iSize];
	}
	
	public void Accept()
	{
		System.out.println("Enter the element in array :");
		int iCnt = 0;
		Scanner sobj = new Scanner(System.in);
		for(iCnt = 0; iCnt < Arr.length;iCnt++)
		{
		    Arr[iCnt] = sobj.nextInt();	
		}
	}
	
	public void DisplayDivByFive()
	{
		System.out.println("Numbers which are divible by five are :");
		for(int iCnt = 0; iCnt <Arr.length; iCnt++)
		{
		     if(Arr[iCnt] % 5 == 0)
		     {
		         System.out.println(Arr[iCnt]);	
		     }	
		}
	}
}