/**
 * Write a Java program to compute the specified expressions and print the output.
 * Test Data: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 * Expected Output: 2.138888888888889
 */

public class Exercise_8 {
  public static void main(String[] args) {
    double num1 = 25.5 * 3.5 - 3.5 * 3.5;
    double num2 = 40.5 - 4.5;

    double result = num1 / num2;
    System.out.println(result);
  }
}
