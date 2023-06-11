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

int AddEvenEle(PNODE First)
{
     int iSum = 0,iTemp = 0;	
	while(First != NULL)
     {
        iTemp = First->data;    	
     	if(iTemp % 2 == 0)
     	{
     	    iSum = iSum + iTemp;	
     	}
         First = First -> next;
     
     }
	return iSum;
}









int main()
{
	int iRet = 0;
	struct node *Head = NULL;
	
	InsertFirst(&Head,2);
	InsertFirst(&Head,4);
    InsertFirst(&Head,6);
    InsertFirst(&Head,8);    
    
    Display(Head);
   iRet = AddEvenEle(Head);   
    printf("Addition of all even elements in linked list is : %d\n",iRet);
    
    return 0;	
}
