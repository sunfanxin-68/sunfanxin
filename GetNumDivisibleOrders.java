public class GetNumDivisibleOrders {
  public static int getNumDivisibleOrders(int lastOrderNumber) {
    int numDivisbleOrders = 0;
    for(int i = 1; i <= lastOrderNumber; i++ ) {
       if(i % 8 == 0) {
    	   numDivisbleOrders++;
        }
    	
    }
    return numDivisbleOrders;
  }
  
  public static void main(String []args) {
   
    System.out.println(getNumDivisibleOrders(64));
  }
}
