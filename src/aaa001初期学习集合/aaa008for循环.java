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

public class aaa008for循环 {
    public static void main(String[] args) {
        Scanner b11 = new Scanner(System.in);
        System.out.println("需要循环多少遍：");

        int xx = b11.nextInt();
        int i = 1;
        for (System.out.println("开始循环"); i <= xx; i = i + 1) {
            System.out.println("循环第" + i + "遍");
        }
        System.out.println("循环结束----------------------------");
    }
}
