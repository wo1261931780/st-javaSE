package c2stage_20220113.ccc014package;

import c二阶段强化课程2022年1月11日.ccc110猫和狗.ccc014animal;
// 一般创建对象操作，在同一个包下，可以直接new出来
// 但是对其它的包进行对象创建，就存在导包的操作
// 上面的导包操作直接进入dog内进行导入。

public class ccc013导包 {
    /**
     * 在不同的包下面进行导包操作，直接把包导入文件
     */
    ccc014animal xx = new ccc014animal();
        /*
        cn.itcast.Teacher t = new cn.itcast.Teacher();
        t.teach();

        cn.itcast.Teacher t2 = new cn.itcast.Teacher();
        t2.teach();
        */
    // 上面的操作，如果没有导包的过程，那么每次创建对象都需要设置一个前缀
    // 导包的操作，实际上减少了指定位置的重复输入

    // java.util.Scanner sc = new java.util.Scanner(System.in);
    // Scanner sc=new Scanner(System.in);
    // 类似上面，通过导入util的包，代码变得更简洁
}
