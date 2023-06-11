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

int Small(int iNo)
{
    int iDigit = 0;
    int iSmall = iNo;	
    while(iNo != 0)
   {
        iDigit = iNo % 10;
         if(iDigit < iSmall)
         {
             iSmall = iDigit;	
         }     
         iNo = iNo /10;
   }
   return iSmall;
}

void SmallestDigit(PNODE First)
{
	while(First != NULL)
	{
	    int iRet = Small(First -> data);
	    printf("smallest digit in %d is %d\n",First->data,iRet);
	    First = First -> next;    	
	}
}

int main()
{
	struct node *Head = NULL;
	
	InsertFirst(&Head,3671);
	InsertFirst(&Head,5363);
    InsertFirst(&Head,2216);
    InsertFirst(&Head,3412);    
    
    Display(Head);
    
    SmallestDigit(Head);
                 
    return 0;	
}
