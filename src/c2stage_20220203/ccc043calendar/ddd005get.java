package c2stage_20220203.ccc043calendar;
/*
    Calendar 为特定瞬间与一组日历字段之间的转换提供了一些方法，并为操作日历字段提供了一些方法
    Calendar 提供了一个类方法 getInstance 用于获取这种类型的一般有用的对象，该方法返回一个 Calendar 对象，
    其日历字段已使用当前日期和时间初始化：Calendar rightNow = Calendar.getInstance();
 */

import java.util.Calendar;

public class ddd005get {
    public static void main(String[] args) {
        System.out.println("开始运行");
        // 方法通过多态的形式创建一个对象
        // 2021年10月3日10:34:06
        Calendar x = Calendar.getInstance();
        // 该方法为抽象类，那么需要的实际上是该对象的子类/孙子类
        // System.out.println(x);
        // 获取得到一串具体信息
        // WEEK_OF_YEAR=41,WEEK_OF_MONTH=2,DAY_OF_MONTH=3,DAY_OF_YEAR=276,DAY_OF_WEEK=1
        // 上面的操作，相当于用calendar构造方法，创建了一个日历对象x
        // public int get?(int field)
        int yy = x.get(Calendar.YEAR);
        int mm = x.get(Calendar.MONTH);
        int dd = x.get(Calendar.DAY_OF_WEEK);
        // 上面的操作，实际上是根据给出的x来获取时间
        // 相当于我的时间已经设定好了，根据你要的结果，我直接get就可以
        System.out.println(yy + "year---" + mm + "month---" + dd + "DAY_OF_WEEK");
        // DAY_OF_WEEK按照周日作为第一天

    }
}
