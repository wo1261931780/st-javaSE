package ab往期学习2021年10月2日.aaa001初期学习集合;

import java.util.Scanner;

public class aaa011密码验证 {
    public static void main(String[] args) {
        int x = 520;
        Scanner x1 = new Scanner(System.in);
        int x2 = x1.nextInt();
        while (x2 != x) {
            System.out.println("请重新输入");
            x2 = x1.nextInt();
        }
        System.out.println("right number");
    }
}
