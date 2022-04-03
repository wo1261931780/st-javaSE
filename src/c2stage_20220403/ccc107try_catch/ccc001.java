package c2stage_20220403.ccc107try_catch;

import java.text.SimpleDateFormat;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220403.ccc107try_catch
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-19-31  星期日
 */
public class ccc001 {
    public static void main(String[] args) {
        SimpleDateFormat x1 = new SimpleDateFormat("yyyy年MM月dd");
        try {
            String x = "2022年4月3日";
            x1.parse(x);
            // 一般程序是逐层推进的，多个异常需要抛出的时候，统一放到一个try……catch中间，避免出现后续程序的空指针
            // } catch (ParseException e) {// 这里的拦截，是针对单种异常而言的
            // 换句话说，如果上面的程序，有三个异常，就会出现三个编译错误提示
            // 为了解决三个错误提示，就需要try……catch三次异常的结果
            // e.printStackTrace();
            // } catch (ParseException|xxx e) {
            // 企业级写法：
            // 直接抛出异常的父类exceptions
        } catch (Exception e) {
            System.out.println("exceptions");
        }


    }
}
