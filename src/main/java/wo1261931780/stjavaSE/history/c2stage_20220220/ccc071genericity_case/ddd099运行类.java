package c2stage_20220220.ccc071genericity_case;

public class ddd099运行类 {
    public static void main(String[] args) {
        ddd097学生类 x1 = new ddd097学生类();
        x1.setName("a1");
        ddd098老师类 x2 = new ddd098老师类();
        x2.setAge(11);
        System.out.println(x1.getName() + "--" + x2.getAge());
        // 上述的两种方法必须指定数据类型，否则报错
        ddd100泛型测试<Object> xx = new ddd100泛型测试<>();
        // 上面指定类型以后，在set方法中，会自动设置类型
        // 泛型的好处在于，可以指定需要类型后，再进行创建
        // 避免固定类型的数据发生报错
        // 不过这里的指定类型，也必须是创建对象的时候给出，
        // 比如我指定string类，那么后续set/get都是string类
        xx.setT("a");
        System.out.println(xx.getT());
        ddd100泛型测试<Object> xx1 = new ddd100泛型测试<>();
        xx1.setT(11);
        System.out.println(xx1.getT());
        System.out.println("结束--------------------");
    }
}
