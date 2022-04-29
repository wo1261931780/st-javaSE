package c2stage_20220428.ccc153thread_synchronize;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220428.ccc153thread_synchronize
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-17-18  星期五
 */
public class ccc003rundemo {
    public static void main(String[] args) {
        ccc001acc x = new ccc001acc();
        x.setBalance(10000);
        // Thread t1 = new ccc002thread(x);
        // t1.start();
        new ccc002thread(x).start();
        new ccc002thread(x).start();

    }
}
