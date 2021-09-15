package bbb017默认类和对象;

/**
 * 构造方法：
 * 作用：创建对象
 * <p>
 * 比如public void show(){}
 * 创建对象：show xx=new show();
 * 那么xx就是构造方法中出现的对象
 * ---------------------------------------
 * 功能：完成对象数据的初始化
 * <p>
 * 给出一个数据是x1,没有对x1赋值，那么就会给x1一个默认值
 * 如果是string，默认值null，int，默认值0；
 * ---------------------------------------
 * 格式：
 * 修饰符 类名(参数) {
 * }
 * 修饰符一般用：public
 */
public class bbb017构造方法 {
    private int age;
    private String name;

    /**
     * 如果括号内没有参数，那么就是一个无参构造方法
     */
    public bbb017构造方法() {
        // 这里如果不给出类的构造方法，也会自动生成默认方法
        System.out.println("show------------");
        // 和下面的show方法不同，类名为主的构造方法不需要指定void返回类型
        // 也不需要return返回值
    }

    public void show() {

    }
}
