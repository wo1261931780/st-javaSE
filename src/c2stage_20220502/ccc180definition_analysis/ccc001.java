package c2stage_20220502.ccc180definition_analysis;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220502.ccc180definition_analysis
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-19-43  星期一
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD,ElementType.METHOD})
// type就是类
public @interface ccc001 {
    String name();
    double prices();
    String[] authors();
}
