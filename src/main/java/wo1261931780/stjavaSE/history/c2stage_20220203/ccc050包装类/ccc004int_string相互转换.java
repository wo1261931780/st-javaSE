package wo1261931780.stjavaSE.history.c2stage_20220203.ccc050包装类;

public class ccc004int_string相互转换 {
    public static void main(String[] args) {
        int xx = 10;
        // 这里的所有操作也必须是在完全数字的情况下进行
        // int类型转化为string类型
        // 先定义为string
        String x1 = String.valueOf(xx);
        System.out.println(xx);
        System.out.println("----------------");

        String s = "200";
        // 转化为integer
        Integer s1 = Integer.valueOf(s);
        // 然后变成int
        int s2 = s1.intValue();
        System.out.println(s2);
        System.out.println("----------------");

        // 这里调用方法直接变成int
        int w = Integer.parseInt(s);
        System.out.println(w);
    }
}
