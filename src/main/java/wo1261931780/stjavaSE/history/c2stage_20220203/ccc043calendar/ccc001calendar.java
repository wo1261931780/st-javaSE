package c2stage_20220203.ccc043calendar;

import java.util.Calendar;
import java.util.Date;

public class ccc001calendar {
    public static void main(String[] args) {
        Calendar x = Calendar.getInstance();//相当于我新建了一个日历对象x
        // 日历的本质是，可变日期对象
        System.out.println(x);//time=1644037567997,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=31,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=5,DAY_OF_YEAR=36,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=1,HOUR_OF_DAY=13,MINUTE=6,SECOND=7,MILLISECOND=997,ZONE_OFFSET=28800000,DST_OFFSET=0
        // 直接输出，会得到日历中的所有信息，但是我们只需要其中的一部分

        int c_yaer = x.get(Calendar.YEAR);//获取日历中的year数据
        // 然后将int类型的year数据赋值给c_year这个变量
        System.out.println("今年:" + c_yaer);
        System.out.println("未修改时间：" + x.getTimeInMillis());
        // boolean xx = x.getTimeInMillis() == x.get(Calendar.time());
        // 源代码：
        // protected long time;
        // time本身是存在日历中的，但是修饰符为protect，无法直接访问
        // 最关键的是，源代码没看明白
        // System.out.println(xx);

        x.add(Calendar.MONTH, 55);//对日期进行增加操作

        System.out.println(x.get(Calendar.YEAR));//即使增加了时间，前面展示的时间仍然是不变的
        System.out.println(x.get(Calendar.YEAR));//但是后面的所有时间，因为基于同一个对象，所以会发生改变

        Date demo_date = x.getTime();//gettime方法，得到的是一个final常量
        System.out.println(demo_date);//这个常量
        long demo_ss = x.getTimeInMillis();
        System.out.println("时间毫秒值：" + demo_ss);


    }
}
