import java.util.*;

class Ass34_2
{
	public static void main(String A[])
	{
	int iSize = 0;
	Scanner sobj = new Scanner(System.in);
	System.out.println("Enter the size of array :");
	iSize = sobj.nextInt();
	Numbers obj = new Numbers(iSize);
    obj.Accept();
    obj.MultiplyNumbers();
	}
}

class Numbers
{
	public int iLength;
	public int Arr[];
	
	public Numbers(int iSize)
	{
		iLength = iSize;
		Arr = new int[iSize];
	}
	
	public void Accept()
	{
		int iCnt = 0;
		Scanner sobj = new Scanner(System.in);
		System.out.println("Please enter the elements in array :");
		for(iCnt = 0; iCnt < Arr.length; iCnt++)
		{
             Arr[iCnt] = sobj.nextInt();		     	
		}
	}
	public void MultiplyNumbers()
    {
    	 int iMult = 1;
    	 for(int iCnt = 0; iCnt < Arr.length; iCnt++)
    	 {
    	 	iMult = iMult * Arr[iCnt];	 		 	
    	 }
    	System.out.println("Multiplication is :"+iMult);
    }
	
}