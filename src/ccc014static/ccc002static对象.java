package ccc014static;

public class ccc002static对象 {
    public static void main(String[] args) {
        ccc001static属性 x = new ccc001static属性();
        System.out.println(x.age);
        System.out.println(x.name);
        // x.comef = "111";
        // 对于静态成员，不建议直接访问（但是也可以），同时进行赋值操作
        // 往往赋值，采用下面的格式进行
        // 首先设置类名，然后设置静态变量名，再设置赋值操作
        ccc001static属性.comef = "000";
        System.out.println(x.comef);
    }
}
