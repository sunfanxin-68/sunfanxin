public class Person{
  public int age;
  public int wisdom;
  public int fitness;

  public Person(int inputAge){
    this.age = inputAge;
    this.wisdom = inputAge * 5;
    this.fitness = 100 - inputAge;
  }

  public void setAge(int newAge){
    this.age = newAge;
  }

  public void setWisdom(int newWisdom){
    this.wisdom = newWisdom;
  }

  public void setFitness(int newFitness){
    this.fitness = newFitness;
  }

  public void hasBirthday(){
    /* this可以用作参数的值。
	  该方法的签名可能类似于. 您正在使用当前对象
	  调用该方法并将该对象作为该方法的参数传递。*/
	/* We use "this" to call the method and also pass
	  "this" to the method so it 
	  can be used in that method*/
    this.setAge(this.age + 1);
    this.setWisdom(this.wisdom + 5);
    this.setFitness(this.fitness - 3);
  }


  public static void main(String[] args){
    Person emily = new Person(20);
    emily.hasBirthday();
    System.out.println("New age is: " + emily.age);
    System.out.println("New wisdom is: " + emily.wisdom);
    System.out.println("New fitness is: " + emily.fitness);
  }
}