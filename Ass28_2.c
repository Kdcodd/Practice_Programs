#include<stdio.h>
#include<stdlib.h>
#pragma pack(1)

struct node
{
    int data;	
	struct node * next;
};

typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node ** PPNODE;

void InsertFirst(PPNODE First,int no)
{
     PNODE newn = (PNODE)malloc(sizeof(NODE));	
	newn-> next = NULL;
	newn -> data = no;
	
	if((*First) == NULL)
	{
	    *First = newn;	
	}
	else
	{
		newn -> next = (*First);
		(*First) = newn;
	}
}

void Display(PNODE First)
{
	while(First != NULL)
	{
	     printf("| %d |->", First->data);	
		First = First -> next;
	}
    printf("NULL\n");	
}

void SearchLastOccr(PNODE First,int iNo)
{
    int iCnt = 1,i = 1;
    while(First != NULL)
	{
	    if(iNo == First -> data)
	    {
	       i = iCnt;	
	    }    	
		First = First -> next;
	    iCnt++;
	}
	 printf("Last occurance of %d is %d\n",iNo,i);
}


int main()
{
    struct node * Head = NULL;
 
    InsertFirst(&Head,101);   	   	
	InsertFirst(&Head,11);
	InsertFirst(&Head,21);
	InsertFirst(&Head,11);
	
    Display(Head);
	
	int iNo = 0;
	printf("Enter the number that you want to search\n");
	scanf("%d",&iNo);
	
	SearchLastOccr(Head,iNo);
	return 0;
}