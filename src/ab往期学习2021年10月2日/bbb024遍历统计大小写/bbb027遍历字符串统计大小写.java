package ab往期学习2021年10月2日.bbb024遍历统计大小写;

import java.util.Scanner;

public class bbb027遍历字符串统计大小写 {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        System.out.println("请输入字符串，大小写和数字不限");
        String x1 = xx.nextLine();
        int z1 = 0;
        int z2 = 0;
        int z3 = 0;
        for (int x = 0; x < x1.length(); x++) {
//            System.out.println("");
            if (x1.charAt(x) > 64 && x1.charAt(x) < 97) {
                //charAt,此方法返回这个字符串的指定索引处的char值。第一个char值的索引为0.
                //比如指定一个字符串x1，然后求x1的x位上的值，
                //因为字符串对应的底层都是具体数字，返回之后就得到了一个数字
                //x1.charAt(x)>'A'&&x1.charAt(x)<'Z'
                //上面的表达更加简单
                System.out.println("第" + (x+1) + "位为大写字母");
                z1++;
            } else if (x1.charAt(x) > 96 && x1.charAt(x) < 123) {
                System.out.println("第" + (x+1) + "位为小写字母");
                z2++;
            } else if (x1.charAt(x) > 47 && x1.charAt(x) < 65) {
                System.out.println("第" + (x+1) + "位为数字");
                z3++;
            }
        }
        System.out.println("遍历结束：大写字母有" + z1 + "个，小写字母有" + z2 + "个，数字有" + z3 + "个。总长度为：" + x1.length());
        System.out.println("字符串总长度为：" + x1.length());

        //下面的功能是输入，然后遍历字符，获取每个字符。
//        Scanner xx=new Scanner(System.in);
//        System.out.println("请输入字符串:");
//        String x1=xx.nextLine();
//        for (int x=0;x<x1.length();x++){
//            System.out.println("字符串"+x1+"在"+x+"处的字符是："+x1.charAt(x));
//            //这里也可以指定x，进而获取字符串的字符。x1.charAt(x).
////            x1.charAt(x);
//        }
//        System.out.println("遍历结束");
    }
}
