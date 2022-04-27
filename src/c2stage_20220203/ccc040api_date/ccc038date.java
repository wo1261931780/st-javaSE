package c2stage_20220203.ccc040api_date;
/*
    public Date()：分配一个 Date对象，并初始化，以便它代表它被分配的时间，精确到毫秒
    public Date(long date)：分配一个 Date对象，并将其初始化为表示从标准基准时间起指定的毫秒数
 */

import java.util.Date;

public class ccc038date {
    public static void main(String[] args) {
        Date x = new Date();
        // 使用date的构造方法，
        // 构造方法的普遍格式是一个地址数据
        // 这里tostring方法进行了一次重写操作
        // 输出结果为：
        // Mon May 10 15:49:00 CST 2021
        System.out.println(x);
        // -------------------------------------------------
        // -------------------------------------------------
        // -------------------------------------------------
        // 不同于上面的新建一个date对象，指向现在的时间
        // 这里是先指定一个long类型的数据，给出具体的毫秒数据
        // 然后根据毫秒数据，计算得到，从1970年标准时间往后的具体时间
        long x1 = 1564651 * 56 * 461 * 354635 * 5;
        Date x2 = new Date(x1);
        // 最终得到结果为：
        // Tue Jan 20 07:00:41 CST 1970
        // 表示从标准时间，切换时区，加上时间差的时间结果
        // 其实，这里可以理解为，一个带参构造所得出的结果
        System.out.println(x2);
    }
}
