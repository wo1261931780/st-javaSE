package c2stage_20220403.ccc109exception_define;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220403.ccc109exception_define
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-13-37  星期一
 */

/**
 * 目标:自定义异常(了解)
 * <p>
 * 引入:Java已经为开发中可能出现的异常都设计了一个类来代表.
 * 但是实际开发中,异常可能有无数种情况,Java无法为
 * 这个世界上所有的异常都定义一个代表类。
 * 假如一个企业如果想为自己认为的某种业务问题定义成一个异常
 * 就需要自己来自定义异常类.
 * <p>
 * 需求：认为年龄小于0岁，大于200岁就是一个异常。
 * <p>
 * 自定义异常:
 * 自定义编译时异常.
 * a.定义一个异常类继承Exception.
 * b.重写构造器。
 * c.在出现异常的地方用throw new 自定义对象抛出!
 * 编译时异常是编译阶段就报错，提醒更加强烈，一定需要处理！！
 * <p>
 * 自定义运行时异常.
 * a.定义一个异常类继承RuntimeException.
 * b.重写构造器。
 * c.在出现异常的地方用throw new 自定义对象抛出!
 * 提醒不强烈，编译阶段不报错！！运行时才可能出现！！
 */
public class ccc001exception extends Exception {//编译时异常

    public ccc001exception() {
    }

    public ccc001exception(String message) {
        super(message);
    }
    // 所有的自定义异常，都需要创建异常类
    // 并且继承Exception类
    // 然后在抛出对象的时候，才能进行已定义异常的调用
}
