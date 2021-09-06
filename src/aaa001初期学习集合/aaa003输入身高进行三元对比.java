package aaa001初期学习集合;

import java.util.Scanner;

public class aaa003输入身高进行三元对比 {
    public static void main(String[] args) {
        /*//ceshi
		Scanner b11 = new Scanner(System.in);
		//jieshou
		System.out.println("输入:");
		int x = b11.nextInt();
		//123
		System.out.println("结果:"+x);*/

        //输入身高
        Scanner b11 = new Scanner(System.in);
        System.out.println("第一个");
        int x1 = b11.nextInt();
        System.out.println("第二个人：");
        int x2 = b11.nextInt();
        System.out.println("第三个人：");
        int x3 = b11.nextInt();
        System.out.println("第四个人：");
        int x4 = b11.nextInt();
        //比较
        int tall1 = x1 > x2 ? x1 : x2;
        int tall2 = tall1 > x3 ? tall1 : x3;
        int tall3 = tall2 > x4 ? tall2 : x4;
        System.out.println("结果：" + tall3);
        //观察结果
    }
}
