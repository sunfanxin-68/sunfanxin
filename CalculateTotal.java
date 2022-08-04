import java.util.ArrayList;

class CalculateTotal {
  
  public static void main(String[] args) {
    
    ArrayList<Double> expenses = new ArrayList<Double>();
    expenses.add(2.5);
    expenses.add(3.5);
    expenses.add(4.5);
    expenses.add(5.5);
    
    double total = 0;
    
    // Iterate over expenses
    for (int i = 0; i < expenses.size(); i++) {
      
       total += expenses.get(i);

    }
    
    System.out.println(total);
    
  }
  
}


