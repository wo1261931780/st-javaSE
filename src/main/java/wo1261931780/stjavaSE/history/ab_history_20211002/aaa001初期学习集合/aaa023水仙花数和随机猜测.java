package wo1261931780.stjavaSE.history.ab_history_20211002.aaa001初期学习集合;

import java.util.Random;
import java.util.Scanner;

public class aaa023水仙花数和随机猜测 {
	public static void main(String[] args) {
		Random b2 = new Random();
		int xr = b2.nextInt(1000);
		Scanner b1 = new Scanner(System.in);
		// int xx = b1.nextInt();
		int x1 = xr % 10;
		int x2 = xr / 10 % 10;
		int x3 = xr / 100;
		int xs = 0;
		/*不断猜测数字
		while(true){
		System.out.println("请输入具体数字：");
		int xx = b1.nextInt();
			if(xx > xr){
				System.out.println("偏大");
				xs++;
			}else if(xx < xr){
				System.out.println("偏小");
				xs++;
			}else {
				System.out.println("正确");
				System.out.println("猜测次数："+xs);
				break;
			}
		}*/
		/*
		while(true){
			System.out.println("开始计算：");
			int xx = b1.nextInt();
			if(xx < x1*x1*x1+x2*x2*x2+x3*x3*x3){
				System.out.println("小");
			}else if(xx > x1*x1*x1+x2*x2*x2+x3*x3*x3){
				System.out.println("大");
			}else{
				System.out.println("正确");
				break;
		}

		}*/
		// 下面的计算没问题，问题数字是随机的，一开始就不是水仙花数
		for (System.out.println("测试计算开始："); xs < 1000; xs++) {
			if (xr == x1 * x1 * x1 + x2 * x2 * x2 + x3 * x3 * x3) {
				System.out.println("得到水仙花数" + xr);
				System.out.println("计算次数" + xs);
				xr = b2.nextInt(1000);
			} else {
				xr = b2.nextInt(1000);
			}
		}
		System.out.println("测试结束");
        /*
        多行注释，直接Ctrl+shift+/
        Ctrl+alt+space，直接弹出辅助输入框
        1
        2
        3
        */
	}

	public static void show() {
		int i = 0;
		int gi = i % 10;
		int si = i / 10 % 10;
		int bi = i / 100;
		for (System.out.println("show me sm"); i < 1000; i++) {
		}
	}
}
