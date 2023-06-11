#include<iostream>
using namespace std;

template<class T>
class GenericX
{
    public:
    int iSize;
    T *Arr;

    GenericX(int iLength);

    void Accept();

    T Minimum();
};

template<class T>
GenericX <T> :: GenericX(int iLength)
{
    iSize = iLength;
    Arr = new T [iSize];

}

template<class T>
void GenericX <T>:: Accept()
{
    cout<<"Please enter the elements i array\n";
    for(int i = 0; i < iSize; i++)
    {
        cin>>Arr[i];
    }
    cout<<"\n";
}

template<class T>
T GenericX <T>:: Minimum()
{
    int i = 0;
    T iMin = Arr[i];
   for(i = 0; i < iSize; i++)
   {
      if(Arr[i] < iMin)
      {
        iMin = Arr[i];        
      }

   }
   return iMin;
}



int main()
{
    int iRet = 0;
    GenericX <int> obj(3);
    obj.Accept();
    iRet = obj.Minimum();
    cout<<"Minimum number integer from given numbers is :"<<iRet<<"\n";

    int iRet1 = 0;
    GenericX <float> obj1(3);
    obj1.Accept();
    iRet1 = obj1.Minimum();
    cout<<"Minimum number float from given numbers is :"<<iRet1<<"\n";

    int iRet2 = 0;
    GenericX <double> obj2(3);
    obj2.Accept();
    iRet2 = obj2.Minimum();
    cout<<"Minimum number double from given numbers is :"<<iRet2<<"\n";

    return 0;
}
