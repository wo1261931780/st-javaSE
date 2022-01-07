package abc往期学习2021年10月2日.bbb018string构造方法;

public class bbb001string构造 {
    public static void main(String[] args) {
        char[] xx = {'a', 'b', '测', '试'};
        String s = new String(xx);
        System.out.println(s);
        //结果，ab测试

        byte[] x1 = {97, 98, 99, 65, 66};
        String s2 = new String(x1);
        System.out.println(s2);
        //结果，abcAB


        // 面试题
        // 直接创建字符串和通过new的方式新建对象字符串,
        // 二者得到的结果不同，因为一个是常量池，一个是堆内存的对象
        String q = "aaa";
        String q2 = "aaa";
        System.out.println(q == q2);
        //结果为true
        System.out.println("******************");
        String q3 = new String(x1);
        String q4 = new String(x1);
        System.out.println(q3 == q4);
        //结果为false
    }


}
