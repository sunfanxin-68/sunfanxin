class CupcakeTest {
  String flavor;
  boolean sprinkles;
  
  public CupcakeTest(String type, boolean hasSprinkles) {
    flavor = type;
    sprinkles = hasSprinkles;
  }
}

class Bakery {
  CupcakeTest bakeryCupcake;
  double price;
  String giveTotal;

  public Bakery(CupcakeTest cupcakeType, double priceOf) {
    bakeryCupcake = cupcakeType;
    price = priceOf;

   // bakeryCupcake.flavor = "vanilla";  可更改flavor参数对象的 由chocolate变成 vanilla
    giveTotal = "The " + bakeryCupcake.flavor + " cupcake is " + price;
    
  }
  
  public static void main(String[] args) {
    CupcakeTest chocolateSprinkle = new CupcakeTest("chocolate", true);

    // 创建一个对象作为参数接收
    Bakery myBakery = new Bakery(chocolateSprinkle, 3.25);
    
    // 输出参数对象的值
    System.out.println("Our object sent as a parameter has a flavor value of "  + myBakery.bakeryCupcake.flavor);

    // 输出原始对象的值
    System.out.println("Our original object has a flavor value of " + chocolateSprinkle.flavor);
  }
}