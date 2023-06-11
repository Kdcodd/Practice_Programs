import java.util.*;

class Ass42_1
{
	public static void main(String a[])
	{
		int iSize1 = 0,iSize2 = 0;
		Scanner sobj = new Scanner(System.in);
		System.out.println("Please enter the size of first array");
		iSize1 = sobj.nextInt();
		System.out.println("Please enter the size of second array");
		iSize2 = sobj.nextInt();
	
       MyArray obj = new MyArray(iSize1,iSize2);	
	   obj.Accept();
        int iRet1 = obj.SumArray1();
        int iRet2 = obj.SumArray2();
        int iRet = iRet1 - iRet2;
        System.out.println("Difference between summation of two array is :"+iRet);
	}
}

class MyArray
{
	public int iLength1;
	public int iLength2;
	public int Arr1[];
	public int Arr2[];
	
	MyArray(int iSize1,int iSize2)
	{
		iLength1 = iSize1;
		iLength2 = iSize2;
		Arr1 = new int[iLength1];
	    Arr2 = new int[iLength2];
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
	
	}
    	
    public int SumArray1()
    {
    	int iSum1 = 0;
    	for(int i = 0; i < Arr1.length; i++)
    	{
    		iSum1 = iSum1 + Arr1[i];
    	}
    	return iSum1;
    }
    
    public int SumArray2()
    {
    	int iSum2 = 0;
    	for(int i = 0; i < Arr2.length; i++)
    	{
    		iSum2 = iSum2 + Arr2[i];
    	}
    	return iSum2;
    }
}