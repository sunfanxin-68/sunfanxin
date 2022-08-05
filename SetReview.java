import java.util.*;

class SetReview {
  public static void main(String[] args) {

    Set<String> colors = new HashSet<String>();
    colors.add("red"); // .add() 将新值添加到集合里
    colors.add("orange");
    System.out.println(colors);
    if (colors.contains("red")){   //.contains()检查集合里是否存在 false true
      System.out.println("Set contains red");
    }

    Set<String> primary = new HashSet<String>();
    primary.add("red");
    primary.add("yellow");
    primary.add("green");
    //primary.remove("green");//.remove()移除用
    for (String value: primary) {
      System.out.println(value);//打印出 red 和 yellow
    }

    Set<String> colos = new HashSet<String>();
    colos.add("blue");
    colos.add("green");
    
    
    colors.addAll(primary);
    colors.retainAll(primary);//添加所有集合的交集 此时 red，yellow
    //colors.removeAll(primary);//删掉交集 成了[]
    //System.out.println(colors); 
    
    colors.removeAll(primary);
    System.out.println(colors); 

    System.out.println(colors.size());//检查集合里有多少个数值 .size()
  }
}