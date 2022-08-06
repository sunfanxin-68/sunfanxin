public class Methhod {
	
	public static void exampleMethod() {  //公共，静态，可被调用的方法exampleMethod() 不接受任何参数不返回任何值
		  System.out.println("Hello Method!");
		}
	/* 程序的public任何部分都可以访问方法，包括其他类。
       可以static在整个程序中调用方法，而无需创建类的对象。
       方法void不返回值。
       上面的声明包含空括号；因此，此方法不带任何参数。
        放在括号 ({和}) 内的所有代码都被视为方法体。 
	 */
	
	//调用方法 需说明方法名称 后跟括号（） 和分号 ;
	
	public static void exampleMethod() {
		  System.out.println("Hello Method!");
		}
		public static void main(String[] args) {
		  exampleMethod(); // 调用了exampleMethod的防范 输出 Hello Method!
		}
		
		//Parameters Arguments  参数设置放在声明的括号内需说明数据类型和参数名称
		
		public static void exampleMethod(String greeting, String name) {  //声明一个方法
			  System.out.println(greeting + " " + name); //String参数 greeting 和 name 在方法中 称为变量
			}
		public static void main(String[] args) {  //将main方法调用时
			  exampleMethod("Greetings", "Earthling"); //需将参数放在方法调用的括号内 输出 Greetings Earthling
			  exampleMethod("Hello", "World"); // 输出 Hello World
			  exampleMethod("Howdy", "Planet"); // 输出 Howdy Planet
			}
		
		//return 返回值 需先更改方法声明以包含返回值的数据类型。返回类型放在方法名之前。

		// 方法将返回至定义变量的时候 
		public static int findProduct(int num1, int num2) {
		  return num1 * num2;
		}
		public static void main(String[] args) {
		  int product = findProduct(3,4); //调用findProduct的方法 返回至 num1 * num2
		  System.out.println(product); // 输出 12
		}
       //Method Scope 方法范围 规定了方法中可访问的变量 只能在创建的额方法内访问 不然会error
		
		public static void scopeExample() {
			  String msg = "This value is only accessible within this method";
			}
			public static void main(String[] args) {
			  System.out.println(msg);//输出error msg 只能在名为scopeExample的方法中访问
			}
		
	
	
	
}