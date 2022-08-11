public class GroceryList {
  public static double getTotalCost(double[] groceryPrices) {
    double totalCost = 0.0;  //设一个总价格带小数点的总价格
    for (double i : groceryPrices){   // 设 i为杂货店单价
      totalCost += i;      //总价格等于 所有单价相加
    }
    return totalCost;
  }
  
  public static void main(String[] args) {

	  
    double[] groceryPrices = {10.0, 12.3, 8.45, 2.43}; //给单价赋值
     System.out.println(getTotalCost(groceryPrices));   // 打印出总价
    
    double[] unlikelyGroceryPrices = {100.23, -100.23, 0.0, -78.54};
     System.out.println(getTotalCost(unlikelyGroceryPrices));
  }
}