package c2stage_20220430.ccc156thread_pool2;

import java.util.concurrent.*;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220430.ccc156thread_pool2
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-10-46  星期六
 */
public class ccc002thread_pool {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService x = new ThreadPoolExecutor(3, 5, 6, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5), new ThreadPoolExecutor.AbortPolicy());
        // ccc001 c1=new ccc001(100);
        // Future<String> f1=new CompletableFuture<>();
        Future res = x.submit(new ccc001(10));
        System.out.println(res.get());
    }
}
