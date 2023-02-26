package c2stage_20220428.ccc153thread_synchronize;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220428.ccc153thread_with
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-16-46  星期五
 */
public class ccc001acc {
    private String name;
    private int balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public static void show(){
        // 方法是静态的，所以所有成员都可以调用
        synchronized (ccc001acc.class){// 但是锁针对的是类名，类是唯一的，所以可以完成指定
            System.out.println("我被锁了");
        }
    }

    public void drawmoney(int i) {
        // synchronized ("demo") {
        // 这个是同步代码块，默认一把锁，不同的人都被同样的锁限制
        synchronized (this) {// this代表当前调用的对象，不同的账号，就可以同步操作
            if (this.balance >= i) {
                System.out.println("余额充足");
                this.balance -= i;
                System.out.println(Thread.currentThread().getName() + "取钱完毕");
                // 可以看出，真正有问题的是对钱的操作过程
                // 所以需要加锁
            }
        }
    }
}
