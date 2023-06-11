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

int Add(PNODE First)
{
    int iSum = 0;
    while(First != NULL)
	{
        iSum = iSum + First->data;	  
	    First = First -> next;
	}
	 return iSum;
}


int main()
{
    int iRet =0;
    struct node * Head = NULL;
 
    InsertFirst(&Head,101);   	   	
	InsertFirst(&Head,51);
	InsertFirst(&Head,21);
	InsertFirst(&Head,11);
	
    Display(Head);
	
	iRet = Add(Head);
    printf("Addition of all elements in linked list is %d\n",iRet);
	
	return 0;
}