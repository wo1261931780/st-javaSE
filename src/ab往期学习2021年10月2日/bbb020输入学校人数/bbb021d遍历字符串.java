package ab往期学习2021年10月2日.bbb020输入学校人数;


import java.util.Scanner;

public class bbb021d遍历字符串 {
    public static void main(String[] args) {
        // 这里是把方法直接封起来，需要的时候调用即可
        // bl();
        bl2();

    }

    /**
     * 需求：
     * 键盘录入一个字符串，使用程序实现在控制台遍历该字符串
     * 思路：
     * 1:键盘录入一个字符串，用 Scanner 实现
     * 2:遍历字符串，首先要能够获取到字符串中的每一个字符
     * public char charAt?(int index)：返回指定索引处的char值，字符串的索引也是从0开始的
     * <p>
     * charAt() 方法用于返回指定索引处的字符。索引范围为从 0 到 length() - 1。
     * <p>
     * 3:遍历字符串，其次要能够获取到字符串的长度
     * public int length?()：返回此字符串的长度
     * 数组的长度：数组名.length
     * 字符串的长度：字符串对象.length()
     * 4:遍历字符串的通用格式
     */
    public static void bl() {
        // 将输入字符串，遍历，整个方法直接提取出来
        System.out.println("开始遍历");
        Scanner x = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String x1 = x.nextLine();
        for (int i = 0; i < x1.length(); i++) {
            x1.charAt(i);
            // charAt就是获取对应位置上的字符串
            System.out.println(x1.charAt(i));
            // 这里分别输入s和a
        }
    }

    /**
     * 需求：
     * 键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数(不考虑其他字符)
     * 思路：
     * 1:键盘录入一个字符串，用 Scanner 实现
     * 2:要统计三种类型的字符个数，需定义三个统计变量，初始值都为0
     * 3:遍历字符串，得到每一个字符
     * 4:判断该字符属于哪种类型，然后对应类型的统计变量+1
     * 假如ch是一个字符，我要判断它属于大写字母，小写字母，还是数字，直接判断该字符是否在对应的范围即可
     * 大写字母：ch>='A' && ch<='Z'
     * 小写字母： ch>='a' && ch<='z'
     * 数字： ch>='0' && ch<='9'
     * 5:输出三种类型的字符个数
     */
    public static void bl2() {
        System.out.println("遍历，识别大小写");
        Scanner x3 = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String x4 = x3.nextLine();
        for (int i = 0; i < x4.length(); i++) {
            if (x4.charAt(i) > 64 && x4.charAt(i) < 97) {
                System.out.println("大写字符：" + x4.charAt(i));
            } else if (x4.charAt(i) > 96 && x4.charAt(i) < 123) {
                System.out.println("小写字符：" + x4.charAt(i));
            } else if (x4.charAt(i) > 47 && x4.charAt(i) < 65) {
                System.out.println("数字：" + x4.charAt(i));
            } else {
                System.out.println("错误代码");
            }
        }
    }
}
