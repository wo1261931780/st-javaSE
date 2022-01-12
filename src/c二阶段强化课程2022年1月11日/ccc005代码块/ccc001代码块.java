package c二阶段强化课程2022年1月11日.ccc005代码块;

public class ccc001代码块 {

    public static String schoolName;//静态成员变量

    public static void main(String[] args) {
        // 目标：学习静态代码块的特点、基本作用
        System.out.println("=========main方法被执行输出===========");
        System.out.println(schoolName);
    }

    /*
     特点：与类一起加载，自动触发一次，优先执行
     作用：可以在程序加载时进行静态数据的初始化操作（准备内容）
     */
    static {//代码块
        System.out.println("==静态代码块被触发执行==");
        schoolName = "程序员";
    }

    // 最终结果
    //==静态代码块被触发执行==
    // =========main方法被执行输出===========
    // 程序员
    // 说明代码块会比main方法更优先加载出来

}
