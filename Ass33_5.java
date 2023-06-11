import java.util.*;

class Ass33_1
{
    public static void main(String a[])
    {
        System.out.println("Please enter the number :");
        int iNo = 0;
        Scanner sobj = new Scanner(System.in);
        iNo = sobj.nextInt();
        Digits obj = new Digits();
        int iRetEven = obj.SumEvenDigit(iNo);
        int iRetOdd = obj.SumOddDigit(iNo);
        int iRet = iRetEven - iRetOdd;
        System.out.println("difference is :"+ iRet);    	
    }	
	
}

class Digits
{
    public int SumEvenDigit(int iNo)
    {
    	int iSumEven = 0,iDigit = 0,iCnt = 0;
    	while(iNo != 0)
    	{
    		iDigit = iNo % 10;
    		if(iDigit % 2 == 0)
    		{
    	          iSumEven = iSumEven + iDigit;
    		}
    		iNo = iNo / 10;
    	}
    	return iSumEven;
    }	
	public int SumOddDigit(int iNo)
    {
    	int iSumOdd = 0, iDigit = 0,iCnt = 0;
    	while(iNo != 0)
    	{
    		iDigit = iNo % 10;
    		if(iDigit % 2 != 0)
    		{
                 iSumOdd = iSumOdd + iDigit;   			
     		}
    		iNo = iNo / 10;
    	}
    	return iSumOdd;
    }	
			
				
}