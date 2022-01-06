package abc往期学习2021年10月2日.bbb017默认类和对象;

/**
 * 成员变量
 * 使用private修饰
 * 构造方法
 * 提供一个无参构造方法
 * 提供一个带多个参数的构造方法
 * 成员方法
 * 提供每一个成员变量对应的setXxx()/getXxx()
 * 提供一个显示对象信息的show()
 */
public class bbb018b标准类的制作2 {
    public static void main(String[] args) {
        System.out.println("开始------------");
        bbb018a标准类的制作_javabean x1 = new bbb018a标准类的制作_javabean();
        bbb018a标准类的制作_javabean x2 = new bbb018a标准类的制作_javabean(11, "s");
        x1.show1();
        x1.setAge(11);
        x1.setName("x111111");
        x1.show1();
        System.out.println("------------------------");
        x2.show1();
        //这里x2构造的时候已经添加了参数，所以show直接会展示
    }
}
