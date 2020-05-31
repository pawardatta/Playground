#include<iostream>
using namespace std;
int main()
{
  int m,n,r,c,s=0,ri=0,ci=0;
  cin>>m>>n;
  int ra[m];
  int i,j;
  int mt[m][n];
  for(i=0;i<m;i++)
  {
     for(j=0;j<n;j++)
       cin>>mt[i][j];
  }
 int z=0;
  cout<<"Sum of rows is ";
  for(r=0;r<m;r++)
  {
    s=0;   
    for(c=0;c<n;c++)
    {
     s+=mt[r][c];
    }
    cout<<s<<" ";
    ra[z++]=s;
  }
  int tr=ra[0];
  for(i=1;i<m;i++)
  {
    if(tr<ra[i])
    {
      tr=ra[i];
      ri=i;
    }
  }
cout<<"\nRow "<<ri+1<<" has maximum sum"; 
  cout<<"\nSum of columns is ";
  s=0;
   int y=0;
   int ca[n];
  for(i=0;i<m;i++)
  {
    s=0;
    for(j=0;j<m;j++)
    {
      s+=mt[j][i];
    }
    cout<<s<<" ";
    
     ca[y++]=s;
   }
  int tc=ca[0];
  for(i=1;i<n;i++)
  {
    if(tc<ca[i])
    {
     tc=ca[i];
     ci=i;
    }
  }
cout<<"\nColumn "<<ci+1<<" has maximum sum";
  return 0;
}
