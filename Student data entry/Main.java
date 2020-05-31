#include <iostream>
#include<string.h>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
  struct student s1;
  cin.get(s1.name,50);
  cin>>s1.roll;
  cin>>s1.marks;
  cout<<"\nStudent Details";
  cout<<"\nName: "<<s1.name;
  cout<<"\nRoll: "<<s1.roll;
  cout<<"\nMarks: "<<s1.marks;
  
   //Your code goes here
}