class ArraysExample {
  public static void main(String[] args) {
    String[] bandInstruments = {"bass", "guitar", "electric keyboard", "drums"}; //声明一个数组
    System.out.println(bandInstruments[2]); //打印出第三个元素
    bandInstruments[2] = "melodica"; //数组中第三个元素名称更改为 melodica
    System.out.println(bandInstruments[2]); //再次输出第三个元素
    System.out.println(bandInstruments.length); //输出数组一共有几个元素

    String[] quartetInstruments = new String[4];//新建一个数组 设string 4个元素
    quartetInstruments[0] = "violin"; //依次输入元素名称
    quartetInstruments[1] = "guitar";
    quartetInstruments[2] = "ドラム";
    quartetInstruments[3] = "cello";

    for (int i = 0; i < quartetInstruments.length; i++) {  //设定一个for循环 从0开始 当i一直到数组结束为止循环
      System.out.println(quartetInstruments[i]); //输出循环访问到的元素
    }
   
  }
}