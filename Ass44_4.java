import java.util.*;

class Ass44_4
{
    public static void main(String a[])
    {
        int iSize = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter the number of elements in array");
        iSize = sobj.nextInt();
        MyArray obj = new MyArray(iSize);
        obj.Accept();
        obj.Array();
    }

}

class MyArray
{
    public int iLength;
    public int Arr[];

    public MyArray(int iSize)
    {
        iLength = iSize;
        Arr = new int[iLength];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter the elements in array");
        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
        System.out.println(" ");
    }
 
    public void Array()
    {
        for(int i = 0; i < Arr.length; i++)
        {
            DisplayPattern(Arr[i]);
            
        }
       
    }

    public void DisplayPattern(int iNo)
    {
        if(iNo % 2 == 0)
        {
            for(int i = 0; i < iNo; i++)
            {
                System.out.print("*\t");
            }
             System.out.println("");
        } 
        
    }


}