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

void SecondLarge(PNODE	First)
{
	int i = 0, iTemp = 0,iMax = First -> data;
	while(First != NULL)
	{
		iTemp = First -> data;
		if(iTemp > iMax)
		{
		      iMax = iTemp;	
		}
	    First = First -> next;
	}
    printf("%d",iMax);	
}

void AdditionDigit(PNODE First)
{
	while(First != NULL)
	{
	     int iSum = 0;
	     int iDigit = 0;	
	     int iNo = First -> data;
	     while(iNo != 0)
	     {
	         iDigit = iNo % 10;
	         iSum = iSum + iDigit;
	         iNo = iNo / 10;	
	     }
	     printf("Additon of all digits in  %d is %d\n ",First->data,iSum);
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
    
    AdditionDigit(Head);    
        
    return 0;	
}
