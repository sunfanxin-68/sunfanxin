class Cat {   //创建一个对象
	String noise;
	int numLives = 9;
	
	public Cat(String animalNoise)  {  //将实例变量分配给参数值
		noise = animalNoise;
		
		/* public Cat(String noise){
    参数与实例变量同名
    this.noise = noise; 将实例变量分配给参数值
  }
}*/
	}

	
	public static void main(String[] args) {
		Cat firstCat = new Cat("にゃん");   //创建对象时将参数发送给构造函数
		Cat secondCat = new Cat("ミャウ");
		System.out.println(firstCat.noise); 
	    System.out.println(secondCat.noise); 
	    
	    Cat myCat = new Cat("neko"); //如果将对象放在 print 语句中，则输出会显示对象的数据类型（类名），后跟对象的内存地址：
	    System.out.println(myCat);
	   	
	}
	
	
}