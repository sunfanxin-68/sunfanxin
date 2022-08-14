import java.util.Scanner;

public class Introduction {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  //从键盘接收数据
    System.out.println("What is your name?");  //next方式接收 相当于提问
    String userName = input.next(); //输出名字userName 将从键盘输出
    System.out.printf("Hello %s! It's nice to meet you.", userName);
    //终端输出 名字+空格+java.Introduction
  }
}