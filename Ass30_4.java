import java.util.*;

class Ass30_4
{
   public static void main(String a[])	
   {
   	Scanner sobj = new Scanner(System.in);
   	System.out.println("Please enter the string");
   	String str = sobj.nextLine();
   	CheckVowels bobj = new CheckVowels();
   	boolean bRet = bobj.Vowels(str);
       if(bRet == true)
       {
           System.out.println("String contains vowels");	
       }
       else
       {
          System.out.println("String does not have vowels");	
       }
   }
}

class CheckVowels
{
	int iCnt = 0, i = 0;
	boolean bRet = false;
	boolean Vowels(String s)
	{
		for(iCnt = 0; iCnt < s.length(); iCnt++)
		{
			if((s.charAt(iCnt) == 'a') || (s.charAt(iCnt) == 'e') || (s.charAt(iCnt) == 'i') ||(s.charAt(iCnt) == 'o') || (s.charAt(iCnt) == 'u' ))
			{
                 bRet = true;
                 break;				
			}
		}
		return bRet;
	}
}