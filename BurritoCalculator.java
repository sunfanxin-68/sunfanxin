public class BurritoCalculator {
	
	
  public static boolean hasLeftoverFunds(int burritoCost) { //设定一个布尔值剩余资金
    int budget = 100; //预算有100¥块
    int numBurritos = 0;//买的数量从0开始
    
    while (budget >= burritoCost) { 
      numBurritos++;
      budget -= burritoCost;
    }

    System.out.println("Remaining budget: " + budget);

    return budget > 0; //只要预算还大于0 就返回继续循环计算
  }
    
  public static void main(String []args) {
    
     System.out.println(hasLeftoverFunds(3)); //预算➗3 余数为1 有剩余的钱 true
    System.out.println(hasLeftoverFunds(10));//预算➗10 余数0 没有剩余钱 false

  }
}