package c2stage_20220428.ccc154thread_synchronize_method;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220428.ccc154thread_synchronize_method
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-21-05  星期五
 */
public class ccc001account {
    private double balance;

    private final Lock x = new ReentrantLock();
    // 将其设置为不可修改的常量


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public synchronized void drawmoney(int i) {// 线程安全，作为修饰符，避免出现异常

        x.lock();// 直接对代码的执行进行上锁和解锁，使用过程更加灵活
        try {
            if (this.getBalance() >= i) {
                System.out.println(Thread.currentThread().getName() + "取钱成功");
                this.balance -= i;
            }
        } finally {
            x.unlock();
            // 放到代码中间，避免出现问题
        }
        // x.unlock();
        // 这里有个问题，
        // 如果代码运行过程中报错，可能程序死亡，导致后续的进程无法解锁，出现死锁的情况


    }
}
