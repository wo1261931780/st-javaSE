package c2stage_20220403.ccc106by_exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220403.ccc106by_exceptions
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-17-21  星期日
 */
public class ccc001yc {
    public static void main(String[] args) throws ParseException {
        String x = "2022年4月3日17:21:56";
        SimpleDateFormat x1 = new SimpleDateFormat("yyyy年MM月dd日HH:mm:SS");
        Date demo = x1.parse(x);//正常运行过程中，代码是没问题的，但是java为了提醒程序员，就设置一个异常
        System.out.println(demo);
        // 日期的解析，相当于我新建一个日期的解析器
        // 然后这个解析器调用解析方法，解析固定的字符串
    }
}
