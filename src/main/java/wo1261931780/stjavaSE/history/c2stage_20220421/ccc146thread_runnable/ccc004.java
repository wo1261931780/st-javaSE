package wo1261931780.stjavaSE.history.c2stage_20220421.ccc146thread_runnable;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220421.ccc146thread_runnable
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-19-42  星期四
 */
public class ccc004 {
    public static void main(String[] args) {
        demo2 xx = new demo2();
        Thread x = new Thread(xx);
        System.out.println("线程启动了");
        x.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类");
            }
        }).start();
        // new Thread(s -> System.out.println("匿名内部类")).start();
        new Thread(() -> System.out.println("匿名内部类")).start();
        // 上面，相当于括号内就是重写方法
    }
}

class demo2 implements Runnable {

    @Override
    public void run() {
        System.out.println("我是子类");
    }
}
