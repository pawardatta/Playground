#include<iostream>
using namespace std;
struct stud{
  int a;
  int b[5];
  char c[50];
};
int main()
{
  int p,q,r=1,s=1;
  struct stud s1;
  cin>>s1.a;
  for(int i=0;i<4;i++)
  {
    cin>>s1.b[i];
  }
  if(s1.a==1)
  {
    for(int i=0;i<4;i++)
    {
      if(i%2==0)
      {
        p=s1.b[i]+p;
      }
      else
      {
        q=q+s1.b[i];
      }
    }cout<<p<<"+"<<q<<"i";
  }
  if(s1.a==2)
  {p=0;
   q=0;
    for(int i=0;i<4;i++)
    {
      if(i%2==0)
      {
        p=s1.b[i]-p;
      }
      else
      {
        q=-q-s1.b[i];
      }
    }cout<<-p<<"+"<<q<<"i";
  }
  if(s1.a==3)
  {p=1;
   q=1;
    for(int i=0;i<4;i++)
    {
      if(i%2==0)
      {
        p=s1.b[i]*p;
      }
      else
      {
        q=-q*s1.b[i];
      }
      if(i==0||i==3)
      {
        r=r*s1.b[i];
      }
      else
      {
        s=s*s1.b[i];
      }
    }cout<<p-q<<""<<r+s<<"i";
  }
  if(s1.a>3)
  {
    cout<<"Invalid choice";
  }
}