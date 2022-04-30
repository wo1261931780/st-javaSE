package c2stage_20220430.ccc157thread_pool_excutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220430.ccc157thread_pool_excutor
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-11-42  星期六
 */
public class ccc001 {
    public static void main(String[] args) {
        ExecutorService x = Executors.newFixedThreadPool(3);
        // 源码：
        // new ThreadPoolExecutor(nThreads, nThreads,
        //                        0L, TimeUnit.MILLISECONDS,
        //                        new LinkedBlockingQueue<Runnable>());
        x.execute(() -> System.out.println(Thread.currentThread().getName() + "线程启动"));
        x.execute(() -> System.out.println(Thread.currentThread().getName() + "线程启动"));
        x.execute(() -> System.out.println(Thread.currentThread().getName() + "线程启动"));
        x.execute(() -> System.out.println(Thread.currentThread().getName() + "线程启动"));
        // 因为核心线程和最大线程固定，所以不会多出第四个线程，出现拥塞现象
        // 如果任务无限叠加，那么就会出现内存溢出
        // executor创建线程，会出现线程数量不可控，需要人为干预，
        // 在阿里巴巴规约中，明确禁止直接创建此类线程池

    }
}
