class Cupcake {
  String flavor;
  boolean sprinkles;
 
  public Cupcake(String type, boolean hasSprinkles) {
    flavor = type;
    sprinkles = hasSprinkles;
  }
  
  class Bakery {  //创建一个名叫Bakery的类
	  Cupcake bakeryCupcake;
	  double price;
	  String giveTotal;
	 
	  public Bakery(Cupcake cupcakeType, double priceOf) {  //构造一个函数 接受对象为Cupcake 作为参数
	    bakeryCupcake = cupcakeType;
	    price = priceOf;
	    bakeryCupcake.flavor = "vanilla";//把Cupcake的flavor 修改成 vanilla
	    giveTotal = "The " + bakeryCupcake.flavor + " cupcake is " + price;
	  }
	}
  
  public static void main(String[] args) {
	  Cupcake chocolateSprinkle = new Cupcake("chocolate", true);//创建一个新对象chocolateSprinkle
	  
	  Bakery myBakery = new Bakery(chocolateSprinkle,10.0); 
	  /*创建一个Bakery的新对象myBakery  将chocolate这个对象作为参数*/
	  
	  System.out.println(myBakery.giveTotal);   //调用上方Bakery的语句 输出The chocolate cupcake is 10.0
  }
}
