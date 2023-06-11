import java.util.*;

class Ass41_1
{
	public static void main(String a[])
	{ 
	Scanner sobj = new Scanner(System.in);
	
	MyArray obj1 = new MyArray(5,4);
	obj1.Accept();
	obj1.Display();
	}
}

class MyArray
{
	public int iSize1;
	public int iSize2;
	public int Arr1[];
	public int Arr2[];
	
	public MyArray(int iLength1,int iLength2)
	{
		iSize1 = iLength1;
		iSize2 = iLength2;
	    Arr1 = new int[iSize1];
	    Arr2 = new int[iSize2];
	}
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Please enter elements in first array");
		for(int i = 0; i <Arr1.length; i++)
		{
			Arr1[i] = sobj.nextInt();
		}
		System.out.println("Please enter elements in second array");
		for(int i = 0; i <Arr2.length; i++)
		{
			Arr2[i] = sobj.nextInt();
		}
	}
	public void Display()
	{
		System.out.println("Elements in first array");
		for(int i = 0; i <Arr1.length; i++)
		{
			System.out.println(Arr1[i]+"\t");
		}
		System.out.println("Elements in second array");
		for(int i = 0; i <Arr2.length; i++)
		{
			System.out.println(Arr2[i]+"\t");
		}
	}
}