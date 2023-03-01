package wo1261931780.stjavaSE.history.c2stage_20220428.ccc153thread_synchronize;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220428.ccc153thread_synchronize
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-17-17  星期五
 */
public class ccc002thread extends Thread {
    private ccc001acc demo_acc;

    public ccc002thread() {
    }

    public ccc002thread(ccc001acc demo_acc) {
        this.demo_acc = demo_acc;
    }

    @Override
    public void run() {
        System.out.println("我是线程"+Thread.currentThread().getName());
        demo_acc.drawmoney(10000);
        System.out.println("余额为："+demo_acc.getBalance());
    }
}
