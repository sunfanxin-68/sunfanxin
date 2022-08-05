ArrayList<String> months = new ArrayList<String>(12);
months.add("January");  //添加方式.add()
System.out.println(months): // 打印出一月
	
	
	ArrayList<String> months = new ArrayList<String>(12);
	months.add("January");
	months.add("February");
	months.add("June");
	months.add(2, "March"); //// 更改第三个数值 june➡️March
	System.out.println(months); // 打印出 [January, February, March, June]
	months.remove("February");//months.remove(1);   都是删除二月
	
	LinkedList<String> days = new LinkedList<String>();//LinkedList该类使用双向链表来存储其元素，必须在程序顶部导入
	days.add("Monday");
	days.add("Tuesday");
	System.out.println(days); // 打印出: [Monday, Tuesday]
	System.out.println(days.get(0)); // 使用该.get()方法从列表中的指定索引中检索元素： 打印出Monday
	