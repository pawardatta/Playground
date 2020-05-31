#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int a=0,b,c=50;
  float d=1;
  cin>>a;
    while(c>0)
    {
  d=(d+(a/d))/2;
  --c;
    }
  b=a+(int(d)+1);
  cout<<b;
  //Type your code here.
}