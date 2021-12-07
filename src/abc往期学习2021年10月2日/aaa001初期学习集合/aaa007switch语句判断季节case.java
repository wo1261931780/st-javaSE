
package abc往期学习2021年10月2日.aaa001初期学习集合;

import java.util.Random;
import java.util.Scanner;

public class aaa007switch语句判断季节case {
    public static void main(String[] args) {
        Scanner b11 = new Scanner(System.in);
        System.out.println("输入月份：");
        int xx = b11.nextInt();
        // switch (xx) {
        //switch内部跟一个表达式，然后大括号后面是判断语句

        switch (xx) {
            // case 1:
            //     System.out.println("星期一");
            //     break;
            // case 2:
            //     System.out.println("星期二");
            //     break;
            // case 3:
            //     System.out.println("星期三");
            //     break;
            // case 4:
            //     System.out.println("星期四");
            //     break;
            // case 5:
            //     System.out.println("星期五");
            //     break;
            // case 6:
            //     System.out.println("星期六");
            //     break;
            // case 7:
            //     System.out.println("星期天");
            //     break;
            case 1:
            case 2:
            case 3:
                System.out.println("春季");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("夏季");
                break;
            //这里需要一个说明，
            //456同时是夏季，但是45月份没有break，所以程序继续执行到6，出现夏季的提示，然后break结束
            //如果将break去除，那么程序会继续运行到9月份提示出现，然后结束
            //专业名词，case穿透
            case 7:
            case 8:
            case 9:
                System.out.println("秋季");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("冬季");
                break;
            default:
                //所有语句不匹配，默认执行default
                System.out.println("时间错误，程序结束");
                // break;
                //break就直接结束，最后的default可以直接省略，2021年9月7日11:02:05
        }
        show();
    }

    public static void show() {
        Random random = new Random();
        int x = random.nextInt(200);
        switch (x) {
            case 1:
            case 2:
                System.out.println("show");
                break;
            default:
                System.out.println(x+"error");
                break;
        }
    }
}
