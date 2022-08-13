public class Droid {
	
 String name;
 int batteryLevel;
 
 public Droid(String droidName) {
	  name = droidName;
	  batteryLevel = 100;
	}

public void performTask(String task) {
	batteryLevel = batteryLevel - 10;
	System.out.println(name + " is performing task:" + task);
	
}

public String toString() {
	  return "こんにちは, わたしは" + name + "です";
	}

public static void main(String[] args) {
  Droid codey = new Droid("codey");
  System.out.println(codey);
  codey.performTask("dancing");
  codey.performTask("slepping");


}



}