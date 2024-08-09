public class TypeCastingAndConversion {
  
  public static void main(String[] args) {
    byte num2 = 127;
    int num1 = 257;
    
    // casting
    num2 = (byte) num1;
    float f = 5.6f;
    int x = (int) f;
    System.out.println(x);

    int a = 12;
    byte k = (byte) a;
    System.out.println(k);

    float c = 5.6f;
    int g = (int) c;
    System.out.println(g);

    // conversion
    num1 = num2;
    System.out.println(num2);

    // type promotion
    byte l = 10;
    byte m = 30;

    int result = l * m;
    System.out.println(result);
  }

}
