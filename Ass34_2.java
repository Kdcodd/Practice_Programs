import java.util.*;

class Ass34_2
{
	public static void main(String A[]){
	int iNo = 0;
	int iSize = 0;
	Scanner sobj = new Scanner(System.in);
	System.out.println("Enter the size of array :");
	iSize = sobj.nextInt();
	System.out.println("Enter the number :");
	iNo = sobj.nextInt();
	Numbers obj = new Numbers(iSize);
    obj.Accept();
    obj.FirstOccurance(iNo);
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
	public void FirstOccurance(int iNo)
    {
    	 for(int iCnt = 0; iCnt < Arr.length; iCnt++)
    	 {
    	 	if(Arr[iCnt] == iNo)
    	 	{
    	 		System.out.println("Index of first occurance is :"+iCnt);
    	 		break;
    	 	}
    	 	
    	 }
    	
    }
	
}