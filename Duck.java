public class Duck {
	private String name;
	
	public Duck(String name) {
		this.name = name;
	}
	
	public String getName() {
	    return name;
	  }

	
	public void setName(String newName) {
	    name = newName;
	  }
	public static void main(String[] args) {
	    Duck myDuck = new Duck("鴨");
	    System.out.println(myDuck.getName());
	    myDuck.setName("アヒル");
	    System.out.println(myDuck.getName());
	 
	  }
}