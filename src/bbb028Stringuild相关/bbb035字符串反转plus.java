package bbb028Stringuild相关;
import java.util.Scanner;
public class bbb035字符串反转plus {
    public static void main(String[] args) {
        Scanner xx=new Scanner(System.in);
        System.out.println("请输入字符串：");
        String x2=xx.nextLine();
        String z=fz(x2);
        //接收结果一定要有，不然无法执行后面的sout语句。
        System.out.println(z);
    }
    public static String fz(String x){
//        StringBuilder x1=new StringBuilder(x);
//        x1.reverse();
//        x=x1.toString();
//        return x;
        //下面是函数式编程
        return new StringBuilder(x).reverse().toString();
    }
}
