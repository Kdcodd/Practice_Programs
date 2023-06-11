#include<stdio.h>
#include<stdbool.h>


typedef unsigned int UINT;
bool CheckBit(UINT iNo)
{
    bool bFlag = false;
    UINT Result = 0;
    UINT iMask = 0X000001C0;
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
        printf("Bit number 7,8,9 are on\n");      
    }
    else
    {
        printf("Bits number 7,8,9 are off\n");
    }
   
    return 0;
}