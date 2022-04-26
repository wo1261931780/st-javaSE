package c2stage_20220426.ccc149thread;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220426
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-21-22  星期二
 */
public class ccc001 {
    public static void main(String[] args) {
        ccc002 x = new ccc002();
        Thread demo = new Thread(x);
        demo.start();
        System.out.println("------------------------------------");
        // Thread x1 = new Thread(new ccc002());
        // new Thread(new ccc002()).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是线程2");
            }
        }).start();
        System.out.println("------------------------------------");
        new Thread(() -> System.out.println("我是线程3")).start();
        System.out.println("------------------------------------");
    }


}

class ccc002 implements Runnable {
    @Override
    public void run() {
        // 主要原因是run方法为void，没有返回值，所以不能拿到结果
        // 简单来说，只有执行的功能
        System.out.println("我是实现类");
    }
}
