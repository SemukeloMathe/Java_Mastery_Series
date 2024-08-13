
import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 */

public class Exercise_11 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    double num1 = in.nextDouble();

    System.out.print("Enter the second number: ");
    double num2 = in.nextDouble();
    
    System.out.print("Enter the third number: ");
    double num3 = in.nextDouble();

    double average = (num1 + num2 + num3) / 3;
    System.out.println("Average: " + average);
  }
}
