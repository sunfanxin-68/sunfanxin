public class TestSwitchCase {
	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade)
		{
		case'A' :
			System.out.println("goodgoodverygood");
			break;
		case 'B':
		case 'C':
			System.out.println("okok");
			break;
		case'D':
			System.out.println("wellwell");
			break;
			default:
				System.out.println("what this?");
				
		}
		System.out.println("grade is " + grade );
		
	}
	
}