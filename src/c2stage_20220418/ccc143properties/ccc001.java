package c2stage_20220418.ccc143properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220418.ccc143properties
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-21-38  星期二
 */
public class ccc001 {
    public static void main(String[] args) throws IOException {
        Properties x = new Properties();
        x.put("demo", "demo");// 因为是map家族的，所以直接使用put也可以，
        x.setProperty("ceshi", "123");//setproperties的底层也是put，但是使用特殊的api，显得专业
        x.setProperty("ceshi2", "222");
        x.setProperty("ceshi2", "222");
        x.setProperty("ceshi2", "222");
        System.out.println(x);// {ceshi=123, ceshi2=222, demo=demo}
        x.store(new FileWriter("src/c2stage_20220418/ccc143properties/ccc001.properties"), "我是配置文件，give me 100RMB");
        // 资源会被自动关闭，不需要手动设置
        // #Tue Apr 19 21:45:03 CST 2022内部会自动设置创建时间，
        // 如果每次都是写入，那么时间会自动更新
    }
}
