package c2stage_20220203.ccc040api_date;

import java.util.Date;
/**
 目标：学会使用Date类处理时间，获取时间的信息
 */
public class ccc001date {
    public static void main(String[] args) {
        Date x = new Date();
        System.out.println("时间是：" + x);//时间是：Thu Feb 03 23:03:22 CST 2022
        long x1 = x.getTime();//直接获取当前时间的毫秒值，1643900602715
        System.out.println(x1);//1643900602715
        System.out.println("**********************");
        // 其实每次命令执行都是有时间的，为什么这个时间没有计算进入毫秒值
        Date x2 = new Date();
        x2.setTime(x1);//这里set可以直接使用毫秒值，也可以使用new出来的默认date
        System.out.println(x2);//Thu Feb 03 23:03:22 CST 2022
        //实际上，是新建了一个date类型的对象
        // 而这个date类型的，内部有get/set方法
        Date x3 = new Date(x1);//直接传入一个确定的时间作为参数，进行设置
        System.out.println(x3);
    }
}
