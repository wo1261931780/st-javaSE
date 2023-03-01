package wo1261931780.stjavaSE.history.c2stage_20220430.ccc155thread_pool;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220430.ccc155thread_pool
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-10-16  星期六
 */
public class ccc002 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "的执行结果" + i);
            try {
                System.out.println(Thread.currentThread().getName() + "开始休眠");
                Thread.sleep(100000000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
