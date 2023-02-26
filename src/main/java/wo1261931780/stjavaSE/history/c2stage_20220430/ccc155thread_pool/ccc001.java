package c2stage_20220430.ccc155thread_pool;

import java.util.concurrent.*;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220429
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-21-35  星期五
 */
public class ccc001 {
    public static void main(String[] args) {

        //     public ThreadPoolExecutor(int corePoolSize,
        //                               int maximumPoolSize,
        //                               long keepAliveTime,
        //                               TimeUnit unit,
        //                               BlockingQueue<Runnable> workQueue,
        //                               ThreadFactory threadFactory,
        //                               RejectedExecutionHandler handler)

        ExecutorService x = new ThreadPoolExecutor(3, 5, 6, TimeUnit.SECONDS, new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        // new ThreadPoolExecutor.CallerRunsPolicy()
        // 上面直接由主线程执行run方法，绕过线程池执行
        Runnable r1 = new ccc002();
        x.execute(r1);
        x.execute(r1);
        x.execute(r1);
        // 上面三个核心线程进入休眠
        x.execute(r1);
        x.execute(r1);
        x.execute(r1);
        x.execute(r1);
        x.execute(r1);
        // 五个任务队列全部填满
        x.execute(r1);// 开始创建临时线程，出现第四个线程名pool-1-thread-4
        // x.execute(r1);
        // x.execute(r1);
        // 这里出现异常，也只是拒绝新的任务，并不会终止程序的运行
        // [Running, pool size = 5, active threads = 5, queued tasks = 5, completed tasks = 0]
        // 运行中，最大线程5，激活线程5，任务队列5，已经完成的任务0

        x.shutdownNow();// 直接关闭线程池，如果有睡眠的线程，也会丢失
        x.shutdown();// 等待所有线程执行完毕再关掉
    }
}
