package c2stage_20220331.ccc001stream_case;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220331.ccc001stream_case
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-21-12  星期四
 */
public class ccc002rundemo {
    public static int money;//在main方法之前加载，作为全局变量

    public static void main(String[] args) {
        List<ccc001object> x1 = new ArrayList<>();
        List<ccc001object> x2 = new ArrayList<>();
        x1.add(new ccc001object("a1", 33245, "y", 1));
        x1.add(new ccc001object("a2", 8855, "y", 1));
        x1.add(new ccc001object("a3", 321, "n", 1));
        x1.add(new ccc001object("a4", 987, "n", 1));
        x2.add(new ccc001object("b4", 321, "n", 1));
        x2.add(new ccc001object("b5", 789, "n", 1));
        x2.add(new ccc001object("b1", 654, "n", 1));
        x2.add(new ccc001object("b2", 32161, "n", 1));
        x2.add(new ccc001object("b3", 215, "y", 1));
        show1(x1);
        show1(x2);
        Stream<ccc001object> x3 = Stream.concat(x1.stream(), x2.stream());
        x3.forEach(s -> System.out.println("姓名：" + s.getName() + "--" + s.getProfit()));
        // 得到的结果是x1的数据+x2的数据
        // 这里相当于把内部所有的数据按照顺序合并起来，然后根据条件进行输出
    }

    public static void show1(List<ccc001object> x1) {
        ccc003top_employee demop = x1.stream().max((a1, a2) -> a1.getProfit() - a2.getProfit()).map(s -> new ccc003top_employee(s.getName(), s.getProfit())).get();
        // 解释一下上面这行代码：
        // 1.首先我调用max方法，内部新建一个比较器，比较内容就是profit
        // 2.调用map方法，将其封装为一个employee对象，封装的内容就是薪水和姓名
        // 3.调用get方法，以对象的形式去获得结果
        System.out.println(demop);

        x1.stream().sorted((a1, a2) -> a1.getProfit() - a2.getProfit()).skip(1).limit(x1.size() - 2).forEach(s -> {
            money += s.getProfit();
        });
        // 解释一下这里的代码
        // 首先调用sorted方法，进行了一次升序排序
        // 然后跳过一个对象（最大值）
        // 限制长度为2（去掉一个最小值）
        // 接着对所有的元素遍历，因为需要在遍历期间对数据处理
        // 这里就使用{}大括号来写代码

        money /= x1.size() - 2;
        System.out.println(money);
        show2(money, x1.size() - 2);
    }

    public static void show2(int num, int num2) {
        BigDecimal x1 = BigDecimal.valueOf(num);
        BigDecimal x2 = BigDecimal.valueOf(num2);

        BigDecimal result = x1.divide(x2, 2, RoundingMode.HALF_UP);
        // 大数据方法，处理精度问题
        System.out.println("处理精度的结果：" + result);
    }

}
