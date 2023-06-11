#include<stdio.h>

typedef unsigned int UINT;

UINT ONBit(int iNo)
{
    UINT iMask = 0X0000000F;
    UINT Result = 0;
    Result = iNo | iMask;
    return Result;
}

int main()
{
    int iNo = 0,iRet = 0;
    printf("ENter the number\n");
    scanf("%d",&iNo);

    iRet = ONBit(iNo);

    printf("Updated number is %d\n",iRet);


    return 0;
}
