package c2stage_20220203.ccc041api_simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ccc002parse {
    public static void main(String[] args) throws ParseException {
        String x = "2022年2月4日20:40:48";
        SimpleDateFormat x1 = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        // Date x1=new Date();
        Date x2 = x1.parse(x);//parse表示解析命令，括号内就是需要解析的语句
        //直接使用parse会发生报错，所以一般要抛出异常（添加异常到方法签名）
        //抛出异常，实际上就是避免出现
        System.out.println(x2);//Fri Feb 04 20:40:48 CST 2022
        System.out.println("*******************************************");
        // SimpleDateFormat x3 = new SimpleDateFormat("yyyy年MM月dd+2日 HH时mm分ss秒");
        // String x4 = x3.format(x2);
        Date x3 = new Date();
        // long x4 = x2.getTime() + 1111*1000;//gettime操作，相当于去获取了一次毫秒值，得到以后，方便我们进行计算
        long x4 = x2.getTime() + (2L*24*3600+19*60)*1000;//这里加上L，进行long类型的计算，避免int超限
        x3.setTime(x4);
        System.out.println("最终时间：" + x3);


    }
}
