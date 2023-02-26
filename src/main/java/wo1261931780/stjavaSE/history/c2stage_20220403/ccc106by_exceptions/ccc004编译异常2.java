package c2stage_20220403.ccc106by_exceptions;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220403.ccc106by_exceptions
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-22-26  星期三
 */

/**
 * 目标：编译时异常的处理方式二。
 * <p>
 * 方式二：在出现异常的地方自己处理，谁出现谁处理。
 * <p>
 * 自己捕获异常和处理异常的格式：捕获处理
 * try{
 * // 监视可能出现异常的代码！
 * }catch(异常类型1 变量){
 * // 处理异常
 * }catch(异常类型2 变量){
 * // 处理异常
 * }...
 * <p>
 * 监视捕获处理异常企业级写法：
 * try{
 * // 可能出现异常的代码！
 * }catch (Exception e){
 * e.printStackTrace(); // 直接打印异常栈信息
 * }
 * Exception可以捕获处理一切异常类型！
 * <p>
 * 小结：
 * 第二种方式，可以处理异常，并且出现异常后代码也不会死亡。
 * 这种方案还是可以的。
 * 但是从理论上来说，这种方式不是最好的，上层调用者不能直接知道底层的执行情况！
 */
public class ccc004编译异常2 {
    public static void main(String[] args) {
        System.out.println("程序开始。。。。");
        parseTime("2011-11-11 11:11:11");
        System.out.println("程序结束。。。。");
    }

    public static void parseTime(String date) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM-dd HH:mm:ss");
            Date d = sdf.parse(date);
            System.out.println(d);

            InputStream is = new FileInputStream("E:/meinv.jpg");
        } catch (Exception e) {
            e.printStackTrace(); // 打印异常栈信息
        }
    }
}
