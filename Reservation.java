public class Reservation {
  int guestCount; //宾客数量
  int restaurantCapacity;  //餐厅容量
  boolean isRestaurantOpen;  //餐厅是否营业
  boolean isConfirmed; //是否证实
  
  public Reservation(int count, int capacity, boolean open) {
	  if (count < 1 || count > 8) {   //当宾客人数小于1或者大于8的时候  不与接纳
	      System.out.println("Invalid reservation!");

	    }
    guestCount = count;
		restaurantCapacity = capacity;
		isRestaurantOpen = open;
  }  
  
  public void confirmReservation() {
    if(restaurantCapacity >= guestCount && isRestaurantOpen) {   //如果餐厅容量大于等于宾客数量且餐厅营业的话 
      System.out.println("Reservation confirmed");//输出成功预约
      isConfirmed = true;  
      } else { //不然
        System.out.println("Reservation denied");//则输出 拒绝预约
        isConfirmed = false; 
      }
  
  }
  
  public void informUser() {
    System.out.println("Please enjoy your meal!");
  }
  
  public static void main(String[] args) {
    Reservation partyOfThree = new Reservation(3, 12, true);
    Reservation partyOfFour = new Reservation(4, 3, true);
    partyOfThree.confirmReservation();
    partyOfThree.informUser();
    partyOfFour.confirmReservation();
    partyOfFour.informUser();
  }
}