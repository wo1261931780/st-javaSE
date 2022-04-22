package c2stage_20220421.ccc146thread_runnable;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220421.ccc146thread_runnable
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-22-37  星期五
 */
public class ccc001 {
    public static void main(String[] args) {
        Runnable x = new demo();// 这里创建的是一个任务对象，而不是线程本身
        Thread x1 = new Thread(x);// 创建线程的时候，把我需要处理的任务，交给线程处理
        x1.start();// 然后启动
        for (int i = 0; i < 5; i++) {
            System.out.println("我是主线程");
        }
        // 这里的处理，就会出现主线程和子线程交替执行的情况
        // 原来优先执行，可能也是因为方法体占用的内存不一致
    }
}

class demo implements Runnable {
    // 因为是实现类，所以可以继承别的类
    // 同时可以多个实现，相对来说，子类的功能更加强大
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("我是子线程");
        }
    }
    // 相比来说吗，这里不是在创建线程，
    // 而是在创建可以被线程使用的任务类
    // 只不过这个任务类，重写了线程接口
}
