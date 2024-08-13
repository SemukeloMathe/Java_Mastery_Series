/**
 * Write a Java program to print the results of the following operations.
 * Test Data:
 * a. -5 + 8 * 6
 * b. (55+9) % 9
 * c. 20 + -3*5 / 8
 * d. 5 + 15 / 3 * 2 - 8 % 3
 * Expected Output: a. 43, b. 1, c. 19, d. 13
 */

public class Exercise_3 {
  public static void main(String[] args) {
    int result_0 = -5 + 8 * 6;
    int result_1 = (55 + 9) % 9;
    int result_2 = 20 + -3*5 / 8;
    int result_3 = 5 + 15 / 3 * 2 - 8 % 3;

    System.out.println("a. -> " + result_0 + "\nb. -> " + result_1 + "\nc. -> " + result_2 +  "\nd. -> " + result_3);
  }
}
