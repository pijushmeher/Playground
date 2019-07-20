#include<stdio.h>

int main()
{
 int first, second, third, fourth;
   
    scanf("%d %d %d %d", &first, &second, &third, &fourth);
   if((first<second) && (first<third) && (first<fourth))
        printf("%d",first);
    else if((second<third) && (second<fourth))
        printf("%d",second);
    else if((third<fourth))
        printf("%d",third);
    else
        printf("%d",fourth);
  return 0;


}