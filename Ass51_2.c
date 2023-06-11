#include<stdio.h>

typedef unsigned int UINT;

int OFFBit(int No,int Pos)
{
    UINT iMask = 0X00000001;
    UINT Result = 0;
    iMask = iMask << (Pos-1);
    iMask = ~iMask;
    Result = No & iMask;
    return Result;
}

int main()
{
    int iNo = 0,iPos = 0,iRet = 0;
    printf("Enter the number\n");
    scanf("%d",&iNo);

    printf("Please enter position of bit to OFF\n");
    scanf("%d",&iPos);

    iRet = OFFBit(iNo,iPos);

    printf("Updated number is %d\n",iRet);


    return 0;
}
