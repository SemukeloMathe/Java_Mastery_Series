public class ForLoop {
  public static void main(String[] args) {

    for (int i = 1; i < 8; i++) {

      System.out.println("Day -> " + i);

      for (int j = 1; j <= 10; j++) {
          System.out.println("HOUR -> " + (j + 8) + "-" + (j +9));
      }

    }
  
  }
  
}
