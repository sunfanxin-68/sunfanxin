class Vet {
  public void Vet() {
    // 构造一个vet类
  }
  public void getCheckUp(Animal patient) {
    // 构造一个方法 getCheckUp
  }
 
  public void main(String[] args) {
    
    Vet catDoctor = new Vet();//将子类catDoctor实例化
    Animal myCat = new Cat();//给父类aniaml创建一个子类cat
    catDoctor.getCheckUp(myCat); //将 Animal对象作为一个 Vet的方法的参数
  }
}