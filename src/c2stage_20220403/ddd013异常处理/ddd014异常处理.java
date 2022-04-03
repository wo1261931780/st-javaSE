package c2stage_20220403.ddd013异常处理;

public class ddd014异常处理 {
    public static void main(String[] args) {

        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    public static void method() {
        try {
            int[] x = {1, 1, 2};
            System.out.println(x[3]);
        } catch (ArrayIndexOutOfBoundsException x) {
            System.out.println("错误代码ArrayIndexOutOfBoundsException");
            x.printStackTrace();
            // 上面这个代码，会展示jvm中的错误，可以用来作为替代
        }
        // 在不设置异常处理的情况下，
        // 程序会在出现异常后，自动停止
        // try {
        // }catch (){}
        // 上面的结构，相当于使用命令，跳过/替换了错误代码
        // -------------------------------------------------
        // 具体结构如下：
        // try {
        // 出现错误的代码
        // }catch (错误原因 出现错误的变量){给出的提示}
        // -------------------------------------------------
        // 上面的执行流程应该是：
        // try {
        // 出现错误的代码--------------//new 错误原因
        // }catch (错误原因 出现错误的变量){给出的提示}
        // 整体是：
        // 错误原因 错误变量 = new 错误原因;
        // -------------------------------------------------


    }
}
