import java.util.*;

class Ass34_2
{
	public static void main(String A[]){
	int iSize = 0;
	Scanner sobj = new Scanner(System.in);
	System.out.println("Enter the size of array :");
	iSize = sobj.nextInt();
	Numbers obj = new Numbers(iSize);
    obj.Accept();
    obj.NumInRange();
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
	public void NumInRange()
    {
    	 int iStart = 0,iEnd = 0;
    	 Scanner sobj = new Scanner(System.in);
    	 System.out.println("Enter starting range");
    	 iStart = sobj.nextInt();
    	 System.out.println("Enter end  range");
    	 iEnd = sobj.nextInt();
    	 System.out.println("Numbers between the range are :");
    	 for(int iCnt = 0; iCnt < Arr.length; iCnt++)
    	 {
    	 	if(Arr[iCnt] > iStart && Arr[iCnt] < iEnd)
    	 	{
    	 		System.out.println(Arr[iCnt]);
    	 	}
    	 	
    	 }
    	
    }
	
}