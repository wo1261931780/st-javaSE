package c2stage_20220404.ccc112log_system2.main.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Intellij IDEA.
 * Project:demo_project
 * Package:PACKAGE_NAME
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-17-39  星期一
 */
public class ccc001log_technology {
    public static final Logger demorun = LoggerFactory.getLogger("demorun.class");//log对象需要调用jar包，这里为了避免调用错误
    // 首先这里要定义为常量，避免被人修改
    // 同时，需要设置好日志对象为类名.class，遵循规范
    // 后续日志中，就会记录出现bug的类名，从而方便定位问题
    // 如果不设置，默认为类名.class

    /**
     * 首先进行创建对象的操作
     * 然后会自动导入slf4j的包
     */
    public static void main(String[] args) {
        try {
            demorun.debug("开始执行：");
            demorun.info("出现info");
            int a = 10;
            int b = 0;
            demorun.trace("trace：" + a);
            demorun.trace("trace：" + b);
            System.out.println(a / b);
        } catch (Exception e) {
            e.printStackTrace();
            demorun.error("出现异常error：" + e);
            // 这里抛出的是异常对象，
            // 我上面异常对象是e，那么error中出现的就是e
        }
        // 这里的debug，info，trace，error都是日志级别
        // 我后期可以根据项目的要求，设定日志的展示级别
    }
}
