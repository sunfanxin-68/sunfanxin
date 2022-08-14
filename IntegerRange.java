class IntegerRange {
  public static void main(String[] args) {
    
    int a = 111;
    System.out.println(a);

    int b = 111 + 3;
    System.out.println(b);
    
    int numInt = 9;
    System.out.println("Int value: " + numInt);
    // 如果我们要使用强制转换将int值更改为 a double，我们需要(double)在代码中实现强制转换运算符：
    System.out.println("Double value: " + (double)numInt);
    
    String numString = "12";

 int numInt1 = Integer.parseInt(numString);
 System.out.println("The int value: " + numInt1); 
 
  numInt1++;
 System.out.println(numInt1); 
  }
}