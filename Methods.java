class Methods {

  public static void printSomething() {
    System.out.println("今日は8月6日");
  }

  public static void printName(String name) {
    System.out.println(name);
  }
  
  public static int findSum(int a, int b) {
    return a * b;
    
  }

  public static void main(String[] args) {
    printSomething(); //调用方法

    printName(" Sun");//参数调用
    printName("morita");

    int product = findSum(99,11); 
    System.out.println(product); //return返回
  }
}