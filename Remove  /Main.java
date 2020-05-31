#include<iostream>
#include<string.h> 
using namespace std;
int main()
{
  char a[200];
  cin.get(a,200);
  int b=strlen(a);
  for(int i=0;i<b;i++)
  {
    if(a[i]=='t')
    {
      i++;
      if(a[i]=='h')
      {
        i++;
        if(a[i]=='e')
        { 
          i+=2;
          cout<<a[i];
       //   i++;
        }
        else
        {
          cout<<a[i];
          
       }
      }
      else
      {
        --i;
        cout<<a[i];
    }
    }
    else
    {
      cout<<a[i];
  }
  }
  //cout<<a;
}