import java.util.*;

class Ass44_1
{
	public static void main(String s[])
    {
    	int iSize = 0;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Please enter size of array of character :");
        iSize = sobj.nextInt();
       
        MyArray obj = new MyArray(iSize);
        obj.Accept();
        obj.Display();
        
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
	
	public void ChageCase()
	{
		for(int i = 0; i < Arr.length; i++)
		{
			if(Arr[i] > 'A' && Arr[i] < 'Z')
			{
				Arr[i] = Arr[i] - 24;
			}
		}
	}
	
   public void Display()
   {
   	for(int i = 0; i < Arr.length; i++)
   	{
   		System.out.print(Arr[i]+ "\t");
   	}
   }

}