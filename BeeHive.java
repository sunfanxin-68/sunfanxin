import java.util.ArrayList;

public class BeeHive {
	private ArrayList<Bee> beeList;  //定义一个受保护的蜜蜂数组beeList  
	
	public BeeHive(int numBees) {   //构造一个方法 蜜蜂数量 
		this.beeList = new ArrayList<Bee>(); //调用蜜蜂数组beeList 实例化为一个新数组
		for (int i = 0; i < numBees; i++) {  //从0开始，当蜜蜂数量小于numBees的时候，自增1
			this.beeList.add(new Bee("bee" + i));
			
		}
	}		
	
	
	public void printBees() {
	    for (Bee b : this.beeList) {  
	      System.out.println(b.getName());//返回动态数组beeList中的元素
	    }
	  }
	public static void main(String[] args) {  //定义一个静态方法
		BeeHive myHive = new BeeHive(5); //  将BeeHive这个方法中的numBees参数变量赋予给BeeHive这个对像  BeehHive = numBees
		 myHive.printBees();
		
	}
	
	
	
	
}