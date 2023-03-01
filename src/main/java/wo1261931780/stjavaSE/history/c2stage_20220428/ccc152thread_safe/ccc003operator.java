package wo1261931780.stjavaSE.history.c2stage_20220428.ccc152thread_safe;

import java.util.concurrent.Callable;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220428.ccc152thread_safe
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-15-57  星期五
 */
public class ccc003operator implements Callable {
    private ccc002acc demo_acc;

    public ccc003operator() {
    }

    public ccc003operator(ccc002acc demo_acc) {
        this.demo_acc = demo_acc;
    }

    @Override
    public Object call() throws Exception {
        //callable接口，和另外两种线程的主要差别在于执行的方法
        // 这里使用的是call方法，方法自带了返回类型，
        // 也因此可以指定返回的结果，进而进行接收
        // 继承thread类和实现runnable接口，两个都是重写没有返回值的run方法，所以没有结果
        demo_acc.drawmoney(100000);
        return null;
    }
}
