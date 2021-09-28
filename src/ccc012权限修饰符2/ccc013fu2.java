package ccc012权限修饰符2;

import ccc012权限修饰符.ccc013demo;

/**
 * 这里有一个导包操作，导入ccc013demo的包，然后在里面创建对象
 */
public class ccc013fu2 {
    public static void main(String[] args) {
        ccc013demo f = new ccc013demo();
        f.show4();
        //这里就只能使用4-public的方法
    }
}
