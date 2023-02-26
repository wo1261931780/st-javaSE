package ab_history_20211002.aaa001初期学习集合;

import java.util.Random;
import java.util.Scanner;

public class aaa006ifelse判断是星期几 {
    public static void main(String[] args) {
		/*System.out.println("输入时间：");
		Scanner b11 = new Scanner(System.in);
		int x1 = b11.nextInt();
		if (x1 == 1){
			System.out.println("时间是：星期一");
			}else if (x1 == 2){
			System.out.println("时间是：星期二");
			}else if (x1 == 3){
			System.out.println("时间是：星期三");
			}else if (x1 == 4){
			System.out.println("时间是：星期四");
			}else if (x1 == 5){
			System.out.println("时间是：星期五");
			}else if (x1 == 6){
			System.out.println("时间是：星期六");
			}else if (x1 == 7){
			System.out.println("时间是：星期日");
			}
		else{
			System.out.println("时间错误");
		}*/
        System.out.println("小明的期末成绩：");
        Scanner b11 = new Scanner(System.in);
        int x1 = b11.nextInt();

        if (0 <= x1 && x1 <= 60) {
            System.out.println("小明被活活打死");
        } else if (60 < x1 && x1 <= 75) {
            System.out.println("小明被活活饿死");
        } else if (75 < x1 && x1 < 90) {
            System.out.println("考试结束屁股开花");
        } else if (90 < x1 && x1 <= 100) {
            System.out.println("考试结束去欧洲旅游");
        } else {
            System.out.println("分数错误。");
        }
        //数据测试：正确数据，边界数据，错误数据
        show();
		/*
		if (0 <= x1 <= 60){
			System.out.println("小明被活活打死");
		}else if (60 < x1 <= 75){
			System.out.println("小明被活活饿死");
		}else if (75 < x1 <= 90){
			System.out.println("考试结束屁股开花");
		}else if (90 < x1 <= 100){
			System.out.println("考试结束去欧洲旅游");
		}else
			System.out.println("分数错误。");*/
    }

    public static void show() {
        Random random = new Random();
        int i = random.nextInt(200);
        if (i >= 0 & i >= 100) {
            System.out.println(i);
        } else {
            System.out.println(i + "error");
        }
        System.out.println("finish");
    }


}
