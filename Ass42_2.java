import java.util.*;

class Ass41_4
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
	    int iMin1 = obj.DisplayMinArr1();
	    System.out.println("Minimum of first Array is :"+iMin1);
	    int iMin2 = obj.DisplayMinArr2();
	    System.out.println("Minimum of second Array is :"+iMin2);
	}
}

class MyArray
{
	public int iLength1;
	public int iLength2;
	public int iLength3;
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
    	
    public int DisplayMinArr1()
    {
    	int i = 0;
    	int iMin1 = Arr1[i]; 
    	for(i = 0;  i < Arr1.length; i++)
    	{
            if(Arr1[i] < iMin1)
            {
            	iMin1 = Arr1[i];
            }   	
    	}	
    	return iMin1;
    }
    public int DisplayMinArr2()
    {
  			 int i = 0;
		   	int iMin2 = Arr2[i]; 
		   	for(i = 0;  i < Arr2.length; i++)
		   	{
		           if(Arr2[i] < iMin2)
		           {
		           	iMin2 = Arr2[i];
		           }   	
		   	}	
		   	return iMin2;   	
		
    }

}