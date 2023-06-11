#include<iostream>
using namespace std;


template<class T>
class GenericX
{
	public :
	     T No1;
	     T No2;
	     GenericX(T Value1, T Value2);
	     
         T Multiply();   	
	
};

template<class T>
GenericX <T>:: GenericX(T Value1, T Value2)
{
     	No1 = Value1;
     	No2 = Value2;
}	     

template<class T>
T GenericX <T> :: Multiply()
{
       T Mult ;
       Mult = No1 * No2;
       return Mult;       	
 }

int main()
{
	GenericX <int> obj(10,10);
	int iRet = obj.Multiply();
	cout<<"Multiplication is :"<<iRet<<endl;
	
	GenericX <float> obj1(1.5f,1.5f);
	float iRet1 = obj1.Multiply();
	cout<<"Multiplication is :"<<iRet1<<endl;
	
	GenericX <double> obj2(1.512,1.512);
	float iRet2 = obj2.Multiply();
	cout<<"Multiplication is :"<<iRet2<<endl;
	
	return 0;
}