public class Person {
	 // state of an object
	  int age;
	  String name;
	  
	  // behavior of an object
	  public void set_value() {
	    age = 20;
	    name = "Robin";
	  }
	  public void get_value() {
	    System.out.println("Age is " + age);
	    System.out.println("Name is " + name);
	  }
	  
	  // main method
	  public static void main(String [] args) {
	    // creates a new Person object
	    Person p = new Person(); 
	    
	    // changes state through behavior
	    p.set_value();
	  }
	
	/*public Person(int age, String name) {
		this.age = age;  //构造函数方法
		this.name = name;
	}*/
	
	
	
	/*public static void main (String[] args) {
		Person Bob = new Person(31,"Bob"); // Bob 是Person类的一个实例
		Person Alice = new Person(27,"Alice");
		
		//Person p = new Person(); //实例化对象
		
		//p.age = 25; //用符号设置年龄 访问类中的变量或对象
		//System.out.println("年齢は" + p.age);
		
	}*/
}