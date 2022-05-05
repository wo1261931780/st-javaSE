package c2stage_20220430.ccc158timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220430.ccc158timer
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-15-22  星期六
 */
public class ccc001timer {
    public static void main(String[] args) {
        Timer x = new Timer();
        x.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(new Date() + "我是定时器");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, 2000, 3000);

        // delay等待几秒开始执行
        // 执行完毕等待几秒进行下一次
        x.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(new Date() + "我是定时器2");
            }
        }, 2000, 3000);
        // Sat Apr 30 18:30:14 CST 2022我是定时器
        // Sat Apr 30 18:30:19 CST 2022我是定时器2
        // Sat Apr 30 18:30:19 CST 2022我是定时器
        // 上面因为线程睡眠，导致线程2无法开始，进而导致定时器没有按照规定时间开始执行任务
        // 同时，因为所有的定时器都是单个线程执行
        // 一旦出现异常，就会造成整个线程的死亡
    }
}
