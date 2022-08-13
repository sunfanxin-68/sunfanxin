class AllCounting {
	public static int getTotal(int[][] arr2D) {
		int total = 0;
		for (int row = 0; row < arr2D.length; row++) {   //设从行数开始循环访问 一共3行
			for (int col = 0; col < arr2D[0].length; col++) {  //设从每行元素开始访问 每行4个
				total += arr2D[row][col]; //总数为 row和col的相加总和
				
			    }
			}
			return total;
		}
		public static void main (String[] args) {
			
			int[][] koalaSpottings = {{12, 13, 14, 15}, {21, 22, 23,24}, {31, 32, 33, 34}};
			System.out.println(getTotal(koalaSpottings));
		}
	
}
