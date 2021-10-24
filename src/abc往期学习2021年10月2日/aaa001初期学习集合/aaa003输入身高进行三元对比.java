package abc往期学习2021年10月2日.aaa001初期学习集合;

import java.util.Scanner;

/**
 * 2021年9月6日22:26:18，这里输入语句是需要导包的
 * 1.导包  2.建立系统变量名   3.定义xx.nextInt();
 */
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
        // int tall1 = Math.max(x1, x2);
        // int tall2 = Math.max(tall1, x3);
        // int tall3 = Math.max(x1, x4);
        // max函数只能比较两个int类型的数据，选择其中的较大值
        System.out.println("结果：" + tall3);
        //观察结果
    }
}
