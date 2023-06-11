import java.util.*;

class Ass43_2
{
	public static void main(String a[])
	{
	    int iSize = 0;
	    Scanner sobj = new Scanner(System.in);
	    System.out.println("please eneter the size of array :");
	    iSize = sobj.nextInt();
       MyArray obj = new MyArray(iSize);		
       obj.Accept();
       System.out.println("Array before Addition is");
       obj.Display();
       obj.Array();
       System.out.println("Array after Addition of its digits is :");
	   obj.Display();
	
	}
}

class MyArray
{
	public int iLength;
	public int Arr[];
	
	public MyArray(int iSize)
	{
		iLength = iSize;
		Arr = new int[iLength];
	}
	
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Please enter the elements of array :");
		for(int i = 0; i<Arr.length; i++)
		{
			Arr[i] = sobj.nextInt(); 
			
		}
		
	}
	
	public void Array()
	{
		for(int i = 0;i < Arr.length; i++)
		{
			int iIndex = 0;
			iIndex = SumDigit(Arr[i]);
			Arr[i] = iIndex;
		}
	}
	
	public int SumDigit(int No)
	{
		int iDigit = 0,iSum = 0;
		while(No != 0)
	    {
	    	iDigit = No % 10;
	    	iSum = iSum + iDigit;
	    	No = No / 10;
	    }
	    return iSum;
	}	
	
	
	public void Display()
	{
		
		for(int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
            System.out.print(Arr[iCnt] + "\t");			
		}
	    System.out.println(" ");	
	}
}