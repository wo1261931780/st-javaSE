package c2stage_20220502.ccc168tcp_thread_pool;

import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;

import java.util.concurrent.*;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220502.ccc168tcp_thread_pool
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-09-52  星期一
 */
public class ccc002service {
    public static ExecutorService x = new ThreadPoolExecutor(3,
            5,
            6,
            TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(5),
            Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) throws IOException {
        ServerSocket soc = new ServerSocket(7777);

        while (true) {
            Socket demosoc = soc.accept();
            ccc003runnable target = new ccc003runnable(demosoc);    // 服务端新建线程池，然后处理拿到的线程

            x.execute(target);
        }
        // 这里是多开的情况，我默认允许3个核心线程，多出来的先等待，等待队列满了以后会使用临时线程
        // 但是临时线程优先处理哪个任务，就需要按照情况具体分析
        // 同时，我手上有6个任务，最多处理5个任务，那么新出现的任务首先会被拒绝
        // 如果这个时候还有任务在等待，同时我关闭了一个任务，那么临时线程会在存活时间内去处理等待队列中的任务
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
