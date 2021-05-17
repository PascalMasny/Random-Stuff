#include <stdio.h>
#include <math.h>
#define PI 3.141592654

int main(void) {


  printf("Wurfparabel C by Pascal\n");
  printf("\n");

  //
  float t = 10;
  float s = 0.1;
  float g = -4.9;
  int n = 0;

  //
  float b;
  printf("Beta: ");
  scanf("%f", &b); 

  float v;
  printf("V: ");
  scanf("%f", &v);

  float z;
  printf("Y: ");
  scanf("%f", &z);  

  printf("\n");


  double arg1 = b, result1;
  double arg2 = b, result2;

  // Converting to radian
  b = (b * PI) / 180;
  result1 = cos(b);
  result2 = sin(b);

  printf("%.2lf\n", result1);
  printf("%.2lf\n", result2);

  printf("\n");

  


  //x
  while (n <= 10)
  {

    float x = v * result1 * n;

    printf("%.2lf\n", x);
    ++n;

  }

  //reset
  printf("\n");

  int m = 0;

  //Y
  while (m <= 10)
  {

    float y = g + v * result2 * m + z;

    printf("%.2lf\n", y);
    ++m;

  }



}