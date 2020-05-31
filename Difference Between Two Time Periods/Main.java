#include <iostream>
using namespace std;
struct time
{
  int s;
  int m;
  int h;
};
void timed(struct time,struct time);
int main()
{
  struct time t1,t2,diff;
  cin>>t1.h>>t1.m>>t1.s;
  cin>>t2.h>>t2.m>>t2.s;
  timed(t1,t2);
 return 0;
}
void timed(struct time t1,struct time t2)
{
  int diffs,diffm,diffh;
  if(t2.s>t1.s)
  {
    --t1.m;
    t1.s+=60;
  }
  diffs=t1.s-t2.s;
  if(t2.m>t1.m)
  {
    --t1.h;
        t1.m+=60;
    }
  diffm=t1.m-t2.m;
  diffh=t1.h-t2.h;
  cout<<diffh<<":"<<diffm<<":"<<diffs;
 // return 0;
}
