import java.util.*;

class Ass31_1
{
      public static void main(String a[])
      {
      	String str;
      	System.out.println("Please enter the string");
      	Scanner sobj = new Scanner(System.in);
      	str = sobj.nextLine();
          SmallLetter cobj = new SmallLetter();
        int iRet = cobj.SmallCount(str); 
        System.out.println("Number of small lettes in given string is :"+iRet);               	
      }
}

class SmallLetter
{
	public int SmallCount(String s)
	{
		int iCnt = 0,i = 0;
		for(iCnt = 0; iCnt < s.length(); iCnt++)
		{
		     if(s.charAt(iCnt)>'a' && s.charAt(iCnt)<'z')
		     {
		         i++;
		     }	
		}
		return i;
	}
}