#include<iostream>
using namespace std;

template<class T>
class GenericX
{
    public :
    T iValue;
    int Len;

    GenericX(T Value1,int Len1);

    void PrintValue();
};

template<class T>
GenericX <T>:: GenericX(T Value1,int Len1)
{
    iValue = Value1;
    Len = Len1;
}

template<class T>
void GenericX <T>:: PrintValue()
{
    for(int i = 1; i <= Len; i++)
    {
        cout<<iValue<<"\t";
    }
   cout<<"\n";

}

int main()
{
    GenericX<int> obj(4,5);
    obj.PrintValue();

    GenericX <float>obj1(4.0f,5);
    obj1.PrintValue();

    GenericX <double>obj2(4.243,5);
    obj2.PrintValue();

    GenericX <char>obj3('M',5);
    obj3.PrintValue();

    return 0;
}