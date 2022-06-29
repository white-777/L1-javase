package d0304;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("请输入整数");
        int a = new Scanner(System.in).nextInt();

    }
    static void f(int a){
        for(int i=1;i<=a;i++){
            if(a%i==0){
                System.out.println(i);
            }
        }
    }
}
