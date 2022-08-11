public class MostGroceryList {
  public static double getMostExpensiveItemCost(double[] groceryPrices) {
   
    double maxCost = groceryPrices[0];    
    for (double itemCost : groceryPrices){
      if(maxCost < itemCost){  
        maxCost = itemCost;
      }
    }
    return maxCost;
  }

  public static void main(String[] args) {
   
   double[] groceryPrices = {10.0, 12.3, 99.45, 2.34};
   System.out.println(getMostExpensiveItemCost(groceryPrices)); //输出数组中数值最大的元素
  }
}