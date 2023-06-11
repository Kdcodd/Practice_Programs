import java.util.*;

class Ass44_5
{

    public static void main(String a[])
    {
       char ch;
       int iSize = 0,iRet = 0;
        MyArray obj = new MyArray(iSize);
       Scanner sobj = new Scanner(System.in);
       System.out.println("please enter the size of array");
       iSize = sobj.nextInt();
       System.out.println("please enter the character to count occr");
       ch = sobj.next().charAt(0);
       iRet = obj.CountOccurance(ch);
       System.out.println("Occr of " + ch + " is : "+ iRet);
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

    public int CountOccurance(char ch)
    {
         int iCnt = 0;
        System.out.println("Please enter the elements in array :");
        Scanner sobj = new Scanner(System.in);
        Arr = sobj.next().toCharArray();
        String str = new String(Arr);
     
     	for(int i = 0; i < str.length(); i++)
     	{
     		if(str.charAt(i) == ch)
     		{
     			iCnt++;
     		}
     	}
         return iCnt;
     }    	
}