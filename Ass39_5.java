import java.util.Scanner;

class Ass39_5
{
	public static void main(String a[])
	{
		String str;
		Scanner sobj = new Scanner(System.in);
		System.out.println("Please enter the string :");
		str = sobj.nextLine();
		Pattern obj = new Pattern();
		obj.Pattern(str);
	}
}

class Pattern
{
	public void Pattern(String str)
	{
		for(int i = 0;  i < str.length(); i++)
		{
			for(int j = 0; j < str.length(); j++)
			{
				if(j <= i)
				{
				    System.out.print(str.charAt(j)+"\t");	
				}
				else
				{
				    System.out.print("#\t");	
				}
				
			}
			System.out.println(" ");
		}
		
		for(int i = str.length()-1;  i > 0; i--)
		{
			for(int j = 0; j < str.length(); j++)
			{
				if(j < i)
				{
					System.out.print(str.charAt(j)+"\t");
				}
				else
				{
				   System.out.print("#\t");	
				}
				
			}
			System.out.println(" ");
			
		}
	}
	
}