import java.util.*;

class Ass43_1
{
	public static void main(String a[])
	{
	    int iSize = 0;
	    Scanner sobj = new Scanner(System.in);
	    System.out.println("please eneter the size of array :");
	    iSize = sobj.nextInt();
       MyArray obj = new MyArray(iSize);		
       obj.Accept();
       System.out.println("Array before reversing");
       obj.Display();
       obj.ReverseArray();
       System.out.println("Array after reversing");
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
	
	public void ReverseArray()
	{
		int iStart = 0,iEnd = Arr.length-1, iTemp = Arr[iStart];
		while(iStart < iEnd)
		{
			iTemp = Arr[iEnd];
		    Arr[iEnd] = Arr[iStart];
		    Arr[iStart] = iTemp;
		    iStart++;
		    iEnd--;
		}
		
	}
	
	public void Display()
	{
		for(int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
            System.out.print(Arr[iCnt] + "\t");			
		}
	  System.out.println("");	
	}
	
  
	
}