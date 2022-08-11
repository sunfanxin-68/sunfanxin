class TwoDimensionalArrays {
  public static void main(String[] args) {
    String[][] colors = {{"rojo", "red"}, {"azul", "yellow"}, {"verde", "green"}};
      //新建一个颜色二维数组
    System.out.println(colors[1][1]);// 输出第二组第二个 yellow
    colors[1][1] = "blue"; //将yellow改成blue
    System.out.println(colors[1][1]); // 输出blue

    char[][] arr2D = new char[3][3]; //新建一个二维数组 有3组 每组2个元素
    arr2D[0][0] = '1'; //开始设定每组元素的值
    arr2D[0][1] = 'A';
    arr2D[0][2] = 'Z';
    arr2D[1][0] = '2';
    arr2D[1][1] = 'B';
    arr2D[1][2] = 'X';
    arr2D[2][0] = '3';
    arr2D[2][1] = 'C';
    arr2D[2][2] = 'V';
 

    for (int i = 0; i < arr2D.length; i++){   // 创建一个for循环 i从0到尾循环访问
      for (int j = 0; j < arr2D[0].length; j++){   
          System.out.println(arr2D[i][j]);
      }
    }
  }
}