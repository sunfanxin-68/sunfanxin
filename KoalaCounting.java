class KoalaCounting {
  public static int getTotal(int[] arr) {
	  
	  int total = 0;   //设总数为 total 初始值0
	  for (int i = 0; i < arr.length; i++) {  //设 i循环访问数组长度
		  total +=arr[i];  //总数等于循环访问的数组相加
	  }
   return total;


  }

  public static void main(String[] args) {
    int[] dayOne = {17, 13, 19, 22};
    System.out.println(getTotal(dayOne));  //输出 71
  }
}