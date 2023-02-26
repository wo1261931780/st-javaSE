package c2stage_20220428.ccc154thread_synchronize_method;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220428.ccc154thread_synchronize_method
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-21-06  星期五
 */
public class ccc002thread extends Thread {
    ccc001account demo_acc = new ccc001account();

    public ccc002thread() {
    }

    public ccc002thread(ccc001account demo_acc) {
        this.demo_acc = demo_acc;
    }

    @Override
    public void run() {
        demo_acc.drawmoney(10000);
        System.out.println("输出成功");
    }
}
