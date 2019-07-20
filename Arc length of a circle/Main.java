#include <stdio.h>
int main()
{
  float r,d,al,PI=3.14,c,de;
  scanf("%f%f",&r, &d);
  c=2*PI*r;
  de=d/360;
  al=de*c;
  printf("%.2f",al);
  return 0;
}