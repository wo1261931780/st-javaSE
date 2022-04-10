package c2stage_20220410.ccc121file_recusion_case;

public class eee055Çó½×³Ë {
    public static void main(String[] args) {
        System.out.println("ÇóºÍ");
        int xx = f(5);
        System.out.println(xx);

    }

    public static int f(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x * f(x - 1);
        }
    }
}
