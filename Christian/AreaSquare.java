/*
Complete the function that calculates the area of the red square, when the length of the circular arc A is given as the input. Return the result rounded to two decimals.

Graph

Note: use the π value provided in your language (Math::PI, M_PI, math.pi, etc)

https://www.codewars.com/kata/5748838ce2fab90b86001b1a/train/java

*/

public class Geometry{
  public static double squareArea(double A){
    double area = Math.pow(2 * A / 3.1416, 2);
    return Math.rint(area * 100)/100;
  }
}
