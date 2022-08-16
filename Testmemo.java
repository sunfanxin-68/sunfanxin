// 1、定义一个数组来存储12个学生的成绩{72,89,65,58,87,91,53,82,71,93,76,68}，计算并输出学生的平均成绩。
public class Testmemo {
	
	 public static void main(String[] args) {
		 //1. 定义一个数组

		 //2.数组里头12个学生的成绩{72,89,65,58,87,91,53,82,71,93,76,68}，
		 int [] myList = {72,89,65,58,87,91,53,82,71,93,76,68};
			 
		 //3.数组所有值相加
		 int total = 0;
	      for (int i = 0; i < myList.length; i++) {
	         total += myList[i];
	      }
		 //4.相加总值除以 12
	      double ping  =  total / 12 ;
	      
		 //5.输出总值
	      System.out.println(ping);
		
		 
		 
	 }
	
	
}