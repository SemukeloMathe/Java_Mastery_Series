public class Conditionals {
  public static void main(String[] args) {
    int x = 5;
    int y = 6;
    int z = 9;

    if (x > 10 && x <= 20) {
      System.out.println("Hello");
    } else {
      System.out.println("Bye");
    }

    if (x < y)
      System.out.println(x);
    else
      System.out.println(y);

    // more conditions
    if (x > y && x > z) {
      System.out.println(x);
    } else if (y > z) {
      System.out.println(y);
    } else {
      System.out.println(z);
    }
  }
}
