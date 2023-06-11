#include<stdio.h>
#include<stdbool.h>


typedef unsigned int UINT;
bool CheckBit(UINT iNo)
{
    bool bFlag = false;
    UINT iMask1 = 0X00000010;
    UINT iMask2 = 0X00000080; 
    UINT Result = 0;
    UINT iMask = 0;
    iMask = iMask1 | iMask2;
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
        printf("Bit number 5 and 8 is on\n");      
    }
    else
    {
        printf("Bits number 5 and 8 are off\n");
    }
   
    return 0;
}