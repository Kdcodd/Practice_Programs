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

     T CountFreq();

};


template<class T>
GenericX <T>:: GenericX(int iLength)
{
	iSize = iLength;
	Arr = new T[iSize];
}

template<class T>
void GenericX<T> :: Accept()
{
	cout<<"Please enter the number in array\n";
	
    for(int i = 0; i < iSize; i++)
    {
    	cin>>Arr[i];
    }	
	cout<<"\n";
}

template<class T>
T GenericX <T>:: CountFreq()
{
	T iFreq = 0;
	int Count = 0;
	cout<<"Please enter to count frequency\n";
	cin>>iFreq;
	for(int i = 0; i < iSize; i++)
	{
		if(Arr[i] == iFreq)
		{
			Count++;
		}
	}
	return Count;
}




int main()
{
	int iRet = 0;
	GenericX <int>obj(6);
	obj.Accept();
	iRet = obj.CountFreq();
    cout<<"Frequency of entered number int array of integer is :"<<iRet<<"\n";
	
	int iRet1 = 0;
	GenericX <float>obj1(6);
	obj1.Accept();
	iRet1 = obj1.CountFreq();
    cout<<"Frequency of entered number in array of float is :"<<iRet1<<"\n";
	
	int iRet2 = 0;
	GenericX <double>obj2(6);
	obj2.Accept();
	iRet2 = obj2.CountFreq();
    cout<<"Frequency of entered number in array of double is :"<<iRet2<<"\n";
	
    int iRet3 = 0;
	GenericX <char>obj3(6);
	obj3.Accept();
	iRet3 = obj3.CountFreq();
    cout<<"Frequency of entered character in array of character is :"<<iRet3<<"\n";	
		
	return 0;
}