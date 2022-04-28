package c2stage_20220428.ccc150thread_methods;

import javax.sound.midi.Soundbank;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220428.ccc150thread_methods
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-20-43  星期四
 */
public class ccc001 {
    public static void main(String[] args) {
        ccc002thread x = new ccc002thread();
        // x.setName("thread1---");
        // 实际上可以给线程命名，线程内部也有name的属性，所以可以直接进行get和set
        // 不过底层也会对线程赋值，所以可以直接得到线程的名称
        x.start();
        System.out.println(x.getName());// 已经存在get方法
        // 线程的命名，默认从0-n，
        // 比如我先创建一个线程，线程就是thread-0，后面以此类推
        Thread x1 = Thread.currentThread();// 获取到当前线程对象

        for (int i = 0; i < 5; i++) {
            System.out.println("我是主线程：" + i);
        }
        System.out.println("-------------------------------------------");

        ccc002thread demo = new ccc002thread("initName");// 自带名称进行线程的构造
        demo.start();
    }
}
