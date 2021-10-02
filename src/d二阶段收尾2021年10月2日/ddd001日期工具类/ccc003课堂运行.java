package d二阶段收尾2021年10月2日.ddd001日期工具类;

import javax.sound.midi.Soundbank;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class ccc003课堂运行 {
    public static void main(String[] args) throws ParseException {
        Scanner x = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String x1 = x.nextLine();
        Date x2 = new Date();
        String x3 = ccc002课堂写法.Datetostring(x2, "yyyy-MM-dd-HH-mm-ss");
        System.out.println(x3);
        // System.out.println("请输入字符串：");
        // String x2 = x.nextLine();
        Date x4 = ccc002课堂写法.stringtodate(x1, "yyyy-MM-dd-HH-mm-ss");
        System.out.println(x4);

    }
}
