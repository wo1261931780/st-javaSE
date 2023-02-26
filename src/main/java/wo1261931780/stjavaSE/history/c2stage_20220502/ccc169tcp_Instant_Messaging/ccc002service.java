package c2stage_20220502.ccc169tcp_Instant_Messaging;

import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220502.ccc169tcp_Instant_Messaging
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-10-49  星期一
 */
public class ccc002service {
    public static ExecutorService pool = new ThreadPoolExecutor(3,
                                                                5,
                                                                5,
                                                                TimeUnit.SECONDS,
                                                                new ArrayBlockingQueue<>(5),
                                                                Executors.defaultThreadFactory(),
                                                                new ThreadPoolExecutor.AbortPolicy());
    public static List<Socket> allonlinesoc = new ArrayList<>();

    public static void main(String[] args) {
        try {
            ServerSocket   x      = new ServerSocket(7777);
            while (true) {
                Socket         accept = x.accept();
                ccc003runnable target = new ccc003runnable(accept);
                pool.execute(target);
                allonlinesoc.add(accept);    // 所有已经接收的管道全部拿进来
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
