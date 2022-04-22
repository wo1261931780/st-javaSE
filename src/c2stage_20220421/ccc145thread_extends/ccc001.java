package c2stage_20220421.ccc145thread_extends;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220421
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-13-10  星期四
 */
public class ccc001 {
    public static void main(String[] args) {
        // demo x = new demo();
        Thread x = new demo();// 这样才是创建了线程对象，通过多态的方式
        System.out.println("线程开始执行");
        x.start();
        // 结果就算放到上面，也还是主线程先执行完毕
        for (int i = 0; i < 5; i++) {
            System.out.println("我是主线程----------------");
        }
        // demo x = new demo();
        // System.out.println("线程开始执行");
        // x.start();
        // 按照上下的创建顺序，最终线程也就会按照从上到下的执行顺序进行
        x.run();
        // 如果直接调用run方法，那么就是调用普通方法，没有使用到线程的特性
        // start和run其实都是执行了run方法，只不过走的路径不一样


    }
}

class demo extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("我是子线程");
        }
    }
}
