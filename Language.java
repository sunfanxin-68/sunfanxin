class Language {

  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;
 
//构建，在方法上方main()，给出Language一个构造函数，将每个字段设置为传入的值。
    Language(String n, int ns, String rs,
  String wo){
      this.name = n;
      this.numSpeakers = ns;
      this.regionsSpoken = rs;
      this.wordOrder = wo;
    }
//方法
  public void getInfo(){
 
    System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ".　The language follows the word order: " + wordOrder);
 
    }
 //main method
 public static void main(String[] args){  //在main()中，实例化Language

 Language japanese = new Language("Japanese", 250, "small country", "konnitiwa");//数组化
japanese.getInfo(); //japanese.getInfo();


Mayan mayanLang = new Mayan("mayan ", 100);
mayanLang.getInfo();
//mayanLang。getInfo（）；

SinoTibetan mandChinese = new SinoTibetan("Mandarin Chinese",5000);
mandChinese.getInfo();

SinoTibetan/*汉藏语*/ burmese/*缅甸语*/ = new SinoTibetan("Burmese", 6000);
burmese.getInfo();


  }
}