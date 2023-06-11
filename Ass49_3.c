#include<stdio.h>
#include<stdbool.h>


typedef unsigned int UINT;
bool CheckBit(UINT iNo)
{
    bool bFlag = false;
    UINT iMask1 = 0X00000040;
    UINT iMask2 = 0X00004000; 
    UINT iMask3 = 0X00100000;
    UINT iMask4 = 0X08000000;
    UINT Result = 0;
    UINT iMask = 0;
    iMask = iMask1 | iMask2 | iMask3 | iMask4;
    Result = iNo & iMask;
    
    if(Result == iMask)
    {
        
        bFlag = true;
    }
    else
    {
       
       bFlag = false;
    }
    return bFlag;
}


int main()
{
    int iNo = 0;
    printf("Please enter the number :\n");
    scanf("%d",&iNo);
    
    bool bRet = false;
     
    bRet = CheckBit(iNo);
    if(bRet == true)
    {
        printf("Bit position 7,15,21,28 are ON\n");      
    }
    else
    {
        printf("Bit position 7,15,21,28 are OFF\n");      
    }
   
    return 0;
}