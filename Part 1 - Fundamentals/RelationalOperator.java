public class RelationalOperator {
  public static void main(String[] args) {
    //  greater than (>)
    double x = 5.000000000001;
    int y = 5;
    boolean result = x > y;
    System.out.println("x is greater than y " + result);

    // less than (<)
    result = x < y;
    System.out.println("x is less than y " + result);

    // greater than or equal to (>=)
    result = x >= y;
    System.out.println("x is greater than or equal to y " + result);

    // less than or equal to (<=)
    result = x <= y;
    System.out.println("x is less than or equal to y " + result);

    // eqaul to (==)
    result = x == y;
    System.out.println("x is equal to y " + result);

    // not equal to (!=)
    result = x != y;
    System.out.println("x is not equal to y " + result);

  }
}
