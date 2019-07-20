#include <stdio.h>
 
int main()
{
    int num,i;
    long int fact;
  
   
    scanf("%d",&num);
  
   
    fact=1;
    for(i=num; i>=1; i--)
        fact=fact*i;
         
    printf("%ld",fact);
      
    return 0;
}