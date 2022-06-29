package d0204;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("年份");
        int i = new Scanner(System.in).nextInt();
        if(i%4==0&&i%100!=0||i%400==0){
            System.out.println("");
        }
    }
}
