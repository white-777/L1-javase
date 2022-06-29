package d0102;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("个人信息：");
        System.out.println("姓名");

        String name = new Scanner(System.in).nextLine();
        System.out.println("年龄");
        int age = new Scanner(System.in).nextInt();
        System.out.println("您的信息是：");
        System.out.println("姓名："+name+"年龄："+age);



    }
}
