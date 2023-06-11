import java.util.*;

class Ass32_3
{
	public static void main(String a[])
	{
	   Display obj = new Display(5);
	   obj.Accept();
	   obj.MultiplesOfEleven(); 	
	}
}

class Display
{
	
	public int iSize;
	public int Arr[];
	
	public Display(int iLength)
	{
		iSize = iLength;
	    Arr = new int[iSize];
	}
	
	
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter element in array :");
		
		for(int iCnt = 0; iCnt < Arr.length; iCnt++ )
		{
			Arr[iCnt] = sobj.nextInt();
		}
	}
	
	public void MultiplesOfEleven()
	{
		 System.out.println("Multiples of eleven are :");
		for(int iCnt = 0; iCnt <Arr.length; iCnt++)
		{
			if(11 * iCnt == Arr[iCnt])
			{
			        System.out.println(Arr[iCnt]);	
			}
		}
		
	}
	
}

