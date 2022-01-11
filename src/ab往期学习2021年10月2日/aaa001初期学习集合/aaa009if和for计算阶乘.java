package ab往期学习2021年10月2日.aaa001初期学习集合;

import java.util.Scanner;

public class aaa009if和for计算阶乘 {
    public static void main(String[] args) {
        Scanner b11 = new Scanner(System.in);
        System.out.println("输入数据");
        int i = b11.nextInt();
        //1-5进行排序，然后倒过来再排一遍。-------------------------
		/*for(System.out.println("开始输出");i <= 5;i++){
			System.out.println("i = "+i);
		}
		//else(System.out.println("输入错误"));
		//i = 5;
		for(System.out.println("倒置----------");i > 0;i--){
			System.out.println("i = "+i);
		}
		//else(System.out.println("输入错误"));
		System.out.println("结束");
		*/
        //这里是求输入值的阶乘。-----------------------------------
		/*
		int xx = i;
		for (System.out.println("输入数据为："+i);i > 0;xx += i){
			i--;
		}
		System.out.println("输入数据的阶乘是：" + xx);*/
        //求偶数和--------------------------------------------------
        if (i > 0) {
            if (i % 2 == 1) {
                int x1 = i;
                //System.out.println("输入的数据"+ i +"是奇数");
                for (System.out.println("输入的数据" + x1 + "是奇数"); i > 1; x1 += i) {
                    i = i - 2;
                }
                System.out.println("数据以下的奇数阶乘为" + x1);
            } else {
                int x2 = i;
                for (System.out.println("输入的数据" + x2 + "为偶数"); i > 0; x2 += i) {
                    i = i - 2;
                }
                System.out.println("数据以下的偶数阶乘为" + x2);
            }
        } else {
            System.out.println("数据错误");
        }
        System.out.println("计算结束");
    }
}
