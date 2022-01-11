package c二阶段强化课程2022年1月11日.ccc039simpledate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ccc001test_run {
    public static void main(String[] args) throws ParseException {
        System.out.println("开始执行");
        Date x = new Date();
        // SimpleDateFormat x1 = new SimpleDateFormat();
        SimpleDateFormat x1 = new SimpleDateFormat("yyyy" + "年" + "\t" + "MM" + "月" + "\t" + "dd" + "日" + "\t" + "HHmmss");
        String x2 = x1.format(x);
        System.out.println(x2);
        // 1.我先创建一个毫秒数表示的时间
        // 2.使用固定命令对其格式化
        // 3.将格式化的结果用一个字符串接收
        // 4.展示结果
        // -----------------------------------------------------
        // -----------------------------------------------------
        // -----------------------------------------------------
        String xx = "2020-02-02 11-11-11";
        SimpleDateFormat x3 = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        Date x4 = x3.parse(xx);
        // 添加异常到方法声明，
        // throws ParseException
        // 去除报错信息
        System.out.println(x4);
        // 1.获得字符串
        // 2.根据字符串xx的格式，设置时间的解析格式x3
        // 3.用x3解析字符串xx
        // 然后用x4接收结果


    }
}
