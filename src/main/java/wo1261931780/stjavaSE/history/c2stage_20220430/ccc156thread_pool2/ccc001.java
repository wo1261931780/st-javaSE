package wo1261931780.stjavaSE.history.c2stage_20220430.ccc156thread_pool2;

import java.util.concurrent.Callable;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220430.ccc156thread_pool2
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-10-42  星期六
 */
public class ccc001 implements Callable {
    private int num;

    public ccc001(int num) {
        this.num = num;
    }

    @Override
    public String call() throws Exception {
        int demo=num;
        for (int i = 0; i < demo; i++) {
            num += i;
        }
        return Thread.currentThread().getName() + "执行的结果为：" + num;
    }
}
