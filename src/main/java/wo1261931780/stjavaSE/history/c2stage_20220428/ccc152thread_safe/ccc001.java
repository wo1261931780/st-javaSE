package wo1261931780.stjavaSE.history.c2stage_20220428.ccc152thread_safe;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220428.ccc152thread_safe
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-15-51  星期五
 */
public class ccc001 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ccc002acc x1 = new ccc002acc();
        x1.setBalance(100000);

        // Thread t1 = new Thread(() -> x1.setBalance(0));
        // t1.start();
        // ccc003operator t1 = new ccc003operator();
        // 一开始没有使用带参构造，因此无法执行call方法
        ccc003operator t1 = new ccc003operator(x1);
        ccc003operator t2 = new ccc003operator(x1);
        FutureTask f1 = new FutureTask(t1);
        FutureTask f2 = new FutureTask(t2);
        System.out.println("线程开始");
        // 这里没有并发安全问题，因为要第一个线程接收到结果才会开始执行同类型的线程
        new Thread(f1).start();
        new Thread(f2).start();
        System.out.println(f1.get());
        System.out.println(x1.getBalance());//-100000,出现并发修改异常
    }
}
