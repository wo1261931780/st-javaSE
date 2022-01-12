package c二阶段强化课程2022年1月11日.ccc112权限修饰符2;

import c二阶段强化课程2022年1月11日.ccc112权限修饰符.ccc013demo;

/**
 * 这里有一个导包操作，导入ccc013demo的包，然后在里面创建对象
 */
public class ccc014zi2 extends ccc013demo {
    /**
     * 导包后才能使用继承方法，同时，导包后可以访问的对象多了一个3-protect
     * 可以直接按alt+enter导包
     */
    public static void main(String[] args) {
        ccc014zi2 z = new ccc014zi2();
        z.show3();
        z.show4();
    }
}
