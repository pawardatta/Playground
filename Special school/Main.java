#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char a[50],b[50],c[50];
  int i,j;
  bool ispass=0;
  cin>>a>>b;
  int p=strlen(b);
 for(i=0,j=p-1;i<p,j>=0;i++,j--)
 {
  if( b[j]==a[i])
  {
    ispass=1;
  }
  else
  {
    ispass=0;
    break;
  }
 }
  if(ispass)
  {
    cout<<"It is correct";
  }
  else
  {
    cout<<"It is wrong";
  }
}