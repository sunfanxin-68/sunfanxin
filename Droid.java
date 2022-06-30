public class Droid {
String name;

public String toString() {
  return "こんにちは, わたしは" + name + "です";
}

public Droid(String droidName) {
	  name = droidName;
	}

public static void main(String[] args) {
  Droid codey = new Droid("codey");
  System.out.println(codey);


}



}