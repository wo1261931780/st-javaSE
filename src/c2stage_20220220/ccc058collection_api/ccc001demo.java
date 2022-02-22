package c2stage_20220220.ccc058collection_api;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220220.ccc058collection_api
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-21-09  星期二
 */
public class ccc001demo {
    public static void main(String[] args) {
        Collection<String> x=new ArrayList<>();
        x.add("a");
        x.add("b");
        x.add("c");
        x.add("demo");
        x.add("java");
        System.out.println(x);
        System.out.println("是否为空："+x.isEmpty());
        Object[] x1=x.toArray();//转换为数组,返回的是Object类型，
        // 但是不能直接转换为String类型，因为会报错，
        // 中途可以添加int类型的数据，如果直接转化，会报错


    }
}
