public class Cat1 {
	String furType;
	boolean containsClaws;
	
	public Cat1(String furLength, boolean hasClaws) {
		furType = furLength;    //设置furtypede值
		containsClaws = hasClaws;
		
	}
	
	public static void main(String[] args) {
		Cat1 garfield = new Cat1("Long-hair", true); //创建一个Cat1对象 长头发 有爪子
	}
}