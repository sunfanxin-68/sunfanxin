public class ChikenCalculator {
	
	public static int Quantity(int chikenCost) {  //声明一个参数为可购买的数量，和花费的金额
		int budget = 49;  //定义预算有49
		
		int numChiken = 0;  //开始买的数量 从0开始
		while (budget >= chikenCost) {  //当预算里的钱大于等于总体开销
			numChiken++;                //则可购买数+1
			budget -= chikenCost;      // 预算剩余钱 = 总花费-预算
			
		}
		return numChiken;//返回循环计算
	}
	
	
	public static void main(String []args) {
		
		System.out.println(Quantity(7));
	}
}