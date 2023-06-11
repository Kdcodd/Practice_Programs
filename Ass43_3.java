import java.util.*;

class Ass43_3
{
	public static void main(String a[])
	{
	    int iSize = 0,iRet = 0;
	    Scanner sobj = new Scanner(System.in);
	    System.out.println("please eneter the size of array :");
	    iSize = sobj.nextInt();
        MyArray obj = new MyArray(iSize);		
         obj.Accept();
        obj.Display();
        iRet = obj.CountCapital();
        System.out.println("Number of capital letters is :"+iRet);
	}
}

class MyArray
{
	public int iLength;
	public char Arr[];
	
	public MyArray(int iSize)
	{
		iLength = iSize;
		Arr = new char[iLength];
	}
	
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Please enter the character elements in array :");
        Arr = sobj.next().toCharArray();
		
	}
	
	public void Display()
	{
		
		for(int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
            System.out.print(Arr[iCnt]);			
		}
	  System.out.println(" ");				
	}
	
	public int CountCapital()
	{
		int i = 0;
		for(int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			if(Arr[iCnt] >= 'A' && Arr[iCnt] <= 'Z')
		    {
		    	i++;
		    }
		
		}
		return i;
	}
}