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

void SearchLargest(PNODE First)
{
    int iMax = 0;
    while(First != NULL)
	{
	    if(First->data > iMax)
	    {
	    	iMax = First -> data;
	    }    	
		First = First -> next;
	}
    printf("Largest element in the linked list is %d\n",iMax);

}


int main()
{
    struct node * Head = NULL;
 
    InsertFirst(&Head,102);   	   	
	InsertFirst(&Head,21);
	InsertFirst(&Head,51);
	InsertFirst(&Head,101);
	
    Display(Head);

	SearchLargest(Head);
	return 0;
}