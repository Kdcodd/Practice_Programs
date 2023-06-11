#include<iostream>
using namespace std;

template<class T>
class GenericX
{
	public :
	int iSize;
	T *Arr;
    GenericX(int iLength);
    
    void Accept();

     void Rev();

};

template<class T>
GenericX <T>:: GenericX(int iLength)
{
	iSize = iLength;
	Arr = new T[iSize];
}

template<class T>
void GenericX <T>:: Accept()
{
	cout<<"Please enter the number in array\n";
	
    for(int i = 0; i < iSize; i++)
    {
    	cin>>Arr[i];
    }	
	cout<<"\n";
}

template<class T>
void GenericX <T>:: Rev()
{
	int iStart = 0, iEnd = iSize-1;
	T Temp;
	T *Start = Arr;
    T *End = &Arr[iEnd];
    while(Start < End)
    {
    	Temp = *Start;
        *Start = *End;
         *End = Temp;
          Start++;
          End--;
    }
    
    for(int i = 0; i < iSize; i++)
    {
    	cout<<Arr[i]<<"\t";
    }
    cout<<"\n";
}

int main()
{

	GenericX<int> obj(6);
	obj.Accept();
	obj.Rev();
	
	GenericX <float>obj1(6);
	obj1.Accept();
	obj1.Rev();
 
	GenericX <double>obj2(6);
	obj2.Accept();
	obj2.Rev();

	 GenericX <char>obj3(6);
	 obj3.Accept();
	 obj3.Rev();
	
	return 0;
}