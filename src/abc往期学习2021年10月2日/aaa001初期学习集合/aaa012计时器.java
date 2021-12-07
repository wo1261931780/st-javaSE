package abc往期学习2021年10月2日.aaa001初期学习集合;

// 跳转控制语句。
// public class aaa012计时器 {
//     public static void main(String[] args) {
//         System.out.println("测试结果");
//         for (int i = 1; i < 6; i++) {
//             if (i % 2 == 0) {
//                 continue;
//                 // 跳过循环内容，直接执行下一次循环
//                 // for(){
//                 // continue;
//                 // xx++;
//                 // }
//                 // 这个时候，我直接跳过xx++的命令，执行for中的判断。
//                 //continue会继续执行for中的循环
//                 //break会把循环都一起结束
//                 //break;
//             }
//             System.out.println(i);
//         }
//     }
// }

import java.util.Scanner;

/**
 * 循环嵌套，2021年9月7日16:14:45
 * 自动计时器，输入时间，自动显示倒计时
 */
public class aaa012计时器 {
    public static void main(String[] args) {
        Scanner b11 = new Scanner(System.in);
        System.out.println("请输入分钟：");
        int minute = b11.nextInt();
        //int minute = 0;
        int hours = 0;
        int twenty_four = 1;
        //如果没有定义24的来源，直接写24，那么24会变成一个魔法值（数据被写死）
        //定义后可以寻找来源，代码健壮
        int sixty = 61;
        if (minute > sixty) {
            System.out.println("时间错误，请重新输入");
        } else {
            for (System.out.println("开始计时---------"); hours < twenty_four; minute++) {
                if (minute == 60) {
                    hours++;
                    minute = 0;
                    System.out.println("时间是：" + hours + "时" + minute + "分");
                    System.out.println("一小时过去了------------------");
                } else {
                    System.out.println("时间是：" + hours + "时" + minute + "分");
                }
                //下面是简洁版，但是无法自定义输入的时间。
			/*for(System.out.println("开始计时---------");hours < 24;hours++){
				for(minute = 0;minute < 60;minute++){
					System.out.println("时间是："+hours+"时"+minute+"分");
				}*/
            }
            System.out.println("时间上限，程序结束");
        }
        show();
    }
    public static void show(){

        int minutes=59;
        int day=2;
        Scanner x=new Scanner(System.in);
        System.out.println("please type your article:");
        int i = x.nextInt();
        for (int hour=0;hour<day;i++){
//            System.out.println("show me the time");
            if (i>minutes){
                i=0;
                hour++;
                System.out.println(hour+":"+i);
            }else {
//                i++;
                System.out.println(hour+":"+i);
            }
        }
    }
}
