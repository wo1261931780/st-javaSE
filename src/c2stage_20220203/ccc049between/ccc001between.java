package c2stage_20220203.ccc049between;

import java.time.Duration;
import java.time.LocalDateTime;

public class ccc001between {
    public static void main(String[] args) {
        System.out.println("start");
        LocalDateTime x = LocalDateTime.now();
        System.out.println(x);// 2022-02-06T17:16:46.805553300
        LocalDateTime bd = LocalDateTime.of(1996, 11, 22, 00, 00, 00);
        System.out.println("设定时间：" + bd);// 设定时间：1996-11-22T00:00
        // ****************************************************
        Duration xx = Duration.between(bd, x);
        System.out.println("天数：" + xx.toDays());// 天数：9207
        System.out.println("小时：" + xx.toHours());// 小时：220985
        System.out.println("分钟：" + xx.toMinutes());// 分钟：13259116
        System.out.println("秒数：" + xx.toMillis());// 秒数：795547006805


    }
}
