public class Person1 {
 
  int age;
 
 
  public void greetAnother(String name) {
	    System.out.println("Hey there, " + name);
	  }
 
  public Person1(int yearsAlive) {
    age = yearsAlive;
  }
 
  public static void main(String[] args) {
	    Person1 patrick = new Person1(32);
	 
	    patrick.greetAnother("Laura");
  }
} 