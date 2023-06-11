#include<stdio.h>

typedef unsigned int UINT;

int OFFBit(int iNo)
{
    UINT iMask = 0XFFFFFFBF;
    UINT Result = 0;
    Result = iNo & iMask;
    return Result;
}

int main()
{
    int iNo = 0,iRet = 0;
    printf("ENter the number\n");
    scanf("%d",&iNo);

    iRet = OFFBit(iNo);

    printf("Updated number is %d\n",iRet);


    return 0;
}