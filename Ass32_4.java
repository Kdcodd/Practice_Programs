import java.util.*;

class Ass32_4
{
	public static void main(String a[])
	{
	   Display obj = new Display(5);
	   obj.Accept();
	   obj.DivByTwoAndFive(); 	
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
	
	public void DivByTwoAndFive()
	{
		 System.out.println("Numbers which are divisible by two and five are :");
		for(int iCnt = 0; iCnt <Arr.length; iCnt++)
		{
			if(Arr[iCnt ]%2 == 0 && Arr[iCnt]%5 == 0)
			{
			        System.out.println(Arr[iCnt]);	
			}
		}
		
	}
	
}

