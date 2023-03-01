package wo1261931780.stjavaSE.history.c2stage_20220428.ccc150thread_methods;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220428.ccc150thread_methods
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-20-46  星期四
 */
public class ccc002thread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            // System.out.println("子线程：" + i);
            System.out.println(Thread.currentThread().getName() + "线程正在执行");
            // 直接获取当前线程和线程对象的名称
        }
    }
    public ccc002thread() {
    }

    public ccc002thread(String name) {
        super(name);
    }
}
