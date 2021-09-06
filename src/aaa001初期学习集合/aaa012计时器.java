package aaa001初期学习集合;
/*跳转控制语句。
public class b11{
	public static void main(String[] args){
		System.out.println("测试结果");
		for(int i = 1;i < 6;i++){
			if(i %2 == 0){
				continue;
				//break;
			}System.out.println(i);
		}
	}
}*/

import java.util.Scanner;

//自动计时器，输入时间，自动显示倒计时
public class aaa012计时器 {
    public static void main(String[] args) {
        Scanner b11 = new Scanner(System.in);
        System.out.println("请输入时间：");
        int minute = b11.nextInt();
        //int minute = 0;
        int hours = 0;
        if (minute > 61) {
            System.out.println("时间错误，请重新输入");
        } else {
            for (System.out.println("开始计时---------"); hours < 24; minute++) {
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
    }
}
