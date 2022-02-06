package c2stage_20220203.ccc047datetimeformat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ccc001datetimeformat {
    public static void main(String[] args) {
        LocalDateTime x = LocalDateTime.now();
        System.out.println("默认的时间对象" + x);
        DateTimeFormatter x1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EEE a");
        System.out.println("格式化器：" + x1.format(x));
        System.out.println("日期对象逆向格式化：" + x.format(x1));
        // ******************************************************
        DateTimeFormatter string_x = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");//这里的时间必须按照指定格式设置，如果单纯按照2020-11-11，会报错
        LocalDateTime xx = LocalDateTime.parse("2020-11-11 11:11:11", string_x);//注释见上文
        System.out.println("获取当年的天数：" + xx.getDayOfYear());
    }
}
