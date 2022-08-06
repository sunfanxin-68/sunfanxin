class Conditionals {
  public static void main(String[] args) { 
    boolean breakfastTime = false;
    boolean lunchTime = false;
    boolean dinnerTime = false;
    
    if (breakfastTime) {    // 如果true为早上
      System.out.println("Let's have waffles!"); //则输出
    } else if (lunchTime) {  //如果true为中午
       System.out.println("Let's have sandwiches!"); ///则输出
    } else if (dinnerTime) { 
       System.out.println("Let's have pizza!");
    } else {   //如果都不是上述
       System.out.println("It's not time to eat!");  //则输出
    }
  }
}