import java.util.*;

class Ass44_2
{
	public static void main(String s[])
    {
    	int iSize = 0,iRet = 0;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Please enter size of array of character :");
        iSize = sobj.nextInt();
       
        MyArray obj = new MyArray(iSize);
        obj.Accept();
        obj.Display();
        iRet = obj.CountVowels();
        System.out.println("Number of vowels in array of character is :"+iRet);
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
   }
   
   public int CountVowels()
   {
   	int iCnt = 0;
   	for(int i = 0; i < Arr.length; i++)
   	{
   		if(Arr[i] == 'a' || Arr[i] == 'e' || Arr[i] == 'i' || Arr[i] == 'o' || Arr[i] == 'u')
   		{
   			iCnt++;
   		}	
   	}
   	System.out.println(" ");
   		return iCnt;
   	
   }

 
}