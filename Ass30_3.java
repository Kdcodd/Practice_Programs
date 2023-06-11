import java.util.*;

class Ass30_3
{
   public static void main(String a[])
   {
        int iFreq = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter the string");
        String str = sobj.nextLine();   	
        
        CapitalLetter cobj = new CapitalLetter();
        int iCapRet = cobj.CountCap(str);
        
        SmallLetter obj = new SmallLetter();   			   			
        int iSmallRet= obj.CountSmall(str);
   
       iFreq = iCapRet - iSmallRet;
       System.out.println("Difference of Frequency bet capital letter and sma letter is :"+ iFreq);       
   }	
	
}

class CapitalLetter
{
     int iCnt = 0,i = 0;	
	 public int CountCap(String s)
	 {
	 	for(iCnt = 0; iCnt < s.length(); iCnt++)
	 	{
	 	     if(s.charAt(iCnt) > 'A' && s.charAt(iCnt) < 'Z')
	 	     {
	 	         i++;	
	 	     }	
	 	}
	     return i;
	 }
}

class SmallLetter
{
     int iCnt = 0,i = 0;	
	 public int CountSmall(String s)
	 {
	 	for(iCnt = 0; iCnt < s.length(); iCnt++)
	 	{
	 	     if(s.charAt(iCnt) > 'a' && s.charAt(iCnt) < 'z')
	 	     {
	 	         i++;	
	 	     }	
	 	}
	     return i;
	 }	
}