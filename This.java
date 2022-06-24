public class This {
	
	public String owner;
	public int balanceDollar;
	public double balanceEuro;
	/*三个均为实力变量，现要把三个实力变量改为局部变量，要用到this。
	this关键字是对当前对象的引用,等于传递给构造函数的变量*/
	public This(String owner, int balanceDollar) {
		this.owner = owner;
		this.balanceDollar = balanceDollar;
		this.balanceEuro = balanceDollar * 0.85;
	}
	
	public void addMoney(int balanceDollar) {
		System.out.println("Adding " + balanceDollar + " dollars to the account.");
	    this.balanceDollar += balanceDollar;// += 为 左边等于 左边➕右边 c += a  =  C=C+a
	    System.out.println("The new balance is " + this.balanceDollar + " dollars. ");
	  }


}