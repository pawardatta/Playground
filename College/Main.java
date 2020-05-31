#include<iostream>
using namespace std;
struct College
{ 
  char name[100];
  char city[100];
  int establishment; 
  float pass; 
};
int main()
{
  int a;
  cout<<"Enter the number of colleges";
  cin>>a;
  struct College s[a];
  for(int i=0;i<a;i++)
  {
    cout<<"\nEnter the details of college "<<i+1;
    cout<<"\nEnter name";
    cout<<"\nEnter city";
    cout<<"\nEnter year of establishment";
    cout<<"\nEnter pass percentage";
  }
  cout<<"\nDetails of colleges";
  for(int i=0;i<a;i++)
  {
    cout<<"\nCollege:"<<i+1;
    cin>>s[i].name;
    cout<<"\nName:"<<s[i].name;
    cin>>s[i].city;
    cout<<"\nCity:"<<s[i].city;
    cin>>s[i].establishment;
    cout<<"\nYear of establishment:"<<s[i].establishment;
    cin>>s[i].pass;
    cout<<"\nPass percentage:"<<s[i].pass;
  }
}