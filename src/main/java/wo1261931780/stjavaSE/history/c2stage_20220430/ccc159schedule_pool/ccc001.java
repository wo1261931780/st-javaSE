package wo1261931780.stjavaSE.history.c2stage_20220430.ccc159schedule_pool;

import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220430.ccc159schedule_pool
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-18-39  星期六
 */
public class ccc001 {
    public static void main(String[] args) {
        ScheduledExecutorService x = Executors.newScheduledThreadPool(3);
        // 新建一个定时器的线程池

        x.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("定时器线程1");
                try {
                    Thread.sleep(20000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, 2, 2, TimeUnit.SECONDS);
        // 延迟2秒后执行，等待2秒后继续执行

        x.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("我是线程2");
                System.out.println(10 / 0);
                // 一个线程死亡，不影响其他的线程继续工作
            }
        }, 0, 2, TimeUnit.SECONDS);

        x.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("我是线程3");
            }
        }, 0, 2, TimeUnit.SECONDS);
    }
}
