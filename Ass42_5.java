import java.util.*;

class Ass42_5
{
	public static void main(String a[])
	{
		int iSize1 = 0,iSize2 = 0,iSize3 = 0;
		Scanner sobj = new Scanner(System.in);
		System.out.println("Please enter the size of first array");
		iSize1 = sobj.nextInt();
		System.out.println("Please enter the size of second array");
		iSize2 = sobj.nextInt();
        iSize3 = iSize1 + iSize2;	
        MyArray obj = new MyArray(iSize1,iSize2,iSize3);	
	    obj.Accept();
	    boolean bFlag = true;
	    
	    bFlag = obj.CheckPallindrome();
	    if(bFlag == true)
	    {
	    	System.out.println("True");
	    }
	    else
	    {
	    	System.out.println("false");
	    }
	
	}
}

class MyArray
{
	public int iLength1;
	public int iLength2;
	public int iLength3;
	public int Arr1[];
	public int Arr2[];
	public int Arr3[];
	MyArray(int iSize1,int iSize2,int iSize3)
	{
		iLength1 = iSize1;
		iLength2 = iSize2;
		iLength3 = iSize3;
		Arr1 = new int[iLength1];
	    Arr2 = new int[iLength2];
	    Arr3 = new int[iLength3];
	}
		
	public void Accept()
	{
	  Scanner sobj = new Scanner(System.in);
	  System.out.println("Please enter the elements in  first array");
		for(int i = 0; i< Arr1.length; i++)
		{
			Arr1[i] = sobj.nextInt();
		}		
	    System.out.println("Please enter the elements in  second array");
		for(int i = 0; i < Arr2.length; i++)
		{
			Arr2[i] = sobj.nextInt();
		}
		int iCnt = 0;
		for(int i = 0;  i < Arr3.length; i++)
    	{
    		
    		if(i < Arr1.length)
    		{
    			Arr3[i] = Arr1[i]; 
    		}
    		else
    		{
    			Arr3[i] = Arr2[iCnt];
    			iCnt++;
    		}
    	}
	}
    	
    public boolean CheckPallindrome()
    {
        boolean bRet = true;
        for(int i = 0; i < Arr3.length; i++)
        {
        	 bRet = CheckNumbers(Arr3[i]);
            if(bRet == false)
            {
            	break;
            }
         }
        if(bRet == true)   
        {
        	int iStart = 0;
        	int iEnd = Arr3.length-1;
        	while(iStart < iEnd)
        	{
        	     if(Arr3[iStart] != Arr3[iEnd])
        		{
        	         bRet = false;        	
        		}
        		iStart++;
        		iEnd--;	
            }
        }
      return bRet;
}
    
    public boolean CheckNumbers(int No)
    {
    	int iDigit = 0;
    	int iTemp = No;
    	int iRev = 0;
    	while(No != 0)
        {
        	iDigit = No % 10;
        	iRev = iRev * 10 + iDigit;
        	No = No / 10;
        }
        if(iTemp == iRev)
        {
        	return true;
        }
        else
        {
        	return false;

        }
    
    
    }
    
}