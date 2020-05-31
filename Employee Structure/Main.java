#include<iostream>
using namespace std;
struct emp{
  char a[50];
  int b;
  int c; 
  char d[5];
  int e;
};
int main()
{
 struct emp e1; 
  cout<<"Enter name:";
  cout<<"\nEnter ID:";
  cout<<"\nEnter age:";
  cout<<"\nEnter designation:";
  cout<<"\nEnter Salary:";
  cout<<"\nEmployee Details";
    cin>>e1.a;
  cin>>e1.b;
  cin>>e1.c;
    cin>>e1.d;
  cin>>e1.e;
  cout<<"\nName of the Employee : "<<e1.a;
  cout<<"\nID of the Employee : "<<e1.b;   
   cout<<"\nAge of the Employee : "<<e1.c;  
   cout<<"\nDesignation of the Employee : "<<e1.d;
  cout<<"\nSalary of the Employee : "<<e1.e;  
 
}