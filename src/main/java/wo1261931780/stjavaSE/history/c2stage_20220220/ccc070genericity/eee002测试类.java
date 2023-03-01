package wo1261931780.stjavaSE.history.c2stage_20220220.ccc070genericity;

import c2stage_20220220.ccc070genericity.eee001泛型方法;

public class eee002测试类 {
    public static void main(String[] args) {
        // eee001泛型方法<string> x = new eee001泛型方法();
        // 正常创建对象的时候就需要明确类型
        eee001泛型方法 x = new eee001泛型方法();
        x.show("aaa");
        x.show(true);
        x.show(11);
        // 泛型的好处在于设置对应的参数
        x.show(11.1);
        // 泛型类，实际是指这个类，可使用泛型
    }
}
