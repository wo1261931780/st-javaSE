package aaa001初期学习集合;//package aaa001初期学习集合;

import java.util.Scanner;

/*
public class b11{
	public static void main(String[] args){
		System.out.println("请输入数值：");
		Scanner b11 = new Scanner(System.in);

		int xx = b11.nextInt();
		int i = xx;
		for(System.out.println("开始数据为：" + i); xx > 0 ; i = xx + i){
			xx = xx - 1;
		}
		System.out.println("数据的阶乘是：" + i);
	}
}
*/

// public class aaa008for循环 {
//     public static void main(String[] args) {
//         Scanner b11 = new Scanner(System.in);
//         System.out.println("需要循环多少遍：");
//
//         int xx = b11.nextInt();
//         int i = 1;
//         // for (System.out.println("开始循环"); i <= xx; i = i + 1) {
//         for (System.out.println("开始循环"); i <= xx; i++) {
//             System.out.println("循环第" + i + "遍");
//         }
//         System.out.println("循环结束----------------------------");
//     }
// }

// public class aaa008for循环 {
//     public static void main(String[] args) {
//         System.out.println("2021年9月7日11:17:07----");
//         Scanner xx = new Scanner(System.in);
//         System.out.println("请输入初始数据：");
//         int x1 = xx.nextInt();
//         // int x1 = 0;
//         // for (int i = 0; i < 5; i++) {
//         for (int i = 0, x2 = i; i <= x1; i++) {
//             //上面应该是分号，意味着中间可以是一个表达式
//             x2 += i;
//
//             System.out.println(i);
//             System.out.println(x1);
//             System.out.println(x2);
//             System.out.println("---");
//         }
//         System.out.println(x1);
//         //这里x1=15，而不是0，最终输出x1的值为总和
//     }
// }

public class aaa008for循环 {
    // 求偶数和，2021年9月7日14:17:41
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        System.out.println("请输入初始数据：");
        int x1 = xx.nextInt();
        for (int i = 0, x2 = i; i <= x1; i++) {
            if (i % 2 == 0) {
                x2 += i;
            }
            System.out.println(i);
            System.out.println(x1);
            System.out.println("偶数求和结果：" + x2);
            System.out.println("---");
        }
        System.out.println(x1);
    }
}
