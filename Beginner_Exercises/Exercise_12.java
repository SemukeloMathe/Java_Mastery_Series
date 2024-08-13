/**
 * Write a Java program to print the area and perimeter of a rectangle.
 * Test Data: Width = 5.5 Height = 8.5
 * Expected Output: Area is 5.6 * 8.5 = 47.60, Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

public class Exercise_12 {
  public static void main(String[] args) {
    float width = 5.5f;
    float height = 8.5f;

    // area of a triangle w x l
    float area = width * height;
    // perimeter of rectangle 2(w + l)
    float perimeter = 2 * (width + height);

    System.out.println("Area is " + width + " * " + height + " = " + area);
    System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + perimeter);
  }
}
