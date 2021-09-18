package bbb028Stringuild相关;

import java.util.Scanner;

public class bbb031字符串反转 {
    public static void main(String[] args) {
        Scanner zz = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String z1 = zz.nextLine();
        bbb031字符串反转 ff = new bbb031字符串反转();
        ff.fz(z1);
        /*下面是数列实现反转，但是还不够完善
        int[] xx={1,2,3};
        bbb031字符串反转 x1=new bbb031字符串反转();
        x1.fz(xx);*/
    }

    public void fz(String z1) {
        System.out.println(z1);
        //        String s="";
        for (int z = z1.length() - 1; z >= 0; z--) {
            System.out.print(z1.charAt(z) + "-");
            //            s+=z1.charAt(z);
            //            这里官方的方法多了一步自定义变量。
        }
        System.out.println("反转结束");

        /*
        String x2="";
        System.out.print("[");
        for (int x=xx.length-1;x>=0;x--){
            x2+=xx[x];
            System.out.print(xx[x]+",");
            System.out.println("--------");
            if (x==0){
                System.out.print(x2+=xx[x]+"]");
            }else {
                System.out.print(x2+=xx[x]+",");
            }
        }*/
    }
}
