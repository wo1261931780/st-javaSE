package wo1261931780.stjavaSE.history.c2stage_20220220.ccc075genericity_tp;

import java.util.ArrayList;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220220.ccc075genericity_tp
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-12-51  星期日
 */
public class ccc004run {
    public static void main(String[] args) {
        ArrayList<ccc002BMW> x = new ArrayList<>();
        x.add(new ccc002BMW());
        x.add(new ccc002BMW());
        x.add(new ccc002BMW());
        ArrayList<ccc003BENZ> x1 = new ArrayList<>();
        x1.add(new ccc003BENZ());
        x1.add(new ccc003BENZ());
        x1.add(new ccc003BENZ());
        // comp(x1);// 直接使用会报错，因为方法中设置的类型不同
        // 换句话说，方法中的设置，使得调用的时候灵活性下降
        competition(x);
        competition(x1);
    }

    public static void comp(ArrayList<ccc002BMW> x) {
        System.out.println("no");
    }

    public static void competition(ArrayList<?> x) {// 用问号替代，可以提高灵活性
        // 但是会出现问题
        // 比如我默认只有car可以使用该类型，但是来了个dog，没有限制方法，会导致dog也调用了这个功能
        System.out.println("ok");
    }

    public static void comps(ArrayList<? extends ccc001> x) {
        // 使用extends设置上限
        System.out.println("必须是子类才能使用该方法");
    }
}
