package wo1261931780.stjavaSE.history.c2stage_20220202.ccc032Local_Internal_Classes;

public class ccc033局部内部类 {
    private int xx = 10;

    public void eat() {

        // 方法中的类，局部内部类

        class some {
            // 成员内部类是类中间有方法，
            // 局部内部类是方法中间有类，类中还可以继续创建方法

            // 因为局部内部类存在于方法中，所以调用更深层的方法也需要创建新对象
            public void show() {
                System.out.println("show inside stuff");
            }
        }
        some ss = new some();
        // 调用类中的方法，必须在类中创建对象，
        // 而创建对象的操作必须位于方法内部，类的外面
        ss.show();
    }
}
