public class SavingsAccount{
	/*
	 * publicandprivate关键字用于定义代码的哪些部分可以访问其他类、方法、构造函数和实例变量。
封装是一种用于对其他类隐藏实现细节的技术。它的目的是创建小的逻辑捆绑。
this关键字可用于指定实例变量和局部变量之间的区别。
局部变量只能在定义它们的范围内使用。
this关键字可用于在编写类时调用方法。
	 */

  public String owner;
  public int balanceDollar;
  public double balanceEuro;

  public SavingsAccount(String owner, int balanceDollar){
     //完成构造函数，为所有三个实例变量赋值。
     this.owner = owner;//实例变量owner应设置为局部变量owner
     this.balanceDollar = balanceDollar;
     this.balanceEuro = balanceDollar * 0.85;
     //实例变量balanceEuro应设置为等于局部变量balanceDollar乘以0.85。


  }

  public void addMoney(int balanceDollar){
     
   
    this.balanceDollar += balanceDollar;
    //将存储在参数中的值添加balanceDollar到实例变量balanceDollar中
     System.out.println("Adding " + balanceDollar + " dollars to the account.");
     //向帐户添加 2000 美元。
    System.out.println("The new balance is " + this.balanceDollar + " dollars.");
    //新的余额是 3000 美元。
  }

  public static void main(String[] args){
    SavingsAccount zeusSavingsAccount = new SavingsAccount("Zeus", 1000);

  
   zeusSavingsAccount.addMoney(2000);
   //在方法中调用该addMoney()方法一次main()以测试您的代码。将2000美元添加到 Zeus 的帐户中。
  }

}