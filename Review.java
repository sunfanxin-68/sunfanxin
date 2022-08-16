import java.util.Arrays;
public class Review {
  public static void main(String[] args) {  

 
  double[][] scores = {{80.4, -1, -1}, {96.2, -1, -1}, {100.0, -1, -1}, {78.9, -1, -1}} ;


  System.out.println(Arrays.deepToString(scores));


  scores[0][1] = 89.7;
  scores[1][1] = 90.5;
  scores[2][1] = 93.6;
  scores[3][1] = 88.1;

  System.out.println(Arrays.deepToString(scores));
    
//声明并初始化一个名为 的空 4x2 2D 双值数组newScores。
  double[][] newScores = new double[4][2];


//使用循环，将考试 1 和 2 的所有分数复制到新的二维数组中。（不包括 -1 值）
  for(int i = 0; i < newScores.length; i++){
    for(int j = 0; j < newScores[i].length; j++){
      newScores[i][j] = scores[i][j];
    }
  }

  System.out.println(Arrays.deepToString(newScores));

//对于所有低于 90 的考试成绩，在 中的成绩上加 2 分
  for(int i = 0; i < newScores.length; i++){  
    for(int j = 0; j < newScores[i].length; j++){
      if(newScores[i][j]<90){
        newScores[i][j]+=2;
      }
    }
  }

  System.out.println(Arrays.deepToString(newScores));
  }
}