package wo1261931780.stjavaSE.history.c2stage_20220502.ccc179origin_definition;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220502.ccc179origin_definition
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-19-28  星期一
 */

@Target({ElementType.METHOD, ElementType.FIELD,ElementType.TYPE})
// 类似Junit框架，这里标注只能方法和变量中使用，否则报错
// target是标记生效范围的元注解
// 元注解——注解的注解
@Retention(RetentionPolicy.RUNTIME)
// 运行阶段依旧生效，不会消失
public @interface ccc001 {
    String name();
}
