class Whale {
  String whaleSpecies; //鲸鱼种类
  int whaleWeight;//鲸鱼体重
  
  public void species() {   //非静态方法 
	  System.out.println(whaleSpecies) ;
  }
  
  public Whale(String name, int weight) {
    whaleSpecies = name;
    whaleWeight = weight;
  }

  public String toString(){
    return "これは " + whaleSpecies + " 体重は約 " + whaleWeight + " pounds.";
  }
  
  public static void main(String[] args){
    Whale whale1 = new Whale("鯨1", 2100);
    Whale whale2 = new Whale("鯨2", 3000);
    
    System.out.println(whale1);
    System.out.println(whale2);
  }

}