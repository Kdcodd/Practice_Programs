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
        int iRet = obj.CountEvenDigit(iNo);
        System.out.println("Count of even digit is :"+ iRet);    	
    }	
	
}

class Digits
{
    public int CountEvenDigit(int iNo)
    {
    	int iDigit = 0,iCnt = 0;
    	while(iNo != 0)
    	{
    		iDigit = iNo % 10;
    		if(iDigit % 2 == 0)
    		{
    			iCnt++;
    		}
    		iNo = iNo / 10;
    	}
    	return iCnt;
    }	
		
				
}