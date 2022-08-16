public class CarLoan {
	public static void main(String[] args) {
    int carLoan = 10000;  //创建一个车贷变量 设为10000
    int loanLength = 3;  //3年的贷款期限
    int interestRate = 5;  //利率为5%
    int downPayment = 2000; //首付2000

    if(loanLength <= 0 || interestRate <= 0) {  // 检查贷款和利率是否小于0
      System.out.println("Error! You must take out a valid car loan.");  //小于0 就error
    }
    else if(downPayment >= carLoan) {  //当首付大于贷款时
      System.out.println("The car can be paid in full.");  //输出已经还完了

    }

    else {
      int remainingBalance = carLoan - downPayment;  //剩余贷款   总贷款-首付
      int months = loanLength * 12;  //将贷款期限由年转月 3年*12
      int monthlyBalance = remainingBalance / months; //每个月付款 除去利息
      int interest = monthlyBalance * interestRate / 100;  //贷款支付利息 每月还款* 0.05
      int monthlyPayment = monthlyBalance + interest; //每月最终还款值 利息+每个月付款

      System.out.println(monthlyPayment);//输出最终结果 233

    }
    

	

	}
}