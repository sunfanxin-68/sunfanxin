import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList {
  public static void main(String[] args) {
    ArrayList<String> months = new ArrayList<String>(12);
    months.add("January");
    months.add("February");
    months.add("March");
    months.remove("February");
    System.out.println(months); 

    LinkedList<String> days = new LinkedList<String>();
    days.add("Monday");
    days.add("Sunday");
    days.add(0, "Sunday"); //("Sunday","Monday", "Sunday", )
    days.remove(2);//("Sunday","Monday",)
    System.out.println(days); //("Sunday","Monday",)
  }
}