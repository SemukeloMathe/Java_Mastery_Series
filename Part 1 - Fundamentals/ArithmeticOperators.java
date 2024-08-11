class ArithmeticOperators {
  public static void main(String[] args) {
    int num1 = 7;
    int num2 = 5;

    // addition
    int result1 = num1 + num2;
    System.out.println(result1);

    // subtraction
    int result2 = num1 - num2;
    System.out.println(result2);

    // multiplication
    int result3 = num1 * num2;
    System.out.println(result3);

    // division
    int result4 = num1 / num2;
    System.out.println(result4);

    // modulo
    int result5 = num1 % num2;
    System.out.println(result5);

    // arithmetic shortcuts
    num1 += 1;
    num1 -= 1;
    num1 *= 1;
    num1 /= 1;
    num1 %= 1;
    System.out.println(num1);

    // postfix increment & decrement
    
    num1++;
    System.out.println(num1);
    num1--;
    System.out.println(num1);

    // prefix increment & decrement
    ++num1;
    System.out.println(num1);

    --num1;
    System.out.println(num1);

    int result6 = num1++;
    System.out.println(result6);    
  }
}