package c2stage_20220502.ccc180definition_analysis;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220502.ccc180definition_analysis
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-19-45  星期一
 */
@ccc001(name = "123", prices = 123.23, authors = {"11", "22"})
public class ccc002 {
    @Test
    public void show() {
        Class<ccc003> x = ccc003.class;
        if (x.isAnnotationPresent(ccc001.class)) {// 判断注解是否存在
            ccc001 demo = x.getDeclaredAnnotation(ccc001.class);
            // 反射类，找到对应的内部字段
            System.out.println(demo.name());
            System.out.println(demo.prices());
            System.out.println(Arrays.toString(demo.authors()));
        }
    }
}
