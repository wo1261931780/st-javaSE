package wo1261931780.stjavaSE.history.c2stage_20220428.ccc154thread_synchronize_method;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220428.ccc154thread_synchronize_method
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-21-09  星期五
 */
public class ccc003rundemo {
    public static void main(String[] args) {
        ccc001account x = new ccc001account();
        x.setBalance(10000);
        ccc002thread t1 = new ccc002thread(x);
        t1.start();
    }
}
