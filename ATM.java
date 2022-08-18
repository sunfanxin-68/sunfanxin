/*静态方法和变量与整个类相关联，而不是与类的对象相关联。
静态方法和变量在声明时使用static关键字声明为静态。
静态方法不能与非静态实例变量交互。这是由于静态方法没有this引用。
静态方法和非静态方法都可以与静态变量交互。
*/
public class ATM{

  // 创建两个静态变量
  public static int totalMoney = 0;//跟踪系统中一共有多少钱
  public static int numATMs = 0;//看一共有多少atm的数量
  // 局部变量
  public int money;

  public ATM(int inputMoney){
    this.money = inputMoney;
    
    numATMs += 1;//编辑构造函数在numATM每创建时增加1
    totalMoney += inputMoney; //每增加atm里的钱是也会增加进总金额
  }

  public void withdrawMoney(int amountToWithdraw){
	  if(amountToWithdraw <= this.money){
	      this.money -= amountToWithdraw;
	      // 从特定对象中取出钱时静态变量totalMoney也会反应该更改
	      totalMoney -=  amountToWithdraw;
    }
  }
  public static void averageMoney() {  //写出我的静态方法 自动售货机的平均金额
	  System.out.println(totalMoney / numATMs);//输出方法为 总价除以数量atm
	  //System.out.println(this.money);  静态方法不能与非静态实例变量交互
  
  }

  public static void main(String[] args){
	  
	  System.out.println("Total number of ATMs: " + ATM.numATMs); 
    // 创建两个新ATM
    ATM firstATM = new ATM(1000);
    ATM secondATM = new ATM(500);
    System.out.println(firstATM);
    System.out.println(secondATM);
    // 输出三个不同的静态变量
    System.out.println("Total number of ATMs: " + ATM.numATMs); 

    System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney);  
    firstATM.withdrawMoney(500);
    secondATM.withdrawMoney(200);
    System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney);    

  }

}