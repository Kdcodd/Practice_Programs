import java.util.*;

class Ass32_1
{
   public static void main(String a[])
   {
       DifSumEvenOdd obj = new DifSumEvenOdd(5);        	
   	obj.Accept();
   	int iRetEven = obj.SumEven();
   	int iRetOdd = obj.SumOdd();
   	int iRet = iRetEven - iRetOdd;
   	System.out.println("Difference is :"+iRet);
   }	

}

class DifSumEvenOdd
{
    public int iLength;
	public int Arr[];
	public DifSumEvenOdd(int iSize)
	{
	     iLength = iSize;
	     Arr = new int[iLength];  	
	}
	Scanner sobj = new Scanner(System.in);
	public void Accept()
	{
		System.out.println("Please enter the elements in array :");
		for(int iCnt = 0; iCnt <Arr.length; iCnt++)
		{
		    Arr[iCnt] = sobj.nextInt();	
		}
	}
	public int SumEven()
	{
		int iSumEven = 0;
		for(int iCnt = 0; iCnt<Arr.length; iCnt++)
		{
		    if(Arr[iCnt] % 2 == 0)
		    {
		    	iSumEven = iSumEven + Arr[iCnt];
		    }	
		}
	   return iSumEven;
	}
	public int SumOdd()
	{
		int iSumOdd = 0;
		for(int iCnt = 0; iCnt<Arr.length; iCnt++)
		{
		    if(Arr[iCnt] % 2 != 0)
		    {
		    	iSumOdd = iSumOdd + Arr[iCnt];
		    }	
		}
	   return iSumOdd;
	}
	
}