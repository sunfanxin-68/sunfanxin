public class Bird {
  public Bird() {
    // Instructions for creating a Bird go here:
  }
 
  public void move() {
    System.out.println("The bird flies away");
  }
}
 
// Child class:
class Flamingo extends Bird {
  public Flamingo() {
    // Instructions for creating a Flamingo go here:
  }
 
  public static void main(String[] args) {
     Flamingo myFlamingo = new Flamingo();
     myFlamingo.move(); // The bird flies away
  }
}
