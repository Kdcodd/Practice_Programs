import java.util.*;

class Ass31_2
{
      public static void main(String a[])
      {
      	String str;
      	System.out.println("Please enter the string");
      	Scanner sobj = new Scanner(System.in);
      	str = sobj.nextLine();
          CapitalLetter cobj = new CapitalLetter();
          int iRet = cobj.CapitalCount(str); 
        System.out.println("Number of capital letters in given string is :"+iRet);               	
      }
}

class CapitalLetter
{
	public int CapitalCount(String s)
	{
		int iCnt = 0,i = 0;
		for(iCnt = 0; iCnt < s.length(); iCnt++)
		{
		     if(s.charAt(iCnt)>'A' && s.charAt(iCnt)<'Z')
		     {
		         i++;
		     }	
		}
		return i;
	}
}