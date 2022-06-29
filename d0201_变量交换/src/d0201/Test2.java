import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("输入整数a");
        int a = new Scanner(System.in).nextInt();
        System.out.println("输入整数b");
        int b = new Scanner(System.in).nextInt();
        System.out.println("a="+a+"b="+b);
        System.out.println("交换");
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a="+a+"b="+b);

    }
}
