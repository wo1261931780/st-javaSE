package d二阶段收尾2021年10月2日.ddd010异常;

/**
 * JVM的默认处理方案
 */
public class ddd012jvm处理方案 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    public static void method() {
        int[] arr = {1, 2, 3};
        //        System.out.println(arr[1]);
        System.out.println(arr[3]);
    }

    // 下面是异常展示，
    // jvm出现问题后，会停止虚拟机运行，
    // ArrayIndexOutOfBoundsException是错误原因
    // Index 3错误位置，java:16行数
    // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    // at d二阶段收尾2021年10月2日.ddd010异常.ddd012jvm处理方案.method(ddd012jvm处理方案.java:16)
    // at d二阶段收尾2021年10月2日.ddd010异常.ddd012jvm处理方案.main(ddd012jvm处理方案.java:9)
}
