  
import java.util.ArrayList; // Import statement:

class PrimeDirective {
	
	/*
	 *  * A prime number is an integer greater than 1 that is only
	 * divisiable by 1 and itself.
	 */
	// Add your methods 
	public static boolean isPrime(int number) {
		if( number > 1) {
			for(int i = 2; i < number; i++) {
				if(number % i == 0) {
					return false;
				}
			}
			return true;
		}else {
			return false;
		}
		
	}
	
	public ArrList<Integer> onlyPrimes(int numbers[]){
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for(int i : number) {
			if(isPrimw(i)  == true){
				primes.add(i);
			}
		}
		return primes;
		
		
	}
	public static void main(String[] args) {
		
		PrimeDirective pd = new PrimeDirective();
		int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
		
		System.out.println(isPrime(7));
		System.out.println(isPrime(28));		
		System.out.println(isPrime(2));
		System.out.println(isPrime(0));
		
		
		System.out.println(pd.onlyPrimes(numbers));
	}
	
	
	
	
	
}