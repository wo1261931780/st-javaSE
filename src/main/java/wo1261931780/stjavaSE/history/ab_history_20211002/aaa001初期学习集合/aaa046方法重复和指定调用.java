package wo1261931780.stjavaSE.history.ab_history_20211002.aaa001初期学习集合;

// 这里是方法重载的练习，2021年9月9日21:40:19

public class aaa046方法重复和指定调用 {
    public static void main(String[] args) {
        //这里默认调用int，因为整数就是int
        System.out.println(max(10, 20));
        //如果要转换，必须前置强转
        System.out.println(max((byte) 10, (byte) 20));
        System.out.println(max((short) 10, (short) 20));
        //强制转化x1和x2的数据类型
        //10L表示转化int10，到long10，同理可以直接10F
        System.out.println(max(10L, 20L));
        // 以上结果全部为false
        //-------------------------------------------
        System.out.println("-------------------------------------------");
        boolean xx1 = demo1(1, 2);
        System.out.println(xx1);
    }

    /**
     * 创建了四个方法，来比较x1和x2的数值
     * 每个方法定义的x1和x2数据类型不同
     * 为了区分方法，在每个方法内部加入展示语句
     */
    public static boolean max(int x1, int x2) {
        System.out.println("int---------");
        return x1 == x2;
    }

    public static boolean max(byte x1, byte x2) {
        System.out.println("byte---------");
        return x1 == x2;
    }

    public static boolean max(long x1, long x2) {
        System.out.println("long----------");
        return x1 == x2;
    }

    public static boolean max(short x1, short x2) {
        System.out.println("shout---------");
        return x1 == x2;
    }

    /**
     * -------------------------------------------
     */
    public static boolean demo1(int x1, int x2) {

        return x1 == x2;
    }
}
