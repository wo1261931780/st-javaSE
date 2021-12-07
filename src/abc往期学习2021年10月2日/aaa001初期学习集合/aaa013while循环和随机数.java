package abc往期学习2021年10月2日.aaa001初期学习集合;
 /*
import java.util.Random;

public class b11{
	public static void main(String[] args){
		Random b11 = new Random();
		int x1 = 0;
		do{
		int xx = b11.nextInt(100) +1;
			System.out.println(xx);
			x1++;
		}while(x1 < 10);
	}
}*/

import java.util.Random;
import java.util.Scanner;

public class aaa013while循环和随机数 {
    /**
     * 生成随机数，并根据输入进行判断大小
     */
    public static void main(String[] args) {
        Random b11 = new Random();
        Scanner b22 = new Scanner(System.in);
        //获取随机数，括号内是范围
        int xx = b11.nextInt(100);
        // 上面每次执行，就会生成一个随机数
        int xx2 = b11.nextInt(100) + 1;
        //上面的xx范围[0-99),xx2范围才能到1-100。
        while (true) {
            System.out.println("输入估算值：");
            int x1 = b22.nextInt();
            int xs = 0;
            //System.out.println("估算正确");
            if (x1 > xx) {
                System.out.println("估算过大");
            } else if (x1 < xx) {
                System.out.println("估算过小");
            } else {
                System.out.println("估算正确");
                break;
            }
        }
        show();
    }

    //2021年9月8日15:34:25
    // public static void main(String[] args) {
    //     System.out.println("开始猜测");
    //     Random x1 = new Random();
    //     int x2 = x1.nextInt(100) + 1;
    //     Scanner xx1 = new Scanner(System.in);
    //
    //     System.out.println("请输入数字：");
    //     int xx2 = xx1.nextInt();
    //     do {
    //         if (xx2 < x2) {
    //             System.out.println("过小");
    //             xx2 = xx1.nextInt();
    //         } else if (xx2 > x2) {
    //             System.out.println("过大");
    //             xx2 = xx1.nextInt();
    //         }
    //     } while (xx2 != x2);
    //     System.out.println("right number");
    // }
    public static void show() {
        Random x = new Random();
        int x1 = x.nextInt(200);
        Scanner x2 = new Scanner(System.in);
        do {
            int x3 = x2.nextInt();
            if (x3 > x1) {
                System.out.println("大于");

            } else if (x3 < x1) {
                System.out.println("小于");

            } else if (x3 == x1) {
                break;
            }
        } while (true);

    }


}

