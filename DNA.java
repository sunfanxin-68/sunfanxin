// DNA Sequencing  //DNA序列
public class DNA {
	
	public static void main(String[] args) {
		
		 //  -. .-.   .-. .-.   .
	    //    \   \ /   \   \ / 
	    //   / \   \   / \   \  
	    //  ~   `-~ `-`   `-~ `-
		
		/*
		字符串方法	价值
		length()	返回长度
		concat()	连接两个字符串
		equals()	检查两个字符串之间的相等性
		indexOf()	返回子字符串的索引
		charAt()	返回一个字符
		substring()	返回一个子字符串
		toUpperCase()	返回大写版本
		toLowerCase()	返回小写版本
		*/
		
		String dna1 = "ATGCGATACGCTTGA";
		String dna2 = "ATGCGATACGTGA";
		String dna3 = "ATTAATATGTACTGA";
		
		String dna = dna3;
		
		// Find the length:请找出dna绳子的长度。
		int length = dna.length();
		System.out.println("Length: " + length);
		
		// Find start codon: 蛋白质具有以下特性：
		//1.它以起始密码子开头 ATG
		//2.它以终止密码子结尾TGA
		//3.在这两者之间，核苷酸的数量可以被 3 整除。
		int start = dna.indexOf("ATG");
		int end = dna.indexOf("TGA");
		System.out.println(start);
     	System.out.println(end);
		
		if(start != -1 && end != -1 && (end - start) % 3 == 0) {
			
		
			String protein = dna.substring(start,end +3);
			System.out.println("Protein: " + protein);
		} else {
			System.out.println("No Protein");
		}
			
			
			
		
		
	}
	



	
	
 }