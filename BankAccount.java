class BankAccount {
  protected double balance; //建一个 受保护的 变量 账户balance

  public BankAccount(double balanceIn){
    balance = balanceIn; //balance实例化为balanceIn
  }
 
  public void printBalance() {  //返回类型打印出balance
    System.out.println("Your account balance is $" + balance);
  }
}


class CheckingAccount extends BankAccount {  //新建子类CheckingAccount 属于BankAccount 
  public CheckingAccount(double balance) { //可调用父类的变量balance
    super(balance); //子类的CheckingAccount可以访问父类的balance方法
  }
 
  @Override //在子类中覆盖父类方法
  public void printBalance() {  
    System.out.println("Your checking account balance is $" + balance);
  }
  
  public static void main(String[] args) {
    BankAccount myCheckings = new CheckingAccount(5000);
    myCheckings.printBalance();//调用父类BankAccount的printBalance方法
  }
}
