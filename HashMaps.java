import java.util.HashMap;

class HashMaps {
  public static void main(String[] args) {

    HashMap<String,String> flowerNames = new HashMap<>(); //创建

    flowerNames.put("Lily", "Lilium");
    flowerNames.put("Sunflower","Helianthus");
    flowerNames.put("Daffodil", "Narcissus");
    flowerNames.put("Orchid", "TBD");
    flowerNames.remove("1");//删除第二个
    flowerNames.replace("Orchid","AAAAA");//更改
    flowerNames.put("バラ", "薔薇");
    System.out.println(flowerNames.containsKey("AAAAA"));//判断是否存在
    System.out.println(flowerNames.containsKey("Orchid"));
   
   
    System.out.println(flowerNames);
    System.out.println(flowerNames.size());//打印set的全部数量

    for (String key: flowerNames.keySet()) {
      System.out.println(key + "の学名" + "は" + flowerNames.get(key)); //访问所有数值来制造数据结构
    }
  }
}