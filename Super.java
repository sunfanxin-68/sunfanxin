class Shape {
  int numSides;
  Shape(int numSides) {
    this.numSides = numSides;
  }
}
 
class Triangle extends Shape {  //子类三角形附属于父类形状之中
  Triangle() {
    // 用super（）方法来调用父类shape方法 numsides=3 
    super(3);
  }
 
  public static void main(String[] args) {
    Shape sq = new Shape(4);
    Triangle tri = new Triangle();
    System.out.println(sq.numSides); // 打印出 4
    System.out.println(tri.numSides); // 打印出 3
  }
}