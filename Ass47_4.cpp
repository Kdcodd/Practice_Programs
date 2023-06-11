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

    T Maximum();
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
T GenericX <T>:: Maximum()
{
    int i = 0;
    T iMax = Arr[i];
   for(i = 0; i < iSize; i++)
   {
      if(Arr[i] > iMax)
      {
        iMax = Arr[i];        
      }

   }
   return iMax;
}



int main()
{
    int iRet = 0;
    GenericX <int> obj(3);
    obj.Accept();
    iRet = obj.Maximum();
    cout<<"Maximum number integer from given numbers is :"<<iRet<<"\n";

    int iRet1 = 0;
    GenericX <float> obj1(3);
    obj1.Accept();
    iRet1 = obj1.Maximum();
    cout<<"Maximum number float from given numbers is :"<<iRet1<<"\n";

    int iRet2 = 0;
    GenericX <double> obj2(3);
    obj2.Accept();
    iRet2 = obj2.Maximum();
    cout<<"Maximum number double from given numbers is :"<<iRet2<<"\n";

    return 0;
}