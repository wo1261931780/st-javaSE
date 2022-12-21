package ab_history_20211002.bbb028Stringuild相关;

/**
 * 需求：
 * 定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出结果。
 * 例如，数组为 int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3]
 * 思路：
 * 1:定义一个 int 类型的数组，用静态初始化完成数组元素的初始化
 * 2:定义一个方法，用于把 int 数组中的数据按照指定格式拼接成一个字符串返回。
 * 返回值类型 String，参数列表 int[] arr
 * 3:在方法中遍历数组，按照要求进行拼接
 * 4:调用方法，用一个变量接收结果
 * 5:输出结果
 */
public class bbb029 {
    /**
     * 这里没有做类的带参构造，只是在类的内部，增加了一个xh方法来完成功能
     */
    public void xh(int[] xx) {
        System.out.print("[");
        for (int x = 0; x < xx.length; x++) {
            String x1 = "";
            //字符串原来可以这样拼接
            x1 += xx[x];
            if (x < xx.length - 1) {
                System.out.print(x1 + ",");
            } else {
                System.out.print(x1 + "]");
            }
        }
    }
}
