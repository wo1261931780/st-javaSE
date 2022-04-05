package c2stage_20220404.ccc113stage_project.src.java.bean;

/**
 * Created by Intellij IDEA.
 * Project:demo_project
 * Package:bean
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-22-51  星期一
 */
public class ccc002user {
    private String name;
    private int tel;
    private String account;
    private String password;
    private String sex;
    private double balance;

    public ccc002user() {
    }

    public ccc002user(String name, int tel, String account, String password, String sex, double balance) {
        this.name = name;
        this.tel = tel;
        this.account = account;
        this.password = password;
        this.sex = sex;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "ccc002user{" +
                "name='" + name + '\'' +
                ", tel=" + tel +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", balance=" + balance +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
