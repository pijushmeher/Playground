#include<stdio.h>
int main()
{
  int d;
  float PI=3.14,a,r;
  scanf("%d",&d);
  r=(float)d/2;
  a=PI*r*r;
  printf("%0.2f",a);
  return 0;
}