import java.util.*;

class Ass44_2
{
	public static void main(String s[])
    {
    	int iSize = 0,iRet1 = 0,iRet2 = 0,iRet = 0;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Please enter size of array of character :");
        iSize = sobj.nextInt();
       
        MyArray obj = new MyArray(iSize);
        obj.Accept();
        obj.Display();
        iRet1 = obj.CountCapital();
        iRet2 = obj.CountSmall();
        iRet = iRet1 - iRet2;
        System.out.println("Difference between frequency of capital and small is :"+iRet);
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
    	Arr = sobj.next().toCharArray();
	}
	
	
   public void Display()
   {
   	for(int i = 0; i < Arr.length; i++)
   	{
   		System.out.print(Arr[i]+ "\t");
   	}
      System.out.println(" ");
   }
   
   public int CountCapital()
   {
   	int iCnt = 0;
   	for(int i = 0; i < Arr.length; i++)
   	{
   		if(Arr[i] >= 'A' && Arr[i] <= 'Z')
   		{
   			iCnt++;
   		}	
   	}
   		return iCnt;
   }
   public int CountSmall()
   {
   	int iCnt = 0;
   	for(int i = 0; i < Arr.length; i++)
   	{
   		if(Arr[i] >= 'a' && Arr[i] <= 'z')
   		{
   			iCnt++;
   		}	
   	}
  
   		return iCnt;
   }


 
}