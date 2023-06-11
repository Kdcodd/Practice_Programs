#include<stdio.h>
#include<stdlib.h>
#pragma pack(1)
#include<stdbool.h>

struct node
{
    int data;
    struct node *next;	
};

typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node **PPNODE;

void InsertFirst(PPNODE First,int no)
{
    PNODE newn  = (PNODE)malloc(sizeof(NODE));
    newn->next = NULL;
    newn -> data = no;
    
     if(*First == NULL) 	
     { 
          (*First) = newn;
     }
     else
     {
        newn ->next = (*First);
        
        (*First) = newn;	
     	
     }
}

void Display(PNODE First)
{
    PNODE	temp = First;
    while(temp != NULL)	
    {
    	printf("| %d |->",temp->data);
    	temp = temp -> next;
   }
    printf("NULL\n");
}

int Multiply(int iNo)
{
    int iDigit = 0;
    int iMult = 1;	
    while(iNo != 0)
   {
        iDigit = iNo % 10;
         if(iDigit == 0)
         {
            iDigit = 1;	
         }
        iMult = iMult * iDigit;  	
        iNo = iNo /10;
   
   }
   return iMult;
}


void DisplayProduct(PNODE First)
{
	while(First != NULL)
	{
	    int iRet = Multiply(First -> data);
	    printf("multiplication of %d is %d\n",First->data,iRet);
	    First = First -> next;    	
	}
	
	
}

int main()
{
	struct node *Head = NULL;
	
	InsertFirst(&Head,23);
	InsertFirst(&Head,53);
    InsertFirst(&Head,22);
    InsertFirst(&Head,34);    
    
    Display(Head);
    
   DisplayProduct(Head);
                 
    return 0;	
}
