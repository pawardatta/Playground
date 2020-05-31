#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char a[200];
  cin>>a;
  int b=strlen(a);
  for(int i=0;i<b;i++)
  {
    if(a[i]>='a'&&a[i]<='z'||a[i]>='A'&&a[i]<='Z')
    {
      cout<<a[i];
    }
      
  }
}