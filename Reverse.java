class Reverse {
  public static String reverseString(String text) {
  
   String reversed = new String("");  //新建一个string名为reversed来储存 text
 
  for (int i=0; i < text.length(); i++){  //新建一个for循环 需要循环访问所有字符 所以将循环直到 i < text.length()
    char nextCharacter = text.charAt(i);  //  创建一个char 变量 用它来储存此代码中的元素值
    reversed = nextCharacter + reversed;  // 最后用 reversed来使用代码更新的值 = next Character + reversed 这样可创建新的反向的String
  }
  return reversed; //最后在循环之外 返回 reversed
   
  }

  public static void main(String[] args) {
    String text = new String("elppa");

   System.out.println(reverseString(text));
   
 }
}