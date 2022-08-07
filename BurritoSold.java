public class BurritoSold {
  public static int getBurritosSold(int lastOrderNumber) {
    int totalBurritosSold = 0; //设总共卖了多少个 从0开始
    for (int i = 0; i <= lastOrderNumber; i++ ){ //设订单号从0开始 一直到最后一个订单号之前自增
      totalBurritosSold += i;//总销售量 = 总共卖了多少个➕订单号
    }

        
    return totalBurritosSold;
  }
    
  public static void main(String []args) {
    
    System.out.println(getBurritosSold(100));//一共100个订单 就等于 0+1+2+3+。。+100=5050
  }
}