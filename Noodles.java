class Pho extends Noodle {  //pho子类 属于 面条（父类）
  public Pho() {
    super("flat"); //构造一个父类函数
  }
}

class Noodle {
  boolean isCooked = false;
  String shape;

  public Noodle(String shape) {  //noodle父类里设一个shape
     this.shape = shape;// = "flat"
  }
  
  public static void main(String[] args) {
     Pho lunch = new Pho(); //lunch = pho
     System.out.println(lunch.shape); //pho的形状为？ 打印出 flat
     System.out.println(lunch.isCooked);// pho是否正在cooked 打印出 false
  }
}