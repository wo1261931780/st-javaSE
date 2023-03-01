package wo1261931780.stjavaSE.history.c2stage_20220403.ccc106by_exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220403.ccc106by_exceptions
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-19-22  星期日
 */
public class ccc002exceptions {
    public static void main(String[] args) throws ParseException {
        String x = "2022年4月3日";
        show(x);
    }

    public static void show(String x) throws ParseException {
        SimpleDateFormat x1 = new SimpleDateFormat("yyyy年MM月dd日");
        x1.parse(x);
        System.out.println(x1);
        // 抛出异常，并没有解决，只是将问题暂时搁置
        // 如果后面碰到异常情况，最终还是会引发程序死亡
        // 上面的异常抛出，可能存在多个，但是最后还是要看谁先出现
        // 比如异常123，全部在上面抛出，编译阶段通过
        // 但是在运行期间，2号异常抛出，程序死亡，
        // 最终只会出现2号异常，因为程序死亡，3号异常没有出现的机会
    }
}
