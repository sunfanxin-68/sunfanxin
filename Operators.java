public class Operators {
	public static void main(String[] args) {
	
	/* 
	 x < y  小于
	 x > y  大于
	 x <= y 小于等于
	 x >= y 大于等于
 	 x == y 等于
	 x != y 不等于
	 
	 &&  两个boolean 都等于时 true 否则false
	 boolean statementA = true;
     boolean statementB = false;
     boolean statementC = true;
 
     System.out.println(statementA && statementB); // 输出 false
     System.out.println(statementA && statementC); // 输出 true
     
      ||  至少一个boolean为 ture 则输出 true， boolean都是false则输出false
      boolean statementA = true;
      boolean statementB = false;
      boolean statementC = false;
 
      System.out.println(statementA || statementB); // A为true则输出 true
      System.out.println(statementB || statementC); // b，c都flase 则输出 false
      
      ! boolean值为false时 输出ture， true时 输出 false
      
      boolean statementA = true;
      boolean statementB = false;
      System.out.println(!statementA); // A为true则输出 false
      System.out.println(!statementB); // b为flase  则输出true
      */
	    int a = 1;
	    int b = 2;
	    int c = 3;

	    boolean statementA = !true;  a为true 
	    boolean statementB = a == c;  //a不等于c false
	    boolean statementC = a + b >= b || c == b;  //a + b >= b 为true 则输出true
	    boolean statementD = !(true && a == c - b);   //true && a == c - b 为true ，!(）则 false

	    System.out.println(statementA);
	    System.out.println(statementB);
	    System.out.println(statementC);
	    System.out.println(statementD);
	  }
	
   }
