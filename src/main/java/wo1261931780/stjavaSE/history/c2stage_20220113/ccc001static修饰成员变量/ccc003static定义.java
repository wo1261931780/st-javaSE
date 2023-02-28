package wo1261931780.stjavaSE.history.c2stage_20220113.ccc001static修饰成员变量;

public class ccc003static定义 {

    /**
     * String college="huawei";
     * static 表示被所有成员变量共享
     * static修饰的变量，赋值一次后可以重复使用，
     * 后续访问该变量，都会展示huawei
     * 举例：
     * 我在类中新建对象，然后对象访问变量college，那么不对college赋值的情况下，
     * college都会展示相同（static静态）属性
     */
    public static String college = "huawei";
    /**
     * 这里修改了权限，后面导包后仍然可以使用
     * int age=10;
     */
    public int age = 10;

    String name = "aaa";

    public void show() {
        System.out.println(name + "," + age + "," + college);
    }
}
