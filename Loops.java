public class Loops {
  public static void main(String[] args) {
	  // while循环 必须在计算为true的情况下才能运行
	  int num = 0;
	  while (num < 20) {
	    num = num + 1;
	  }
	  System.out.println(num); //打印出20 循环将继续运行 直到num不再小于20
	  
	 // do while循环 与while不同在于 在查看条件是否一致前会先执行一次
	  do {
     System.out.println("2 is equal to 4!");// 先做！再看条件 所以打印出 2 is equal to 4!
       } while (2 == 4);    //查看条件发现2不等于4  则不会再运行了
	  
	  /*for循环由三个部分组成 循环控制变量初始化 int i = o 
	    一个boolean表达式 i <= 10
	    递增或递减语句 i++
	   */
	  for (int i = 0; i <= 3; i++) {
		  System.out.println(i); //输出0到3
		}
	  
	  //for each 循环 可对项目列表 数组，ArrayList 中的每个项目执行操作
	  
	 // for (int i = 0; i <= myArray.length; i++) { //这是for循环 例行3步骤
		  //执行命令
	//	}
	 // for (String s : myArray) {  //数组中所有项目都为执行对象
		  // 执行命令
		//}
	  
	  //break 和 continue 语句  为循环中用于进一步控制执行次数 可在执行途中停止或继续
	  
	  for (int i = 0; i < 10; i++) {
		  System.out.println(i); //没有break就会输出1到10
		  if (i == 4) {
		    break; //输出0到4  因为到4就停止了
		  }
		}
	  //continue为 在循环中如果想跳过某个情况 可在执行continue跳过开始下一个执行
	  int[] numbers = {1, 2, 3, 4, 5, 6, 7};
	  
	  for (int i = 0; i < numbers.length; i++) {
	    if (numbers[i] % 2 ==0) {    
	      continue;  //只有偶数➗2 的余数为0 则当i=所有偶数时，不会被输出，跳到下一个项目继续循环
	    }
	    System.out.println(numbers[i]);
	  }
	  
	  
	  
	  
  }
  }