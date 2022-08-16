public class Order {
  boolean isFilled;
  double billAmount;
  String shipping;
  
  public Order(boolean filled, double cost, String shippingMethod) {
		if (cost > 24.00) {
      System.out.println("High value item!");
    }
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
  }
  
  public void ship() {
    if (isFilled) {
      System.out.println("Shipping");
      System.out.println("Shipping cost: " + calculateShipping());
    } else {
      System.out.println("Order not ready");
    }
  }
  
  public double calculateShipping2() {
	    double shippingCost;
	    switch (shipping) {  //如果条件值与case值相匹配 则切换块运行
	      case "Regular":
	        shippingCost = 0;
	        break;
	      case "Express":    
	        shippingCost = 1.75;
	        break;
	      default:  //否则则
	        shippingCost = .50; 
	    }
	    return shippingCost;
	 	}
	  
  public double calculateShipping() {
   //shippinginstance 字段是 aString所以我们需要用于我们的equals()条件。
     if (shipping.equals("Regular")) { 
    	 //当shipping实例字段等于"Regular"时，该方法应该返回0。
       return 0;
       }else if (shipping.equals("Express")) { 
    	   //当shipping实例字段等于"Express"时，该方法应该返回1.75。
         return 1.75;
       }else  //否则该方法应该返回.50。
       return .50;
     
     
    
 	}
  
  public static void main(String[] args) {
    // do not alter the main method!
    Order book = new Order(true, 9.99, "Express");
    Order chemistrySet = new Order(false, 72.50, "Regular");
    
    book.ship();
    chemistrySet.ship();
  }
}