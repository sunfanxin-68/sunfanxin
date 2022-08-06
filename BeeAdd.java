import java.util.ArrayList;

public class BeeAdd {
  private ArrayList<Bee> beeList;

  public BeeAdd(int numBees) {
    this.beeList = new ArrayList<Bee>();
    for (int i = 0; i < numBees; i++) {
      this.beeList.add(new Bee("bee" + i));
    }
  }

  public ArrayList<Bee> getBeeList() { //新声明一个 Bee数组
    return this.beeList;
  }

  public void addBees(ArrayList<String> beeNames) {
	  for (String name : beeNames) {
		  this.beeList.add(new Bee(name));  //Bee数组新增一个变量 name
	  }
  }
  
  /*public BeeHive(int numBees) {
	    this.beeList = new ArrayList<Bee>();
	    for (int i = 0; i < numBees; i++) {
	      this.beeList.add(new Bee("bee" + i));
	    }
	  }

	  public ArrayList<Bee> getBeeList() {
	    return this.beeList;
	  }

	  public void moveOutBees() {
	    for (int i = 0; i < this.beeList.size(); i++) {
	      this.beeList.remove(i);
	    }
	  }

	  public static void main(String[] args) {
	    BeeHive myHive = new BeeHive(10);
	    myHive.moveOutBees();
	   
	    for(Bee b : myHive.beeList){
	      System.out.println(b.getName());
	    }
	    */
  
	
	public void renamebees(ArrayList<String>newNames) {
		int numNamesToAssugn = this.beeList.size();
		if (newNames.size() < this.beeList.size()) {
			numNamesToAssign = newNames.size();
		}
		for (int i = 0; i < numNamesToAssign; i++) {
			this.beeList.get(i).setName(newNames.get(i));
		}

  public static void main(String[] args) {
    BeeHive myHive = new BeeHive(3);
    ArrayList<String> newBees = new ArrayList<String>();
    newBees.add("Bob");
    newBees.add("macey");
    newBees.add("anna");

    myHive.addBees(newBees);
    
    for (Bee b : myHive.beeList) {
      System.out.println(b.getName());
    }
  }
}