public class ThisPerson{
  public int age;
  public int wisdom;
  public int fitness;

  public ThisPerson(int inputAge){
    this.age = inputAge;  //将实例变量转为局部变量 this调用其他方法
    this.wisdom = inputAge * 5;
    this.fitness = 100 - inputAge;
  }

  public void setAge(int newAge){  //Setter的目的就是要用一个参数设定实例变量的值
    this.age = newAge;
  }

  public void setWisdom(int newWisdom){
    this.wisdom = newWisdom;
  }

  public void setFitness(int newFitness){
    this.fitness = newFitness;
  }

  public void hasBirthday(){  //用来调用mutator方法
    
    this.setAge(this.age + 1);  //用this来调用
    this.setWisdom(this.wisdom + 5);
    this.setFitness(this.fitness - 3);

  }

  public static void main(String[] args){
    ThisPerson emily = new ThisPerson(20);
    emily.hasBirthday();
    System.out.println("New age is: " + emily.age);
    System.out.println("New wisdom is: " + emily.wisdom);
    System.out.println("New fitness is: " + emily.fitness);
  }
}