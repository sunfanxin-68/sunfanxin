class Replace {
 public static String replaceCharacter(String text, char charToReplace, char replacement) {  
	 /*String text将保存一个循环访问的值
	  * char charToReplace 这是 我们将要搜索以替换它的字符
	  * char replacement 这是我们将替换 charToReplace在string里的对象
	  */
  for (int i = 0; i < text.length(); i++){  //首先创造一个0到length长度的循环
    if (text.charAt(i) == charToReplace) {  //用if语句 来检查当前循环访问的元素是否等于charToReplace
      text = text.substring(0, i) + replacement + text.substring(i+1);  
      //开始创建 第一个值开始到第i个（i = "<") 替换成 e 加上 "< "之后的字符
     
    }
 }
  return text; 
}
 
  public static void main(String[] args) {
    String text = "Th<n this <bony bird b<guiling my sad fancy into smiling,By th< grav< and st<rn ";
    System.out.println(replaceCharacter(text, '<', 'e')); //将字符 < 换成 字符 e
   
  }
}