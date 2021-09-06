package ccc034基本类型包装;

public class ccc036相互转换 {
    public static void main(String[] args) {
        System.out.println("------------------");
        int xx=10;
        String x1=String.valueOf(xx);//先定义为string
        System.out.println(xx);//然后显示
        System.out.println("----------------");
        String s="200";//这里的所有操作也必须是在完全数字的情况下进行
        Integer s1=Integer.valueOf(s);//转化为integer
        int s2=s1.intValue();//然后变成int
        System.out.println(s2);
        int w=Integer.parseInt(s);//这里调用方法直接变成int
        System.out.println(w);
    }
}
