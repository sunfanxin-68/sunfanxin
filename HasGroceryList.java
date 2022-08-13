public class HasGroceryList {
  public static boolean hasSpecialItem(double[] groceryPrices) {  
    for (double itemCost : groceryPrices) {   //初始化一个值等于数组
      String itemCostStr = String.valueOf(itemCost);  //设数组中的值等于itemCostStr
      if (itemCostStr.length() > 1 && itemCostStr.substring(itemCostStr.length() - 3, itemCostStr.length()).equals("999")) {
        return true; //当数组 大于1位数的长度  取长度后尾3位数比较   值的末尾为999
      }
    }

    return false;
  }

  public static void main(String[] args) {

    double[] groceryList = {10.10, 89.59, 8.999, 2.324};
    System.out.println(hasSpecialItem(groceryList));
  }
}
