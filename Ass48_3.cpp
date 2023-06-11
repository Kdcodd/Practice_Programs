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

     T FirstOccr();

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
T GenericX <T>:: FirstOccr()
{
	T iFr;
	int Count = 0, i = 0;
	cout<<"Please enter to check first occurance\n";
	cin>>iFr;
	for( i = 0; i < iSize; i++)
	{
		if(Arr[i] == iFr)
		{
			Count =  i + 1;
			break;
		}
	}
	if(Count == 0)
	{
		cout<<"Number not found\n";
		return -1;
	}
	else
	{
     	return Count;
	}
}

int main()
{
	int iRet = 0;
	GenericX<int> obj(6);
	obj.Accept();
	iRet = obj.FirstOccr();
    cout<<"First occurance in array of integer is :"<<iRet<<"\n";
	
	int iRet1 = 0;
	GenericX <float>obj1(6);
	obj1.Accept();
	iRet1 = obj1.FirstOccr();
    cout<<"First occurance in array of float  number is :"<<iRet1<<"\n";
	
	
	int iRet2 = 0;
	GenericX <double>obj2(6);
	obj2.Accept();
	iRet2 = obj2.FirstOccr();
    cout<<"First occurance in array of double number is :"<<iRet2<<"\n";
	
	int iRet3 = 0;
	GenericX <char>obj3(6);
	obj3.Accept();
	iRet3 = obj3.FirstOccr();
    cout<<"First occurance in array of float  number is :"<<iRet3<<"\n";
	
	
	return 0;
}