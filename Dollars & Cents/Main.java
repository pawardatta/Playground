#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d;
  cin>>a>>b>>c>>d;
  int p=a+c;
  int q=b+d;
  while(q>100)
  {
    q=q-100;
    p=p+1;
    break;
  }
  cout<<p<<"\n"<<q;
  //Type your code here.
}