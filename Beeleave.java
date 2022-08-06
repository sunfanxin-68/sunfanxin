import java.util.ArrayList;

public class Beeleave {
  private ArrayList<Bee> beeList; 

  public Beeleave(int numBees) {
    this.beeList = new ArrayList<Bee>();
    for (int i = 0; i < numBees; i++) {
      this.beeList.add(new Bee("bee" + i));
    }
  }

  public ArrayList<Bee> getBeeList() {
    return this.beeList;
  }

  public void leaveHome(String beeName) {  //将离家蜜蜂定义一个名字
	  
	  for(Bee b : this.beeList) { 
		  if(b.getName().equals(beeName)) {  //访问beeList中的蜜蜂的数值是否与蜜蜂家里值一致
			  b.leaveHome();
		  }
	  }


  }

  public static void main(String[] args) {
    Beeleave myHive = new Beeleave(365);
    myHive.leaveHome("bee43");//定义离家的蜜蜂为43号

    // 输出离家的43号蜜蜂是否在家 
    System.out.println(myHive.beeList.get(43).isHome()); 
  }
}