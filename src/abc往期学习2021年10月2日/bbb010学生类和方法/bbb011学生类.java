package abc往期学习2021年10月2日.bbb010学生类和方法;

public class bbb011学生类 {//一个class就是一个类。
    /**
     * 类的名称可以自己定义，但是最好英文，同时因为是另一个class中的，所以要说清楚。
     * 成员变量，直接理解为变量就可以了
     */
    String name;
    /**
     * 直接理解成变量。
     */
    int age;
    /**
     * public static void main(String[] args) {
     * 这个变量在方法外，但是又在class类中，所以是成员变量。
     */
    int cy;

    /**
     * }
     * 方法，使用就是对象x，后面加上方法study。
     */
    public void study() {
        System.out.println("study");
    }

    public void showdemo() {
        //这个变量在方法中，就是局部变量
        int jb;
        System.out.println("do sth.");
    }

    /**
     * 成员变量在堆内存中。
     * 有默认值
     * 这个nn就是形式参数，nn所在的括号，就是方法声明的位置。
     */
    public void xc(int nn) {
        //调用方法的时候xc（10），这个10就是实际参数。
        System.out.println("nothing");
        //我们认为，mm和nn都是局部变量，因为都在方法内部。
        int mm;
    }
    //局部变量，在栈内存中。
    //没有默认值，必须向定义才能使用，方法一旦使用完，变量会消失。
}
