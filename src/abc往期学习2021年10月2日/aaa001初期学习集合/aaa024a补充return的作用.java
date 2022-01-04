package abc往期学习2021年10月2日.aaa001初期学习集合;

public class aaa024a补充return的作用 {
    public static void main(String[] args) {
        show(1, 2);
        System.out.println("end");
    }

    public static void show(int a, int b) {
        if (a == 0) {
            System.out.println("error");
            return;
            // 这里直接结束，后续的sout不执行，
            // 具体表现，上面直接出现end
        }
        int i = a / b;
        System.out.println(i);
    }
}
