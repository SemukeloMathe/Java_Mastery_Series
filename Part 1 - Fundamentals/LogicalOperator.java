public class LogicalOperator {
  public static void main(String[] args) {
    int x = 4, y = 7;
    int a = 3, b = 5;
    boolean result;

    // AND (&&)
    result = x < y && a < b;
    System.out.println(result);

    // OR (||)
    result = x < y || a < b;
    System.out.println(result);

    // NOT (!)
    boolean t = x < y;
    result = !t;
    System.out.println(result);
  }
}
