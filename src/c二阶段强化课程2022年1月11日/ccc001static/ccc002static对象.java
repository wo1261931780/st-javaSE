package c二阶段强化课程2022年1月11日.ccc001static;

public class ccc002static对象 {
    public static void main(String[] args) {
        ccc001static属性 x = new ccc001static属性();
        System.out.println(x.age);
        System.out.println(x.name);
        // x.comef = "111";
        // 对于静态成员，不建议直接访问（但是也可以），同时进行赋值操作
        // 往往赋值，采用下面的格式进行
        // 首先设置类名，然后设置静态变量名，再设置赋值操作
        ccc001static属性.comef = "000";//类名.静态成员变量
        //上面是比较推荐的访问方式
        System.out.println(x.comef);//对象名.成员变量
        System.out.println(ccc001static属性.comef);//类名.成员变量
        //因为静态成员变量是对象类中，所有成员都可以共享的，所以所有成员可以直接访问
        //但是我们推荐直接类名访问，比较规范

    }
}
