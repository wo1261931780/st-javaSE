package wo1261931780.stjavaSE.history.c2stage_20220428.ccc152thread_safe;

import javax.sound.midi.Soundbank;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220428.ccc152thread_safe
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-15-52  星期五
 */
public class ccc002acc {
    private String name;
    private int balance;

    public ccc002acc() {
    }

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

    /*
     * 取钱方法
     */
    public void drawmoney(int i) {
        String acc_name = Thread.currentThread().getName();
        if (this.balance >= i) {
            System.out.println("账户余额充足");
            // this.setBalance(this.getBalance() - i);
            this.balance -= i;
            System.out.println(acc_name + "，取钱结束" + i);
        }
    }
}
