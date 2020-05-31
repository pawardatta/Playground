#include<iostream>
void gcd(int,int,int,int);
 using namespace std;
int main()
{
  int a,b,c,d;
  cin>>a>>b>>c>>d;
  gcd(a,b,c,d);
}
void gcd(int w,int x,int y,int z)
{
  int s,p;
  if(w<x&&w<y)
  {
    s=w;
  }
  else if(x<w&&x<y)
  {
    s=x;
  }
  else
  {
    s=y;
  }
  while(s>=1)
  {
  if(w%s==0&&x%s==0&&y%s==0)
  {
    p=s;
     break;
   
  }
      s--;
  }
  if(z==p)
  {
    cout<<"Answer is correct.";
  }
  else
  {
    cout<<"Answer is wrong.";
  }
  //return 0;
}