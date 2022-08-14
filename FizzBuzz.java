public class FizzBuzz {
	
	
	public static void main(String[] args) {
		//number 1 to 100
		//multipe(*) of 3 :Fizz
		//multipe of 5 :Buzz
		//multiple of 3 And 5 :FizzBUzz
		//otherwise print number itself
		
		
	for(int i = 0; i<= 100; i++) {
		
		if(i % 3 == 0) {
			System.out.println("Fizz");
		}else {
			System.out.println(i);
		}
		
		if(i % 5 ==0) {
			System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
		
		if((i % 3 == 0) && (i % 5 == 0)) {
			System.out.println("FizzBuzz");
		}
	}
	
		
	}
}