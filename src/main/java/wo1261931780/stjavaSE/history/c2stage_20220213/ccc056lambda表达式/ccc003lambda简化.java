package wo1261931780.stjavaSE.history.c2stage_20220213.ccc056lambda表达式;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220213.ccc056lambda表达式
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-22-28  星期五
 */
public class ccc003lambda简化 {
    public static void main(String[] args) {
        ccc001demo_interface x = new ccc001demo_interface() {
            @Override
            public void show() {
                System.out.println("简化1");
            }
        };
        show(x);
        // ******************************************
        ccc001demo_interface x1 = () -> {
            System.out.println("简化2");
        };
        show(x1);
        // ******************************************
        ccc001demo_interface x2 = () -> System.out.println("简化3");
        show(x2);

        // ******************************************
        // ccc001demo_interface x3 = () -> System.out.println("简化4");
        show(() -> System.out.println("简化4"));

    }

    public static void show(ccc001demo_interface x) {
        x.show();
        System.out.println("结束");
    }
}
