/**
 * Write a Java program to swap two variables.
 */

public class Exercise_13 {
  public static void main(String[] args) {
    int a = 3;
    int b = 6;
    int c;

    c = a;
    a = b;
    b = c;

    System.out.println("a is now: " + a + " and b is now: " + b);
  }
}
