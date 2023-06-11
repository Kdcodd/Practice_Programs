import java.util.*;

class Ass43_4
{
	public static void main(String a[])
	{
		int iNo = 0;
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the number of student");
		iNo = sobj.nextInt();
		Student obj = new Student(iNo);
        obj.AcceptMarks();		
	}
}	
	
class Student
{
	public int iNo;
	public int Arr[];
	
	public Student(int iSize)
	{
		iNo = iSize;
	    Arr = new int[iNo];
	}
	
	public void AcceptMarks()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the marks of student");
		for(int i = 0; i<Arr.length; i++)
		{
			Arr[i] = sobj.nextInt();
		}
		
		for(int i = 0; i < Arr.length; i++)
		{
			if(Arr[i] < 35)
		    {
		    	System.out.println("Fail");
		    }
			else if(Arr[i] > 35 && Arr[i] < 50)
			{
				System.out.println("Pass");
			}
			else if(Arr[i] > 50 && Arr[i] < 60)
			{
				System.out.println("Second class");	
			}
			else if(Arr[i] > 60 && Arr[i] < 70)
			{
				System.out.println("First Class");	
			}
			else
			{
				System.out.println("First class with distinction");	
			}
		}
 }
}



