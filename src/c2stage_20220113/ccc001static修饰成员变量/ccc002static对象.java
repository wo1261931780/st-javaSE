package c2stage_20220113.ccc001static修饰成员变量;

public class ccc002static对象 {
    public static void main(String[] args) {
        ccc001static属性 x = new ccc001static属性();//访问实例成员变量，前提是新建了对象
        System.out.println(x.age);//访问实例成员变量，对象.变量名
        System.out.println(x.name);
        // x.comef = "111";//访问静态成员变量
        // 对于静态成员，不建议直接访问（但是也可以），同时进行赋值操作
        // 往往赋值，采用：类名.静态成员变量=xxx...
        // 首先设置类名，然后设置静态变量名，再设置赋值操作
        ccc001static属性.comef = "000";//类名.静态成员变量

        System.out.println(x.comef);//对象名.静态成员变量，不推荐
        System.out.println(ccc001static属性.comef);//类名.静态成员变量，推荐
        //因为静态成员变量是对象类中所有成员共享的，所以所有成员可以直接访问
        //但是我们推荐直接类名访问，比较规范

    }
}
