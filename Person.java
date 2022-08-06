public class Person {   //创建一个对象
	int age;
	String name;
	
	public void set_value() {   //创建对象的状态和行为
		age = 20;
		name = "tanaka";
	}
		
		public void get_value() {
			
			System.out.println("今年は " + age + "歳");
			System.out.println("名前は" + name);
		}
		public static void main(String[] args) {
			Person t = new Person(); //创建一个新的 对象类
			t.set_value();  //通过行为改变状态  调用另一个方法获取value里面的变量
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