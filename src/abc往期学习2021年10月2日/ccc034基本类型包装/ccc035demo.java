package abc往期学习2021年10月2日.ccc034基本类型包装;

public class ccc035demo {
    public static void main(String[] args) {
        // 判断数据是否在int范围内
        // public static final int MIN_VALUE
        // 持有最小值的常数为 int可以为-2的31次方
        // 转换基本数据类型，int到string

        // static，静态修饰，可以通过类名直接访问
        // 这里使用的是数字类型的字符串，只能用100，111这种，不能直接用"aaaa"这种
        // 因为方法已经过时，被value of替代，所以不推荐使用
        Integer x = new Integer("100");
        System.out.println("x的数据为：" + x);
        // 上面使用的是new出来的x，以往情况，我们都认为这是构造方法，
        // 直接打印构造出来的对象只会得到对象的地址

        Integer xx = new Integer(200);
        // 同理，这里可以直接输入数字
        System.out.println("xx的数据为：" + xx);
        // 上面两个输出命令，都是直接展示数据，即使是字符串，也是以数字形式展示
        // -----------------------------------
        // -----------------------------------
        // -----------------------------------
        Integer x1 = Integer.valueOf("300");
        // 包装x1的int数值
        System.out.println("x1的数据为：" + x1);
        Integer x2 = Integer.valueOf("444");
        System.out.println("x2的数据为：" + x2);
        // Integer x3=Integer.valueOf("a");//无法输入字母,也无法数字字母混合
        // System.out.println(x3);
    }
}
