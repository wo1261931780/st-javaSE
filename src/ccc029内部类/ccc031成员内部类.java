package ccc029内部类;

public class ccc031成员内部类 {
    private int age = 22;
    private int ceshi = 11;

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
    public class ceshi1 {
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
