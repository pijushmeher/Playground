#include<stdio.h>
int main()
{
  int f,t,i,s;
  scanf("%d", &i);
  f=i/100;
  t=i%10;
  s=f+t;
  printf("%d",s);
  return 0;
}