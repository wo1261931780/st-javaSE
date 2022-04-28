package c2stage_20220428.ccc151timeout;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220428.ccc151
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-21-56  星期四
 */
public class ccc001 {
    // 静态方法是属于类本身的，所以直接用类名调用即可
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("我是结果：" + i);
            if (i == 3) {
                try {
                    Thread.sleep(2000);
                    // 线程休眠若干时间后继续执行
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            // 我们默认调用start启动线程，线程自己调用run方法，
            // 如果我们直接调用run方法，就类似直接调用普通方法
        }


    }
}
