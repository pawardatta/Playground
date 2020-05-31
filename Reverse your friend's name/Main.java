#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
  char i;
  string name;
  getline(cin,name);
 // name =reverse::iterator;
  for(string::reverse_iterator i=name.rbegin();i<name.rend();i++)
  {
    cout<<*i;
  }
//Type your code here
}