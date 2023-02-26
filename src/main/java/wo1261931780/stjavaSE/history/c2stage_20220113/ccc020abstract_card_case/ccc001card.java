package c2stage_20220113.ccc020abstract_card_case;

public abstract class ccc001card {
    private String name;
    // private int balance;//余额都是两位小数，以后要注意
    private double balance;//余额都是两位小数，以后要注意

    // public abstract void card();

    public abstract void pay(double prices) ;
    // {
        // System.out.println("pay something" + prices);
        // System.out.println("balance" + (this.balance-prices));
    // }
    // 抽象方法没有方法体


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
