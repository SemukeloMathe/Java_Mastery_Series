/**
 * Write a Java program to print the area and perimeter of a circle.
 * Test Data: Radius = 7.5
 * Expected Output: Perimeter is = 47.12388980384689, Area is = 176.71458676442586
 */

public class Exercise_10 {
  public static void main(String[] args) {
    double radius = 7.5;
    // area of a circle = pi x r^2
    double areaOfCirlce = Math.PI * (radius * radius);
    // perimeter of a cicle = 2 x pi x r
    double perimeterOfCircle = 2 * Math.PI * radius;

    System.out.println("Perimeter is = " + perimeterOfCircle + "\nArea is = " + areaOfCirlce);
  }
}
