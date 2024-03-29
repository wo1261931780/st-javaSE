package wo1261931780.stjavaSE.history.c2stage_20220410.ccc120file_recusion;

/**
 * 递归概述：
 * 以编程的角度来看，递归指的是方法定义中调用方法本身的现象
 * 举例：
 * 老和尚给小和尚讲故事，然后无限套娃
 */
public class eee053递归 {
    public static void main(String[] args) {
        f(20);
        System.out.println(f(20));
        // 6765
        // 不死兔子的繁殖问题，从第三个月开始，每个月兔子数量等于前两个月数量之和
        // 递归的本质在于，
        // 减少了大量重复计算，并将运算过程简化到第一步
        // 需要找到出口，防止内存溢出，
        // 同时，需要找到最简规则
    }

    /**
     * 递归解决问题，首先就是要定义一个方法：
     * 定义一个方法f(n)：表示第n个月的兔子对数
     * 那么，第n-1个月的兔子对数该如何表示呢？f(n-1)
     * 同理，第n-2个月的兔子对数该如何表示呢？f(n-2)
     * StackOverflowError:当堆栈溢出发生时抛出一个应用程序递归太深
     * 递归太深，同时没有设置出口
     * 最终导致内存溢出
     */
    public static int f(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }
}
