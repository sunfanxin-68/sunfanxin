public class Apple {
	public String color;
	private int size;
	
	public Apple(String color, int size) {
		
	}
	public void taste(boolean delicious) {
		delicious = true;
	}
	
	public static void main(String[] args) {
		Apple fushi = new Apple("red", 50);
		System.out.println(fushi.color);
		System.out.println(fushi.size);
		System.out.println(fushi.delicious);
	}
}