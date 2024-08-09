public class Literals {

  public static void main(String[] args) {
    // literals
    
    // base10
    int num = 585;
    System.out.println(num);
    
    // hexadecimal format
    int num1 = 0xF6;
    System.out.println(num1);
    
    // binary format
    int num2 = 0b0101;
    System.out.println(num2);
    
    // separating for readability
    int num3 = 1_00_00_000_0;
    System.out.println(num3);

    // float
    double num5 = 56;
    System.out.println(num5);

    // scientific
    double num6 = 12e10;
    System.out.println(num6);
    
    // chars
    char c = 'a';
    System.out.println(c);
    
    // character can also be treated as int
    char b = 'a';
    b++;
    System.out.println(b);
    char z = 'z';
    z++;
    System.out.println(z);
  }
  
}
