#include<iostream>
using namespace std;

class Array
{
      protected:
          int *Arr;
          int size;
 
      public:
      Array(int value = 10)
      {
            cout<<"Inside Connstructor\n";
 
           this->size = value;
           this->Arr = new int[size];
      }
 
     Array(Array &ref)
     {
          cout<<"Inside copy connstructor\n";
 
         this->size = ref.size;
         this->Arr = new int[this->size];
 
         for(int i = 0;i<size;i++)
         {
             this->Arr[i] = ref.Arr[i];
         }
      }
 
      ~Array()
      {
          cout<<"Inside Destructor\n";
 
         delete []Arr;
     }
      inline void Accept();
      inline void Display();
};
void Array::Accept()
{
       cout<<"Please enter the values\n";
 
        for(int i = 0;i<this->size;i++)
       {
           cin>>Arr[i];
       }
}
void Array::Display()
{
       cout<<"Elements are\n";
 
        for(int i = 0;i<this->size;i++)
        {
        cout<<Arr[i]<<"\t";
        }
       cout<<"\n";
}
class ArrSearch : public Array
{
     public:
         ArrSearch(int no = 10) : Array(no)
         {}
 
       int Frequency(int);
       int SearchFirst(int);
       int SearchLast(int);
       int EvenCount();
       int OddCount();
       int SumAll();
};
int ArrSearch::SearchFirst(int value)
{
       int i = 0;
 
      for(i = 0; i < size; i++)
      {
         if(Arr[i] == value)
         {
              break;
         }
     }
 
     if(i == size)
     {
          return -1;
     }
     else
     {
         return i + 1;
     }
}
int ArrSearch::Frequency(int value)
{
     int icnt = 0;
     for(int i = 0; i<size; i++)
     {
        if(Arr[i] == value)
       {
          icnt++;
       }
    }
 
   return icnt;
}
int ArrSearch::SearchLast(int value)
{
	int iCnt = 0,i = 0;
	for(i = 0; i < size; i++)
    {
    	if(Arr[i] == value)
    	{
    		iCnt = i + 1;
    	}
    }
    return iCnt;
}
int ArrSearch::EvenCount()
{
   int iCnt = 0;
	for(int i = 0; i < size; i++)
    {
    	if(Arr[i] % 2 == 0)
    	{
    		iCnt++;
    	}
    }
    return iCnt;
}
int ArrSearch::OddCount()
{
   int iCnt = 0;
	for(int i = 0; i < size; i++)
    {
    	if(Arr[i] % 2 != 0)
    	{
    		iCnt++;
    	}
    }
    return iCnt;
}
int ArrSearch::SumAll()
{
	  int iSum = 0;
	for(int i = 0; i < size; i++)
    {
    	iSum = iSum + Arr[i];
    }
    return iSum;

}
int main()
{
	 cout<<"Inside main\n";
	 ArrSearch sobj1(5);
	 sobj1.Accept();
	 sobj1.Display();
	 
	 int iret = sobj1.Frequency(11);
	 cout<<"Frequency is "<<iret<<"\n";

	 int iret1 = sobj1.SearchFirst(11);
 	cout<<"First occurance is  "<<iret1<<"\n";

 	int iret2 = sobj1.SearchLast(11);
 	cout<<"Last occurance is  "<<iret2<<"\n";
 
      int iret3 = sobj1.EvenCount();
 	cout<<"Even count is  "<<iret3<<"\n";
 	
 	int iret4 = sobj1.OddCount();
 	cout<<"Odd count is  "<<iret4<<"\n";	
 			
    int iret5 = sobj1.SumAll();
 	cout<<"Sum is  "<<iret5<<"\n"; 
		
		
		
		
		return 0;
}  