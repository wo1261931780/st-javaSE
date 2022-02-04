package c2stage_20220203.ccc041api_simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ccc001simpledateformate {
    public static void main(String[] args) {
        Date x = new Date();//新建一个日期对象
        System.out.println("默认时间：" + x);
        // SimpleDateFormat x1 = new SimpleDateFormat("yyyy+MM+dd+HH+mm+ss EEE a");
        SimpleDateFormat x1 = new SimpleDateFormat("yyyy年MM月dd日-----HH时mm分ss秒 EEE a");//然后新建一个构造器对象
        String time_format = x1.format(x);//构造器调用内部的方法，来格式化日期对象
        System.out.println(time_format);

    }
}
