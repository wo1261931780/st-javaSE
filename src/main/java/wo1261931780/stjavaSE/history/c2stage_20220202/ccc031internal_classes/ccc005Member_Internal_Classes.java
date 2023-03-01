package wo1261931780.stjavaSE.history.c2stage_20220202.ccc031internal_classes;

public class ccc005Member_Internal_Classes {
    private int age = 22;
    private int ceshi = 11;
    // 注意一下，使用getset暴露接口的时候，
    // 上面的锁，就表示了是否可以外部访问

    /**
     * 解决办法是使用内部类的新建方法，
     */
    public void find() {
        //但是新建出来的对象是否能重复？
        inside x1 = new inside();
        x1.show();
    }

    //    public class inside{
    //        public void show(){
    //            System.out.println(age);
    //        }
    //    }
    public class ceshi1 {// 这就是成员内部类

        // 成员内部类，是外部类的一个对象
        // 比如ccc031 x=new ccc031();
        // 成员内部类是类似上面的这种存在
        public void show() {
            System.out.println(ceshi);
        }
    }

    /**
     * 一般直接使用private修饰，导致无法常规访问
     */
    private class inside {
        public void show() {
            System.out.println(age);
        }
    }




}
