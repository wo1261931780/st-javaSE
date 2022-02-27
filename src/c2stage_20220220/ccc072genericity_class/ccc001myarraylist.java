package c2stage_20220220.ccc072genericity_class;

import java.util.ArrayList;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220220.ccc072genericity_case2
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-23-17  星期六
 */
public class ccc001myarraylist<E> {// 泛型在类名后面加上标记符
    private ArrayList x = new ArrayList();// 相当于内部做了一个list

    public void add(E e) {
        x.add(e);// 泛型类的调用，本质上还是用ArrayList的方法
    }

    public void remove(E e) {
        x.remove(e);
    }

    // 不同之处在于，
    // 按照泛型的规则，我可以自定义tostring方法


    @Override
    public String toString() {
        // return "ccc001myarraylist{" +
        //         "x=" + x +
        //         '}';
        return x.toString();
    }
}
