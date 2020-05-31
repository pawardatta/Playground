#include <cstring>
#include<string.h>
#include <iostream>
using namespace std;
int main()
{
  char a[100];
  cin.getline(a,100);
  if(strlen(a)>=50)
  {
    cout<<"Caption not eligible for the contest";
  }
  else
  {
    cout<<"Caption eligible for the contest";
  }
   //Your code goes here
   
}