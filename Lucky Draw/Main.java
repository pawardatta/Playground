#include<iostream>
using namespace std;
int main()
{
  int a,i=2;
  bool prime=1;
  cin>>a;
  if(a==1)
    prime=0;
for(int i=2;i<a;i++)
{
  if(a%i==0)
  {
    prime=0;
    break;
  }
}
  if(prime)
  {
    cout<<"Eligible";
  }
  else
  {
    cout<<"Not eligible";
  }
  return 0;
}