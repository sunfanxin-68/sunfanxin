HashMap<String, Integer> teaSteepingTemp = new HashMap<>();//Map是一种键-值（key-value）映射表，可以通过key快速查找对应的value。

//增加一个kye 值到HashMap
teaSteepTemp("Oolong", 185);  //set为"Oolong  get为 185
teaSteepTemp.put("Rooibos", 212);

System.out.println(teaSteepingTemp); // 打印出: {Oolong=185, Rooibos=212}

int oolongTemp = teaSteepingTemp.get("Oolong"); //get()方法用于访问单个HashMap值
System.out.println(oolongTemp);  // 打印出 185
 

teaSteepingTemp.remove("Oolong"); //删除用 .remove（）
System.out.println(teaSteepingTemp); // 打印出 {Rooibos=212}

teaSteepingTemp.clear();  //删除所有用.clear()
System.out.println(teaSteepingTemp); 

 
System.out.println(teaSteepingTemp.size()); // Prints: 2 查看HashMap 值的数量  用.size()方法

HashMap<String, Integer> teaSteepingTemp = new HashMap<>();
teaSteepingTemp.put("Oolong", 185);
teaSteepingTemp.put("Rooibos", 212);

for (String key : teaSteepingTemp.keySet()) { // 可以用for-each循环来访问HashMap中的每个元素 key就是set 
	  System.out.println("Brew " + key + " tea at " + teaSteepingTemp.get(key) + "°F");
	}/* 打印出:Brew Oolong tea at 185°F，
Brew Rooibos tea at 212°F */

HashMap<String, Integer> teaSteepingTemp = new HashMap<>();//用.containsKey()方法来判断true或false取决于值是否存在于HashMap
teaSteepingTemp.put("Oolong", 185);
teaSteepingTemp.put("Rooibos", 212);
 
System.out.println(teaSteepingTemp.containsKey("Oolong")); // true 属于
System.out.println(teaSteepingTemp.containsKey("Green")); //  false 不属于

teaSteepingTemp.replace("Rooibos", 245);//用.replace()方法用于修改与键关联的值
System.out.println(teaSteepingTemp.get("Rooibos")); // 212修改成 245

System.out.println(teaSteepingTemp.keySet()); // .keySet()方法返回HashMap里的Set值 打印出 [Oolong, Rooibos]

System.out.println(teaSteepingTemp.values()); // values()方法返回HashMap所有的值 打印出 [185, 212]








