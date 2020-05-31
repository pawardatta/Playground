#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  int p;
  char a[50],b[50];
  cin>>a>>b;
  p=strcmp(a,b);
  //cout<<p;
  if(p==0)
  {
    cout<<"It is correct";
  }
  else
  {
    cout<<"It is wrong";
  }
}
  //Type your code here.