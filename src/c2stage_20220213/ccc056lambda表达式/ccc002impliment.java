package c2stage_20220213.ccc056lambda表达式;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220213.ccc056lambda表达式
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-20-36  星期五
 */
public class ccc002impliment {
    public static void main(String[] args) {
        ccc001demo_interface x = new ccc001demo_interface() {
            @Override
            public void show() {
                System.out.println("show");
            }
        };
        // 正因为接口内部只有一个方法，所以可以认定匿名内部类的重写形式完全相同
        // 同时，代码简化也能够被java理解
        ccc001demo_interface x1 = () -> {//括号内就是形参
            System.out.println("show");
        };
        // 前面我们说过，匿名内部类本身就是一个对象
        // 因此，可以直接调用匿名内部类来进一步简化
        run(() -> {
            System.out.println("进一步的简化形式");
        });
    }

    public static void run(ccc001demo_interface x) {
        x.show();
        System.out.println("我是方法");
    }
}
