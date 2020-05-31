#include<iostream>
using namespace std;
struct value{
  int a;
  float b;
  int c;
  float d;
};
int main()
{
  float p;
  int q=0;
  struct value s1;
  cin>>s1.a>>s1.b>>s1.c>>s1.d;
  p=s1.b+s1.d;
   if(p>12)
  {
   p=p-12;
   q++;
  }
   q=s1.a+s1.c+q;
cout<<q<<"'-"<<p<<"\"";
}