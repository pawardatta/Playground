#include<iostream>
using namespace std;
int main()
{
 int a,b,c=0,q,s,d,n,m,p;
  cin>>a;
  n=a;
  m=b=a*a;
  while(b!=0)
  {
    b=b/10;
    c++;
  }
  if(c%2==0)
  {
    d=q=1;
    s=0;
  while(d<=c/2)
  {
    p=m%10;
    m=m/10;
    d++;
    s=s+q*p;
  q=q*10;
  }
    if(s+m==n)
      cout<<"Kaprekar Number";
    else
      cout<<"Not a Kaprekar Number";
  }
  else
  {
   d=q=1;
    s=0;
  while(d<=c/2+1)
  {
    p=m%10;
    m=m/10;
    d++;
    s=s+q*p;
  q=q*10;
  }
    if(s+m==n)
      cout<<"Kaprekar Number";
    else
      cout<<"Not a Kaprekar Number";
  }
}
 