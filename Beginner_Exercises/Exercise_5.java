/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
*/

public class Exercise_5 {
  public static void main(String[] args) {
    int num1 = 125;
    int num2 = 24;
    // addition
    int result_0 = num1 + num2;
    // subtraction
    int result_1 = num1 - num2;
    // multiplication
    int result_2 = num1 * num2;
    // division
    int result_3 = num1 / num2;
    // modulo
    int result_4 = num1 / num2;

    System.out.println("add -> " + result_0 + "\nsub -> " + result_1 + "\nmul -> " + result_2 + "\ndiv -> " + result_3 + "\nmod -> " + result_4);
  }
}
