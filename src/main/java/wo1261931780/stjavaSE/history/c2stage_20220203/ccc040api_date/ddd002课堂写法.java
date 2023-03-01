package wo1261931780.stjavaSE.history.c2stage_20220203.ccc040api_date;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ddd002课堂写法 {
    private ddd002课堂写法() {
    }

    public static String Datetostring(Date x, String format) {
        SimpleDateFormat x1 = new SimpleDateFormat(format);
        String x2 = x1.format(x);
        // 首先，format可以在外部调用方法的时候直接定义，设置的时候更方便
        // 其次，这里各种参数出错
        // 一定要记得，format的是Date类型的对象
        // 可以理解为，format是按照格式，对拿到的date执行一次重构
        // parse不同，相当于把string对象，变成date对象
        return x2;
    }

    public static Date stringtodate(String x, String format) throws ParseException {
        SimpleDateFormat x1 = new SimpleDateFormat(format);
        Date x2 = x1.parse(x);
        return x2;
    }
}
