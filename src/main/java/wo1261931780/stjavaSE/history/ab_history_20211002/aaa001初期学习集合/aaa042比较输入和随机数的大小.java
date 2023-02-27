package wo1261931780.stjavaSE.history.ab_history_20211002.aaa001初期学习集合;

import java.util.Random;
import java.util.Scanner;

public class aaa042比较输入和随机数的大小 {
	public static void main(String[] args) {
		Scanner b11 = new Scanner(System.in);
		Random b22 = new Random();
		System.out.println("请输入数据：");
		int xx = b11.nextInt();
		int zz = b22.nextInt(1000);
		// 一般用一个数据来接收方法的结果，不然方法无意义
		System.out.println("最大值是：" + max(xx, zz));


        /*第一次代码---------------------------------------
        //boolean zz=jo(xx);//方法的接收
        if(zz){
            System.out.println("数据是偶数");
        }else{
            System.out.println("数据不是偶数");
        }*/
		// 这里是main方法的收尾------------------------------
	}

	/**
	 * 获取最大值
	 *
	 * @param xx 数据1
	 * @param zz 数据2
	 * @return 结果
	 */
	public static double max(double xx, double zz) {
		if (xx > zz) {
			System.out.println("方法中的最大值是：" + xx);
			return xx;
		} else {
			System.out.println("方法中的最大值是：" + zz);
			return zz;
		}
	}
}
