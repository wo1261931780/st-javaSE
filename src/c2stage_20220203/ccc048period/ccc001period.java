package c2stage_20220203.ccc048period;

import java.time.LocalDate;
import java.time.Period;

public class ccc001period {
    public static void main(String[] args) {
        LocalDate x = LocalDate.now();//首先获取一个当前的时间
        System.out.println("输出：" + x);
        LocalDate bd = LocalDate.of(1996, 11, 22);//然后设置一个指定时间
        System.out.println("生日：" + bd);
        Period xx = Period.between(bd, x);//第二个参数减去第一个参数
        //period获取两个时间的差值
        System.out.println("年：" + xx.getYears());
        // 年：25
        System.out.println("月：" + xx.getMonths());
        // 月：2
        System.out.println("日：" + xx.getDays());
        // 日：15
        // *********************************************************
        System.out.printf("自定义时间：%d年%d月%d日", xx.getYears(), xx.getMonths(), xx.getDays());

    }
}
