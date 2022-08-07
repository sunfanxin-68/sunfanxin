public class StringMethods {  
  public static void main(String[] args) {
    String str = "Hello";
    System.out.println(str.length());  //打印出字符串的长度 .length() 输出5
    
    String name = "ocha";
    name = name.concat("nomizu");  // .concat() 为链接 用来链接两个字符串 需重新分配值用 参数 = 参数.concat()
    System.out.println(name); //打印出 ochanomizu

    String flavor1 = "辛い";
    String flavor2 = "甘い";
    System.out.println(flavor1.equals(flavor2));  //.equals() 表是否等于 会输出true 或false
    System.out.println(flavor1.equals("辛い"));

    String letters = "ABCDEFGHIJKLMN";
    System.out.println(letters.indexOf("C")); //.indexOf() 为找出这个字符在字符串中的第一次出现的序号
    System.out.println(letters.indexOf("AZ"));  //如果没有找到该字符 则会返回-1

    String currency = "Sunfan";
    System.out.println(currency.charAt(3));  //.charAt 可查找字符串中的指定序号中的字符

    String line = "It was the best of times, it was the worst of times.";
    System.out.println(line.substring(26));  //.substring()可输出指定字符串之后的语句
    System.out.println(line.substring(0,6)); //想取其中一句话 可用两个数字定义开始与结束 输出 It was

    String input = "Ochabi";
    System.out.println(input.toUpperCase());
    /*.toUpperCase(): 返回转换为大写的字符串值
      .toLowerCase(): 返回转换为小写的字符串值*/
    System.out.println(input.toLowerCase()); 

  }
}