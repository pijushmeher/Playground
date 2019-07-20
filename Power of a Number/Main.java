#include <stdio.h>
int main()
{
  int i, Number, Exponent; 
  long Power = 1;
  

  scanf(" %d", &Number);

  scanf(" %d", &Exponent);
  if(Exponent<0)
  {
    printf("Wrong input");
  }
  else
  {
    
  for(i = 1; i <= Exponent; i++)
  {
  	Power = Power * Number;
  }
  
  printf("%ld", Power);
  }
    return 0;
}