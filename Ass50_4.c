#include<stdio.h>

typedef unsigned int UINT;

UINT TOGGLEBit(int iNo)
{
    UINT iMask = 0X000000240;
    UINT Result = 0;
    Result = iNo ^ iMask;
    return Result;
}

int main()
{
    int iNo = 0,iRet = 0;
    printf("ENter the number\n");
    scanf("%d",&iNo);

    iRet = TOGGLEBit(iNo);

    printf("Updated number is %d\n",iRet);


    return 0;
}
