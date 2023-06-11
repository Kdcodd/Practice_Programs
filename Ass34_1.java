import java.util.*;

class Ass34_1
{
	public static void main(String a[])
	{
	       int iSize = 0,iNo = 0;
	       Scanner sobj = new Scanner(System.in);
	       System.out.println("Enter the size of array :");
	       iSize = sobj.nextInt();
	       System.out.println("Please enter the number :");
	       iNo = sobj.nextInt();
           Numbers obj = new Numbers(iSize);		
	       obj.Accept();
	       boolean bRet = obj.CheckNumber(iNo);
           if(bRet == true)
           {
               System.out.println(iNo+"is in array");
               	
           }	
           else
           {
           	System.out.println(iNo+"is not in array");
           }
	}
	
}

class Numbers
{
	public int iLength;
	public int Arr[];
	
	public Numbers(int iSize)
	{
		iLength = iSize;
		Arr = new int[iLength];
	}
	
	public void Accept()
	{
		int iCnt = 0;
		Scanner sobj = new Scanner(System.in);
		System.out.println("Please enter the elments in array :");
		for(iCnt = 0; iCnt < Arr.length; iCnt++)
		{
		    Arr[iCnt] = sobj.nextInt();	
		}
		
	}
	
	public boolean CheckNumber(int iNo)
	{
		boolean bFlag = false;
		for(int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			if(Arr[iCnt] == iNo)
			{
				bFlag = true;
			}
		}
		return bFlag;
		
	}
		
			
					
	
}