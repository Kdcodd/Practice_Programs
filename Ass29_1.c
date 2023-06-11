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

void DisplayPerfect(PNODE First)
{
	while(First != NULL)
	{
	      if(CheckPerfect(First->data) == true)
	      {
	           printf("%d",First->data);	
	      }	
	      First = First -> next;
	}
	
}

bool CheckPerfect(int iNo)
{
	int iCnt = 0,iSum = 0,iTemp = iNo;
	for(iCnt = 1; iCnt <= (iNo/2);iCnt++)
    {
        if(iNo % iCnt == 0)
        {
             iSum = iSum + iCnt;	
        }	
    
    }
    return(iSum == iTemp);
}

int main()
{
	struct node *Head = NULL;
	
	InsertFirst(&Head,101);
	InsertFirst(&Head,51);
    InsertFirst(&Head,21);
    InsertFirst(&Head,11);    
    
    Display(Head);
    
    DisplayPerfect(Head);
    
    return 0;	
}
