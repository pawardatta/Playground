#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  int p=0,q=0,r=0,z=0,d=0;
  char a[200];
 cin.get(a,200);
  // getline(cin,a);
  int b=strlen(a);
 // cout<<;
  for(int i=0;i<b;i++)
  {
    if(a[i]=='a'||a[i]=='o'||a[i]=='i'||a[i]=='u'||a[i]=='e'||a[i]=='A'||a[i]=='O'||a[i]=='I'||a[i]=='U'||a[i]=='E')
    {
      p++;
    }
    else if(a[i]>='a'&&a[i]<='z'||a[i]>='A'&&a[i]<='Z')
    {
      q++;
    }
    else if(a[i]==' ')
    {
      r++;
    }
    else if(a[i]>='0'&&a[i]<='9')
    {
      z++;
    }
    else
    {
      d++;
    }
    
  }
  cout<<"Vowels:"<<p;
  cout<<"\nConsonants:"<<q;
  cout<<"\nWhite Spaces:"<<r;
  cout<<"\nDigits:"<<z;
  cout<<"\nSymbols:"<<d;
}