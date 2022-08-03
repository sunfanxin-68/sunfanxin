public class Object {
	public static void main(String [] args) {

	
	String school;
	int age;
	String name;
	}
	
	public void set_value() {
		age = 20;
		name = "Morita";
		school = "Ochabi";
		
	}
	public void get_value() {
		System.out.println("年齢は" + age);
		System.out.println("名前は" + name);
		System.out.println("学校は"+ school);
		
	}
	 public Object(int age, String name) {
		    this.age = age;
		    this.name = name;
		  }
		  
}