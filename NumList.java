public class NumList {
	public static int getNumAllergicItems(String[] numList) {
		int numItems = 0;
		
		for (int i = 0; i < numList.length; i++) {  //设i从0循环访问数组所有长度
			if (numList[i].length() > 5) {  //找出数组中长度大于5的
				numItems++;
			}
		}
		return numItems;
		
	}
	
	
	public static void main(String[] args) {
		String[] numList = {"Sony", "Canon", "Nikon", "Leica", "Fujifilm"};
		
		System.out.println(getNumAllergicItems(numList));
	}
}
