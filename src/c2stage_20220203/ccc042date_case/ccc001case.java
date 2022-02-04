package c2stage_20220203.ccc042date_case;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ccc001case {
    public static void main(String[] args) throws ParseException {
        String x = "2022年2月4日21:05:33";
        long st_time = show_time(x);
        String x2 = "2022年2月4日21:15:33";
        long end_time = show_time(x2);

        String s1 = "2022年2月4日21:06:26";
        long p1 = show_time(s1);
        winlose(p1, st_time, end_time);
        // System.out.println(winlose(p1, st_time, end_time));
        String s2 = "2022年2月4日21:15:44";
        long p2 = show_time(s2);
        winlose(p2, st_time, end_time);
        // System.out.println(winlose(p2, st_time, end_time));
    }


    public static boolean winlose(long xx, long st_time, long end_time) {
        if (xx > st_time && xx < end_time) {
            System.out.println("成功");
            return true;
        } else {
            System.out.println("失败");
            return false;
        }
    }

    public static long show_time(String xx) throws ParseException {
        SimpleDateFormat f1 = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        Date m1 = f1.parse(xx);
        long m1s = m1.getTime();
        return m1s;
    }
}
