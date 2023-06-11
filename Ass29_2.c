#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
#pragma pack(1)

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

void DisplayPrime(PNODE First)
{
	int iCnt = 0,i=0,iTemp = 0;
	while(First != NULL)
	{
	    iTemp = First -> data;
	    for(iCnt = 0; iCnt < (iTemp) /2; iCnt++)
	    {
	        if(iTemp % iCnt == 0)
	        {
	             i++;	
	        }	
	    }
	    if(i <= 1)
	    {
	        printf("%d is prime number\n",iTemp);	
	    }     	
		First = First -> next;
		i = 0;
		iCnt = 0;
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
    
    DisplayPrime(Head);
    
    return 0;	
}
