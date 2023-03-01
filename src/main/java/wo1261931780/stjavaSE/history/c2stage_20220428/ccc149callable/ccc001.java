package wo1261931780.stjavaSE.history.c2stage_20220428.ccc149callable;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220426
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-19-47  星期四
 */
public class ccc001 {
    public static void main(String[] args) {
        // 文档中说明，是concurrent，属于并发——多线程同时执行
        Callable<String> x = new demo();
        // x.call()
        // 不能直接调用call方法，需要等待线程执行完毕
        FutureTask<String> x1 = new FutureTask<>(x);// 实际是runnable的子类
        // 相当于，创建了一个未来对象，用这个对象来接收callable类，接收线程得到的结果
        Thread th = new Thread(x1);
        // 创建线程，开始线程的任务
        th.start();// 按下开始按钮，开始执行任务
        try {
            String res = x1.get();
            System.out.println("我是执行结果：" + res);
        } catch (Exception e) {
            // throw new RuntimeException(e);
            e.printStackTrace();// 打印异常结果
        }
    }
}

class demo implements Callable {
    private int n;

    // private ccc038demo() {
    // }

    demo x = new demo();

    public demo getInstance() {// 单例设计模式，懒汉模式
        return x;
    }


    @Override
    public String call() throws Exception {
        int demo = 0;
        for (int i = 0; i < n; i++) {
            demo += i;
        }
        return "展示结果：" + demo;
    }
}
