package c2stage_20220421.ccc146thread_runnable;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220421.ccc146thread_runnable
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-22-54  星期五
 */
public class ccc002 {
    public static void main(String[] args) {
        // Runnable x = new Runnable() {
        //     @Override
        //     public void run() {
        //         System.out.println("我是匿名内部类");
        //     }
        // };
        // Thread x1=new Thread(x);
        // 本质上，匿名内部类就是一个对象
        // 而我实现类构造的线程，也只是需要一个目标对象而已
        // 因此，我直接将目标对象放到线程中，就可以完成构造过程
        // 上面的方法都太麻烦------------------------------
        Thread x1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是匿名内部类");
            }
            // 主要原因是run方法为void，没有返回值，所以不能拿到结果
            // 简单来说，只有执行的功能
        });
        x1.start();
    }
}
