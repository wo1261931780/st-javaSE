package c2stage_20220113.ccc015Permission_modifiers;

import c2stage_20220113.ccc015Permission_modifiers.ccc013demo;

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
