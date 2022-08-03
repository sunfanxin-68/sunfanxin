public class Variables {
	public static void main (String[] args) {
		int age = 28; //int数据类型用于存储整数值。这意味着它可以存储所有正负整数和零。
		 
		char grade = 'A'; //char用于存储单个字符。该字符必须用单引号括起来。
		 
		boolean late = true; //在 Java 中，boolean原始数据类型用于存储一个值，它可以是true或false。
		 
		byte b = 20; /*byte 数据类型是8位、有符号的，以二进制补码表示的整数；
        最小值是 -128（-2^7）；
        最大值是 127（2^7-1）；
        默认值是 0；*/
		 
		long num1 = 1234567;/*long 数据类型是 64 位、这种类型主要使用在需要比较大整数的系统上；
		long 数据类型是 64 位、有符号的以二进制补码表示的整数；*/
		 
		short no = 10; /*short 数据类型是 16 位、有符号的以二进制补码表示的整数
                        最小值是 -32768（-2^15）；
                        最大值是 32767（2^15 - 1）；*/
		 
		float k = (float)12.5; /*浮点类型就是小数， 需要加上f后缀*/
		 
		double pi = 3.14; /*小数点类型 覆盖范围更大*/
		
		String name = "Amy"; /*Java 中的字符串是一个包含多个字符的对象。它不是原始数据类型。

可以通过在一对双引号 ( ") 之间放置字符来创建字符串。*/
		
		int a = 5;
		int q = 3;
		 
		boolean result = a > q;
		// result now holds the boolean value true
		System.out.println(result);
		
		final double PI = 3.14; //如果变量使用关键字声明的 则不能更改变量的值。
		
		int number = 5; 
		 
		number += 3; // Value is now 8  5+3
		number -= 4; // Value is now 4  8-4
		number *= 6; // Value is now 24  4*6
		number /= 2; // Value is now 12  24/2
		number %= 7; // Value is now 5   12/7= 1....5
		
		  String[] names = {"ABC", "XYZ", "zoo"};
	        String s = names[1];
	        names[1] = "cat";
	        System.out.println(s); // s是"XYZ"还是"cat"?
	        System.out.println(names[1]);
		
	}
}