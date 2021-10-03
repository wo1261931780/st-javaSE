package d二阶段收尾2021年10月2日.ddd001日期工具类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ddd001date {
    private ddd001date() {
    }

    public static void main(String[] args) throws ParseException {
        System.out.println("开始运行---------");
        Scanner x = new Scanner(System.in);
        System.out.println("请输入时间(YYYY-MM-dd-HH-mm-ss)");
        String x1 = x.nextLine();
        System.out.println(stringtodate(x1));
        System.out.println("-----------------------------");
        String x2 = datetostring(stringtodate(x1));
        System.out.println(x2);

    }

    public static Date stringtodate(String x) throws ParseException {
        SimpleDateFormat x2 = new SimpleDateFormat("YYYY-MM-dd-HH-mm-ss");
        Date x1 = x2.parse(x);
        // 注意事项：
        // 1.转换必须按照simpledateformat中的格式进行
        // 意味着，输入的时候就必须按照这个格式操作
        // 2.解析的结果，按照标准结果出现
        // 标准格式：
        // Sun Dec 27 11:22:33 CST 1998
        System.out.println("转换结束");
        return x1;
    }

    public static String datetostring(Date x) {
        SimpleDateFormat x1 = new SimpleDateFormat("YYYY-MM-dd-HHmmss");
        String x2 = x1.format(x);
        return x2;
    }

}
