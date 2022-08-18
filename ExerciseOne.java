public class ExerciseOne{
  public static void main(String[] args){

    int randomNum = (int)(Math.random() * 10) + 1; 
    //random()是属于Math该类的静态方法 不需要创建math的对象，像Math myMathObject = new Math()
    System.out.println("Your random number between one and ten is " + randomNum);
    
    int negativeNum = -2;
    int absNum = Math.abs(negativeNum);//绝对值 正负数
    System.out.println("The absolute value of "+ negativeNum + " is " + absNum);

    String myNewString = Integer.toString(1);
    System.out.println(myNewString);

  }
}