package c2stage_20220203.ccc040api_date;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class ddd003课堂运行 {
    public static void main(String[] args) throws ParseException {
        Scanner x = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String x1 = x.nextLine();
        Date x2 = new Date();
        String x3 = ddd002课堂写法.Datetostring(x2, "yyyy-MM-dd-HH-mm-ss");
        System.out.println(x3);
        // System.out.println("请输入字符串：");
        // String x2 = x.nextLine();
        Date x4 = ddd002课堂写法.stringtodate(x1, "yyyy-MM-dd-HH-mm-ss");
        System.out.println(x4);

    }
}
