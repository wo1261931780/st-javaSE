package wo1261931780.stjavaSE.history.c2stage_20220220.ccc075genericity_tp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220220.ccc075genericity_tp
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-11-23  星期六
 * 个人联系案例
 */
public class demo {
    public static void main(String[] args) {
        List<ccc002BMW> x = new ArrayList<>();
        x.add(new ccc002BMW());
        x.add(new ccc002BMW());
        x.add(new ccc002BMW());
        List<ccc003BENZ> x1 = new ArrayList<>();
        x1.add(new ccc003BENZ());
        x1.add(new ccc003BENZ());
        x1.add(new ccc003BENZ());
        Iterator<ccc002BMW> demo1 = x.iterator();
        Iterator<ccc003BENZ> demo2 = x1.iterator();
        for (int i = 0; i < x.size(); i++) {
            System.out.println(demo1.next());
        }
        System.out.println("while循环----------------------------");
        while (demo1.hasNext()) {
            System.out.println(demo1.next());
        }
    }

    public static void show(List<? extends ccc002BMW> x) {
        Iterator<? extends ccc002BMW> demo = x.iterator();
        while (demo.hasNext()) {
            System.out.println(demo.next());
        }
    }

    public static void show2(List<? extends ccc003BENZ> x) {
        x.forEach(new Consumer<ccc003BENZ>() {
            @Override
            public void accept(ccc003BENZ s) {
                System.out.println(s);
            }
        });
        x.forEach(s -> System.out.println(s));
        x.forEach(System.out::println);// 直接soutc就可以使用lambda表达式去写
    }
}
