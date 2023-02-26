package wo1261931780.stjavaSE.history.ab_history_20211002.bbb012构造器和this;

public class bbb019构造器 {
    String name;
    int price;

    public bbb019构造器(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void race(String name) {
        System.out.println("成员变量中的" + this.name + "正在和传递过来的" + name + "比赛");
    }
}
