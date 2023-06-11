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


int ReverseEach(int iNo)
{
    int iRev = 0,iDigit = 0;	
	
	while(iNo != 0)
	{
		iDigit = iNo % 10;
		iRev = iRev * 10+iDigit;
		iNo = iNo / 10;
	}
   return iRev;	
}

void ReverseSLL(PNODE First)
{
	while(First != NULL)
	{
        int iRet = ReverseEach(First -> data);       	     
	    if(iRet == First -> data)
	    {
	         printf("%d is pallindrome number\n",iRet);	
	    }                         
	    First = First -> next;                                 
	}
}

int main()
{
	struct node *Head = NULL;
	
	InsertFirst(&Head,101);
	InsertFirst(&Head,51);
    InsertFirst(&Head,21);
    InsertFirst(&Head,11);    
    
    Display(Head);
    
    ReverseSLL(Head);    
        
    return 0;	
}
