package wo1261931780.stjavaSE.history.ab_history_20211002.aaa001初期学习集合;
/*
    方法：是将具有独立功能的代码块组织成为一个整体，使其具有特殊功能的代码集
    定义格式：
        public static void 方法名 ( ) {
	        //方法体
	    }
	调用格式：
	    方法名();
 */

import java.util.Scanner;

public class aaa036形参和实参 {
    public static void main(String[] args) {
        // 可以不传递参数，直接调用方法
        showdemo();
        //但是要注意，不带参数的方法，括号内部为空
        System.out.println("------------------------------------------------");
        //调用方法的时候是实参
        max(10, 20);
        // max方法中，传递的两个数字10和20就是实参
        // 如果调用方法中，传递的是number这个变量，那么number也算实参
        // ------------------------------------------------

        // 调用方法，直接使用方法名，然后括号内传递参数即可
        //传参的时候，参数的类型和数量必须一致，否则会出错
        Scanner xx = new Scanner(System.in);
        System.out.println("请输入具体数字：");
        int pn = xx.nextInt();
        divides(pn);
        System.out.println("执行完毕");
    }

    public static void showdemo() {
        int a = 11;
        String b = "我是不带参数的方法";
        System.out.println(a + b);
    }

    /**
     * 下面定义方法int xx的时候是形参
     */
    public static void max(int xx, int x2) {
        System.out.println("我是带参数的方法，比较大小");
        if (xx > x2) {
            System.out.println("最大值为" + xx);
        } else {
            System.out.println("最大值为" + x2);
        }
        //定义方法，方法的名称可以随便改
        /*
        Scanner xx = new Scanner(System.in);
        System.out.println("请输入数字：");
        int x1 = xx.nextInt();
        if(x1%2 == 0){
            System.out.println("偶数");
        }else {
            System.out.println("奇数");
        }
        System.out.println("运行结束");*/
        /*int[] arr = {131, 1, 233};
        int x = 0;
        int max = 0;
        for (System.out.println("开始比较"); x < arr.length; x++)
            if (x1 > arr[x]) {
                max = x1;
            } else {
                max = arr[x];
            }
        System.out.println("最大值为：" + max);*/
    }

    /**
     * 方法中的参数，就是形参，例如下面的number
     */
    public static void divides(int number) {
        if (number % 2 == 0 && number > 0) {
            System.out.println(number + "为偶数");
        } else if (number % 2 == 1 && number > 0) {
            System.out.println(number + "为奇数");
        } else {
            // while (number < 0) {
            System.out.println("数据错误，请重新输入");
            // break;
            // }
        }
    }
}
