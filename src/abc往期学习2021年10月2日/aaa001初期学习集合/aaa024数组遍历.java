package abc往期学习2021年10月2日.aaa001初期学习集合;

public class aaa024数组遍历 {
    public static void main(String[] args) {
        int[] xx = {1, 654, 6, 3, 54, 6, 156};
        bl(xx);
    }

    public static void bl(int[] xx) {
        int x = 0;
        System.out.print("[");
        for (System.out.println("开始遍历："); x < xx.length; x++) {
            if (x < xx.length - 1) {
                System.out.print(xx[x] + ",");
            } else {
                System.out.print(xx[x]);
            }
            //return xx[x];
        }
        System.out.println("]");
    }
}
