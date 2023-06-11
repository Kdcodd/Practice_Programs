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

void SearchSmallest(PNODE First)
{
    int iMin = First -> data;
    while(First != NULL)
	{
	    if(First->data < iMin)
	    {
	    	iMin = First -> data;
	    }    	
		First = First -> next;
	}
    printf("Smallest element in the linked list is %d\n",iMin);

}


int main()
{
    struct node * Head = NULL;
 
    InsertFirst(&Head,5);   	   	
	InsertFirst(&Head,1);
	InsertFirst(&Head,0);
	InsertFirst(&Head,10);
	
    Display(Head);

	SearchSmallest(Head);
	return 0;
}