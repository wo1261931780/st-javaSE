package aaa001初期学习集合;
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
    //生成随机数，并根据输入进行判断大小
    public static void main(String[] args) {
        Random b11 = new Random();
        Scanner b22 = new Scanner(System.in);
        int xx = b11.nextInt(100);
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

    }
}
